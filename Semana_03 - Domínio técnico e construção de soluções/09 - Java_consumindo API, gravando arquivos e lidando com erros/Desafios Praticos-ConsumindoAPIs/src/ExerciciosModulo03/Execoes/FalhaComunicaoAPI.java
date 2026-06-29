package ExerciciosModulo03.Execoes;

public class FalhaComunicaoAPI extends RuntimeException {
    public FalhaComunicaoAPI(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "[Rede/API] Falha na comunição com a API" +  super.getMessage();
    }
}
