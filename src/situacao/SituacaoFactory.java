package situacao;

public class SituacaoFactory {
    private SituacaoFactory() {}

    public static Situacao factorySituacao(int idSituacao) {
        if (idSituacao == 1) {
            return new NaoHabilitado();
        }

        if (idSituacao == 2) {
            return new PrimeiraDose();
        }

        if (idSituacao == 3) {
            new TomouPrimeiraDose();
        }

        if (idSituacao == 4) {
            return new SegundaDose();
        }

        if (idSituacao == 5) {
            return new FinalizadaVacinacao();
        }

        return null;
    }

}
