package controller;

import model.*;
import service.PessoaService;

import java.util.List;

public class PessoaController {
    private PessoaService pessoaService;

    public PessoaController() {
        this.pessoaService = new PessoaService();
    }

    public String cadastrarPessoa(String nomeCompleto, String CPF,
             String endereço, String cartao, String email,
             String telefone, String profissao, List<String>cormobidades, int situacao) {

        PessoaDto pessoaDto = new PessoaDto(nomeCompleto,  CPF,
                endereço,  cartao,  email, telefone,
                profissao, cormobidades, situacao);

        try {
            pessoaService.cadastrarPessoa(pessoaDto);
            return "Pessoa cadastrada\n";
        } catch (IllegalAccessException e) {
            return "Pessoa já cadastrada\n";
        }
    }


    public String updatePessoa(String nomeCompleto, String CPF,
                                  String endereço, String cartao, String email,
                                  String telefone, String profissao, List<String>cormobidades, int situacao) {

        PessoaDto pessoaDto = new PessoaDto(nomeCompleto,  CPF,
                endereço,  cartao,  email, telefone,
                profissao, cormobidades, situacao);

        try {
            pessoaService.updatePessoa(pessoaDto);
            return "Pessoa atualizada\n";
        } catch (IllegalAccessException e) {
            return "Pessoa não encontrada\n";
        }
    }

    public String getPessoa(String cpf) {
        try {
            return pessoaService.getPessoa(cpf).toString();
        } catch (IllegalAccessException e) {
            return "Pessoa não encontrada\n";
        }
    }

    public String getSituacao(String cpf) {
        try {
            return pessoaService.getSituacao(cpf);
        } catch (IllegalAccessException e) {
            return "Pessoa não encontrada";
        }
    }

    public String alterarSituacao(String cpf) {
        try {
            return "Alterar situação para: " + pessoaService.alterarSituacao(cpf);
        } catch (IllegalAccessException e) {
            return "Pessoa não encontrada";
        }
    }
}
