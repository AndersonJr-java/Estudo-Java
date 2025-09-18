package estudo.interfaces;

import java.util.Scanner;

public class Main {

    private static  final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int option;

        FormaGeometrica formaGeometrica;

        while (true) {
            System.out.println("Escolha qual seria a sua forma geométrica");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Círculo");
            System.out.println("3 - Retângulo");
            System.out.println("4 - Sair do programa");
            option = scanner.nextInt();

            if (option == 1) {
                formaGeometrica  = criarQuadrado();
            } else if (option == 2) {
                formaGeometrica = criarCirculo();
            } else if (option == 3) {
                formaGeometrica = criarRetangulo();
            } else if (option == 4){
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("A área de sua é de: " + formaGeometrica.getArea());
        }
    }
    private static FormaGeometrica criarQuadrado(){
        System.out.println("Informe os tamanhos dos lados:");
        var lado = scanner.nextDouble();
        return new Quadrado(lado);
    }

    private static FormaGeometrica criarRetangulo(){
        System.out.println("Informe a ase");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura");
        var altura = scanner.nextDouble();
        return new Retangulo(altura, base);
    }

    private static FormaGeometrica criarCirculo(){
        System.out.println("Informe o raio");
        var raio = scanner.nextDouble();
        return new Circulo(raio);
    }
}