package controller;

import model.*;
import service.PessoaService;

import java.util.List;

public class PessoaController {
    private PessoaService pessoaService;

    public PessoaController() {
        this.pessoaService = new PessoaService();
    }

    public String cadastrarPessoa(String nomeCompleto, String CPF, String endereço, String cartao, String email,
            String telefone, String profissao, List<String> comorbidades, int situacao) {

        PessoaDto pessoaDto = new PessoaDto(nomeCompleto, CPF, endereço, cartao, email, telefone, profissao,
                comorbidades, situacao);
        pessoaService.cadastrarPessoa(pessoaDto);
        return "\n==== Pessoa cadastrada com sucesso ====\n";

    }

    public String updatePessoa(String nomeCompleto, String CPF, String endereço, String cartao, String email,
            String telefone, String profissao, List<String> comorbidades, int situacao) {

        PessoaDto pessoaDto = new PessoaDto(nomeCompleto, CPF, endereço, cartao, email, telefone, profissao,
                comorbidades, situacao);

        pessoaService.updatePessoa(pessoaDto);
        return "==== Pessoa atualizada com sucesso ====\n";
    }

    public String getPessoa(String cpf) {
        return pessoaService.getPessoa(cpf).toString();
    }

    public String getSituacao(String cpf) {
        return pessoaService.getSituacao(cpf);
    }

    public String alterarSituacao(String cpf) {
        return "Alterar situação para: " + pessoaService.alterarSituacao(cpf);
    }
}
