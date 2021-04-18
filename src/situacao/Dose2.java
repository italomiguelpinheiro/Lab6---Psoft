package situacao;

import model.Pessoa;

public class Dose2 implements Situacao{
    private static final String SITUACAO_ATUAL = "HABILIDATE PARA TOMAR A 2 DOSE";

    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }

    @Override
    public void proxSituacao(Pessoa pessoa) {
        pessoa.setSituacao(new FinalizadaVacinacao());
    }

}
