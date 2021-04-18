package model;

import java.util.List;
import java.util.Objects;
import situacao.Situacao;

public class Pessoa {

    private String nomeCompleto;
    private String CPF;
    private String endereço;
    private String cartaoSus;
    private String email;
    private String telefone;
    private String profissao;
    private List<String> comorbidades;
    private Situacao situacao;

    public Pessoa(String nomeCompleto, String CPF, String endereço, String cartaoSus, String email, String telefone,
            String profissao, List<String> comorbidades, Situacao situacao) {
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

    public String getCpf() {
        return this.CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(CPF, pessoa.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getSitucao() {
        return this.situacao.getSituacao();
    }

    public void avancarSituacao() {
        this.situacao.proxSituacao(this);
    }

    @Override
    public String toString() {
        return "Pessoa:" + "nomeCompleto: '" + this.nomeCompleto + '\n' + "CPF: '" + this.CPF + '\n' + "endereço: '"
                + this.endereço + '\n' + "cartaoSus: '" + this.cartaoSus + '\n' + "email: '" + this.email + '\n'
                + "telefone: '" + this.telefone + '\n' + "profissao: '" + this.profissao + '\n' + "comorbidades: "
                + this.comorbidades + '\n' + "situacao: " + this.situacao.getSituacao();
    }
}
