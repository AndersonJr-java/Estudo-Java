package atividades.banco;

import java.util.Scanner;

public class Main {
    

    private final static Scanner scanner = new Scanner(System.in);

    private final static Conta conta = new Conta();

    public static void main(String[] args){

        System.out.println("Bem vindo ao Banco! insira o seu saldo");
        var SaldoIni = scanner.nextInt();

        conta.SaldoIni(SaldoIni);

        var option = -1;

        do{

            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("7 - Usar cheque especial");
            System.out.println("8 - Retirar cheque especial");
            System.out.println("9 - Sair");
            option = scanner.nextInt();

            switch (option) {

                case 1 -> conta.verifySaldo();
                case 2 -> conta.consultarCheque();
                case 3 -> conta.Depositar();
                case 4 -> conta.Sacar();
                case 5 -> conta.PagarBoleto();
                case 6 -> conta.verifyCheque();
                case 7 -> conta.ativarCheque();
                case 8 -> conta.removerCheque();
                case 9 -> System.exit(0);

                default -> System.out.println("Opção inválida");
            }

        } while (true);
    }
}