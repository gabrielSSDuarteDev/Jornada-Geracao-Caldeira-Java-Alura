package ExerciciosModulo03.Execoes;

public class ProdutoNaoEncontrado extends RuntimeException {
    public ProdutoNaoEncontrado(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "[ERRO] O Produto não está Listado no Catálogo " +  super.getMessage();
    }
}
