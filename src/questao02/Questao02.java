package questao02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        int tempoSegundos = leituraTempo();

        System.out.println("Horas: " + converteHoras(tempoSegundos));
        System.out.println("Minutos: " + converteMinutos(tempoSegundos));
        System.out.println("Segundos: " + converteSegundos(tempoSegundos));
    }// fim do main

    public static int leituraTempo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tempo em segundos: ");
        int tempo = teclado.nextInt();

        return tempo;
    }

    public static int converteHoras(int tempoSegundos){
        int horas = tempoSegundos / 3600;

        return  horas;
    }

    public static int converteMinutos(int tempoSegundos){
        int minutos = (tempoSegundos - (converteHoras(tempoSegundos) * 3600)) / 60;

        return  minutos;
    }

    public static int converteSegundos(int tempoSegundos){
        int horas = converteHoras(tempoSegundos) * 3600;
        int minutos = converteMinutos(tempoSegundos) * 60;
        int seg = tempoSegundos - minutos - horas;

        return seg;
    }
}// fim da classe
