package ExerciciosModulo03.Execoes;

public class DivisaoInvalida extends ArithmeticException {
    public DivisaoInvalida(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "[Cálculo Error] " + super.getMessage();
    }
}
