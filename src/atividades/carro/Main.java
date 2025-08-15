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
            System.out.println("8 - Trocar a marcha");
            System.out.println("9 - Sair");
            option = scanner.nextInt();
        
        } while (true);
    }
}
