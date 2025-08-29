package atividades.carro;

import java.util.Scanner;


public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static Motor motor = new Motor();
    public static void main(String[] args){

        System.out.println("Bem vindo ao seu carro!");

        var option = -1;

        do{

            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir a velocidade");
            System.out.println("5 - Virar a esquerda");
            System.out.println("6 - Virar a direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Subir marcha");
            System.out.println("9 - Descer marcha");
            System.out.println("10 - Checar a marcha");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
        
             switch (option) {

                case 1 -> motor.CarroLigado();
                case 2 -> motor.CarroDesligado();
                case 3 -> motor.Acelerar();
                case 4 -> motor.Desacelerar();
                case 5 -> motor.VirarDireita();
                case 6 -> motor.VirarEsquerda();
                case 7 -> motor.ChecarVelocidade();
                case 8 -> motor.SubirMarcha();
                case 9 -> motor.DescerMarcha();
                case 10 -> motor.checarMarcha();
                case 0 -> System.exit(0);

                default -> System.out.println("Opção inválida");
            }

        } while (true);

       
    }
}
