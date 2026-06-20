package Exercicio_03;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
        public static void main(String[] args) {
            LocalTime horarioInicio = LocalTime.of(14, 30, 0);
            LocalTime horarioTermino = LocalTime.of(16, 45, 0);

            Duration duracao = Duration.between(horarioInicio, horarioTermino);

            System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");
        }
    }

