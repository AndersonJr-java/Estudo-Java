package atividades;

import java.util.Scanner;

public class Notas {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();
        
        if (nota <=4.5) {
          System.out.println("Reprovado");
        } else if (nota >=7.0) {
          System.out.println("Aprovado");
        }else {
          System.out.println("Recuperacao");
        }
        scanner.close();
    }
}
