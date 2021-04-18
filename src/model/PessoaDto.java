package model;

import java.util.List;



public class PessoaDto {
    private String nomeCompleto;
    private String CPF;
    private String endereço;
    private String cartaoSus;
    private String email;
    private String telefone;
    private String profissao;
    private List<String> comorbidades;
    private int situacao;

    public PessoaDto(String nomeCompleto, String CPF, String endereço, String cartaoSus, String email, String telefone, String profissao, List<String> comorbidades, int situacao) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.endereço = endereço;
        this.cartaoSus = cartaoSus;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = comorbidades;
        this.situacao = situacao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public List<String> getComorbidades() {
        return comorbidades;
    }

    public int getSituacao() {
        return situacao;
    }
}
