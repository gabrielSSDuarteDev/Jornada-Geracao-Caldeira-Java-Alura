package src.Exercicio_04;

import java.util.Scanner;

public class Temperatura {
    private String local;
    private double temperatura;

    public Temperatura(String local, double temperatura) {
        this.local = local;
        this.temperatura = temperatura;
    }

    void exibirRealatorio(){
        System.out.println("Sensor no local: " + getLocal());
        System.out.println("Temperatura: " + getTemperatura());
        if (getTemperatura() > 37.5){
            System.out.println("Alerta Temperatura acima do limite");
        }
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
