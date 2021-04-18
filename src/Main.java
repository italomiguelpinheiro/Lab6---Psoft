
import controller.PessoaController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static PessoaController pessoaFacade = new PessoaController();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            exibirSistema();
            int opcao = sc.nextInt();
            sc.nextLine();

        

            if (opcao == 1) {
                cadastrarPessoa(sc);
                continue;
            }

            else if (opcao == 2) {
                updatePessoa(sc);
                continue;
            }

            else if (opcao == 3) {
                getPessoa(sc);
                continue;
            }

            else if (opcao == 4) {
                getSituacao(sc);
                continue;
            }

            else if (opcao == 5){
                alterarSituacao(sc);
                continue;
            }

            else {
                break;
            }
        }
    }


    private static void exibirSistema() {
        System.out.println("Sistema de Vacinacao:\n" + 
                "[1] Cadastrar Pessoa\n"  +
                "[2] Atualizar Pessoa\n"  +
                "[3] Buscar Pessoa\n"  +
                "[4] Mostrar situacao da Pessoa\n"  +
                "[5] Alterar situacao da Pessoa\n" +
                "[6] Finalizar programa");

    }


    private static void cadastrarPessoa(Scanner sc) {
        System.out.println("\nInforme o(a)...");
        System.out.println("1. Nome completo");
        String nomeCompleto = sc.nextLine();

        System.out.println("2. Cpf");
        String cpf = sc.nextLine();

        System.out.println("3. Endereco");
        String endereco = sc.nextLine();

        System.out.println("4. Cartao do SUS");
        String cartaoSus = sc.nextLine();

        System.out.println("5. Email");
        String email = sc.nextLine();

        System.out.println("6. Telefone ");
        String telefone = sc.nextLine();

        System.out.println("7. Profissão");
        String profissao = sc.nextLine();

        List<String> cormobidades = obterCormobidates(sc);

        int situacao = obterSitucao(sc);

        String p = pessoaFacade.cadastrarPessoa(cpf, nomeCompleto, endereco,cartaoSus,
                email, telefone, profissao, cormobidades, situacao);

        System.out.println(p);
    }

    private static void updatePessoa(Scanner sc) {
        System.out.println("1. Informe o cpf");
        String cpf = sc.nextLine();

        System.out.println("2. Nome completo");
        String nomeCompleto = sc.nextLine();

        System.out.println("3. Endereco");
        String endereco = sc.nextLine();

        System.out.println("4. Cartao do SUS");
        String cartaoSus = sc.nextLine();

        System.out.println("5. Email");
        String email = sc.nextLine();

        System.out.println("6. Telefone ");
        String telefone = sc.nextLine();

        System.out.println("7. Profissão");
        String profissao = sc.nextLine();

        List<String> cormobidates = obterCormobidates(sc);

        int situacao = obterSitucao(sc);

        String resultado = pessoaFacade.updatePessoa(cpf, nomeCompleto, endereco,cartaoSus,
                email, telefone, profissao, cormobidates, situacao);

        System.out.println(resultado);
    }





    private static List<String> obterCormobidates(Scanner sc) {
        System.out.println("\nComorbidades: ");
        List<String> cormobidades = new ArrayList<>();

        int opcao = -1;

        while (true) {
            System.out.println("[1] Adicionar cormobidade");
            System.out.println("[0] Finalizar");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Cormobidade: ");
                String cormobidade = sc.nextLine();
                cormobidades.add(cormobidade);
            } else  {
                break;
            } 
        }

        return cormobidades;
    }


    private static int obterSitucao(Scanner sc) {
        int opcao = -1;
        while (opcao < 1 || opcao > 5) {
            System.out.println("\nSitucação inicial:");
            System.out.println("[1] Nao habilitado para vacina");
            System.out.println("[2] Habilitado para tomar a 1 dose");
            System.out.println("[3] Tomou a 1 dose");
            System.out.println("[4] Habilitada para tomar a 2 dose");
            System.out.println("[5] Finalizada vacinacao");
            opcao = sc.nextInt();
            sc.nextLine();
        }

        return opcao;
    }

    private static void getPessoa(Scanner sc) {
        System.out.println("Informe o CPF");
        String cpf = sc.nextLine();
        String resultdadoBusca = pessoaFacade.getPessoa(cpf);
        System.out.println(resultdadoBusca);
    }


    private static void getSituacao(Scanner sc) {
        System.out.println("Informe o CPF");
        String cpf = sc.nextLine();
        String resultdadoBusca = pessoaFacade.getSituacao(cpf);
        System.out.println(resultdadoBusca);
    }


    private static void alterarSituacao(Scanner sc) {
        System.out.println("Informe O CPF");
        String cpf = sc.nextLine();
        String resultdadoBusca = pessoaFacade.alterarSituacao(cpf);
        System.out.println(resultdadoBusca);
    }
}
