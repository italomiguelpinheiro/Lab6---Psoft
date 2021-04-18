package situacao;

import model.Pessoa;

public class Dose1 implements Situacao {
    private static final String SITUACAO_ATUAL = "Habilitada para tomar a 1 dose";

    public Dose1() {
    }

    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }

    @Override
    public void proxSituacao(Pessoa pessoa) {
        pessoa.setSituacao(new TomouDose1());
    }
}
