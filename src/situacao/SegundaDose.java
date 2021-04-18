package situacao;

import model.Pessoa;

public class SegundaDose implements Situacao{
    private static final String SITUACAO_ATUAL = "Habilitado para tomar a 2 dose";

    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }

    @Override
    public void proxSituacao(Pessoa pessoa) {
        pessoa.setSituacao(new FinalizadaVacinacao());
    }

}
