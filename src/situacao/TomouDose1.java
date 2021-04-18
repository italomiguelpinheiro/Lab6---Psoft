package situacao;

import model.Pessoa;

public class TomouDose1 implements Situacao{
    private static final String SITUACAO_ATUAL = "Tomou 1 dose";

    public TomouDose1() {
    }


    @Override
    public void proxSituacao(Pessoa pessoa) {
        pessoa.setSituacao(new Dose2());
    }

    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }
}
