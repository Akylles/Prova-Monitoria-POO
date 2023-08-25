package questao03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao03 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        List<FiguraGeometrica> figurasGeometricas = new ArrayList<>();

        Quadrado quadrado = lerQuadrado();
        Retangulo retangulo = lerRetangulo();
        Triangulo triangulo = lerTriangulo();
        Circulo circulo = lerCirculo();

        figurasGeometricas.add(quadrado);
        figurasGeometricas.add(retangulo);
        figurasGeometricas.add(triangulo);
        figurasGeometricas.add(circulo);

        System.out.println("\n====EXIBINDO TODAS AS FIGURAS GEOMETRICAS E SEUS DADOS====\n");

        for (int i = 0; i < figurasGeometricas.size(); i++) {
            System.out.println(figurasGeometricas.get(i).toString());
        }

    }// fim do main

    public static Quadrado lerQuadrado(){

        System.out.println("Informe o lado do quadrado: ");
        double lado =teclado.nextDouble();

        Quadrado quadrado = new Quadrado(lado);

        return quadrado;
    }

    public static Retangulo lerRetangulo(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a base do retangulo: ");
        double base =teclado.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        double altura =teclado.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        return retangulo;
    }


    public static Triangulo lerTriangulo(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a base do tringulo: ");
        double base =teclado.nextDouble();

        System.out.println("Informe a altura do triangulo: ");
        double altura =teclado.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);

        return triangulo;
    }


    public static Circulo lerCirculo(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio do circulo: ");
        double raio =teclado.nextDouble();

        Circulo circulo = new Circulo(raio);

        return circulo;
    }

}// fim da classe
