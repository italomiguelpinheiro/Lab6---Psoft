package situacao;

public class SituacaoFactory {
    private SituacaoFactory() {}

    public static Situacao factorySituacao(int idSituacao) {
        if (idSituacao == 1) {
            return new NaoHabilitado();
        }

        if (idSituacao == 2) {
            return new Dose1();
        }

        if (idSituacao == 3) {
            new TomouDose1();
        }

        if (idSituacao == 4) {
            return new Dose2();
        }

        if (idSituacao == 5) {
            return new FinalizadaVacinacao();
        }

        return null;
    }

}
