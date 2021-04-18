package situacao;

import model.Pessoa;

public class PrimeiraDose implements Situacao {
    private static final String SITUACAO_ATUAL = "Habilitada para tomar a 1 dose";

    public PrimeiraDose() {
    }

    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }

    @Override
    public void proxSituacao(Pessoa pessoa) {
        pessoa.setSituacao(new TomouPrimeiraDose());
    }
}
