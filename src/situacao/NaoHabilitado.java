package situacao;

import model.Pessoa;

public class NaoHabilitado implements Situacao{
    private static final String SITUACAO_ATUAL = "Nao habilitado para vacina";

    public NaoHabilitado() {}
    
    @Override
    public String getSituacao() {
        return this.SITUACAO_ATUAL;
    }

    @Override
    public void proxSituacao(Pessoa pessoa) {
        pessoa.setSituacao(new Dose1());
    }

}
