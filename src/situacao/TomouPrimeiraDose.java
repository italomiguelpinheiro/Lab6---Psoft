package situacao;

import model.Pessoa;

public class TomouPrimeiraDose implements Situacao{
    private static final String SITUACAO_ATUAL = "Tomou 1 dose";

    public TomouPrimeiraDose() {
    }


    @Override
    public void proxSituacao(Pessoa pessoa) {
        pessoa.setSituacao(new SegundaDose());
    }

    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }
}
