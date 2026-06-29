package ExerciciosModulo03.Operacoes;

import ExerciciosModulo03.Execoes.DivisaoInvalida;
import ExerciciosModulo03.Modelos.CambioRecord;

import java.util.Map;

public class Calculadora {
        private final double totalUSD;
        private final Map<String, Double> taxas;
        private double moedaLocal;

        public Calculadora(CambioRecord c,double totalUSD){
            this.taxas = c.rates();
            this.totalUSD = totalUSD;
        }

        public double conversaoBRL(){
            double brl = taxas.getOrDefault("BRL",1.0);
            return brl *  totalUSD;
        }

        public double conversaoEUR(){
            double eur = taxas.getOrDefault("EUR",1.0);
            return eur *  totalUSD;
        }
        public double conversaoGBP(){
            double gbp = taxas.getOrDefault("GBP",1.0);
            return gbp * totalUSD;
        }

        public double calcularParcela(int parcelas){

            if(parcelas == 0){
                throw new DivisaoInvalida("Não foi possível realizar  a divisão");
            }

            double valorParcelaBRL = conversaoBRL()/parcelas;
            double valorParcelaEUR = conversaoEUR()/parcelas;
            double valorParcelaGBP = conversaoGBP()/parcelas;

            if(valorParcelaBRL < 0 || valorParcelaEUR < 0 || valorParcelaGBP < 0){
                System.out.println("Você tem uma Dívida de:  " +  parcelas);
            }


            return valorParcelaBRL;
        }
























}
