package questao01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.println("Informe a matrícula do aluno: ");
        String matricula = teclado.nextLine();

        System.out.println("Informe a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = teclado.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        System.out.println(aluno);

    }// fim do main

}// fim da classe
