package atividades;

import java.util.Scanner;

public class ClassificaçãoIdade{

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        
        int idade = scanner.nextInt();
        
        if (idade <18) {
          System.out.println("Menor de idade");
        } else if (idade >=70) {
          System.out.println("Idoso");
        } else {
          System.out.println("Maior de idade");
        }
          
        

        scanner.close();
    }
}