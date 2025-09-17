package atividades.tributagem;

import estudo.interfaces.Circulo;
import estudo.interfaces.FormaGeometrica;
import estudo.interfaces.Quadrado;
import estudo.interfaces.Retangulo;

import javax.swing.event.TreeSelectionListener;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int option;
        Tributo tributo = null;
        while (true) {
            System.out.println("Escolha qual tipo é seu produto");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Cultura");
            System.out.println("3 - Saúde");
            System.out.println("4 - Vestuário");
            System.out.println("5 - Sair do programa");
            option = scanner.nextInt();

            if (option == 1) {
                tributo = taxarAlimentacao();
            } else if (option == 2) {
                tributo = taxarCultura();
            } else if (option == 3) {
                tributo = taxarSaude();
            } else if (option == 4){
                tributo = taxarVestuario();
            } else if (option == 5){
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("O seu produto mais a taxa de tributação fica: " + tributo.getTributo());
        }
    }
    private static Tributo taxarAlimentacao(){
        System.out.println("Informe quanto custa seu produto:");
        var preco1 = scanner.nextDouble();
        return new Alimentacao(preco1);
    }

    private static Tributo taxarCultura(){
        System.out.println("Informe quanto custa seu produto:");
        var preco2 = scanner.nextDouble();
        return new Cultura(preco2);
    }

    private static Tributo taxarSaude(){
        System.out.println("Informe quanto custa seu produto:");
        var preco3 = scanner.nextDouble();
        return new Saude(preco3);
    }

    private static Tributo taxarVestuario(){
        System.out.println("Informe quanto custa seu produto:");
        var preco1 = scanner.nextDouble();
        return new Vestuario(preco1);
    }
}
