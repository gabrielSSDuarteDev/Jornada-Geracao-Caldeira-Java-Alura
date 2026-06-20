package src.Exercicio_03;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private double valor;


    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    void exibirSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }
    void zerarSaldo(){
        setSaldo(0);
    }
    void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
