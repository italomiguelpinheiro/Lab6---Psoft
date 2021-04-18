package situacao;

import model.Pessoa;

public interface Situacao {
    public String getSituacao();
    public void proxSituacao(Pessoa pessoa);
}
