package atividades;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.printf("%s\n", a + b);
        System.out.printf("%s\n", a - b);
        System.out.printf("%s\n", a * b);
        System.out.printf("%s\n", a / b);
        System.out.printf("%s\n", a % b);
        

        scanner.close();
    }
}
