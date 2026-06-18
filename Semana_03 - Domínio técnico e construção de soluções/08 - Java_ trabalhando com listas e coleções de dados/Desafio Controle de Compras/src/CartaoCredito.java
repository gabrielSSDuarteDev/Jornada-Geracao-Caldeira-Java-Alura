public class CartaoCredito {
    private double limite;
    private double saldo;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite; // No início, o saldo disponível é igual ao limite
    }

    // Tenta realizar a compra de um produto. Retorna true se houver saldo.
    public boolean lancaCompra(Produto produto) {
        if (this.saldo >= produto.getPreco()) {
            this.saldo -= produto.getPreco(); // Deduz do saldo disponível
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    // O total da compra é o limite original menos o que sobrou de saldo
    public double getTotalFinalCompra() {
        return this.limite - this.saldo;
    }
}