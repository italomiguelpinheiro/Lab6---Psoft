package situacao;

import model.Pessoa;

public class FinalizadaVacinacao implements Situacao{
    private static final String SITUACAO_ATUAL = "Finalizada vacinacao";

    public FinalizadaVacinacao(){}

    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }

    @Override
    public void proxSituacao(Pessoa pessoa) {
    }

}
