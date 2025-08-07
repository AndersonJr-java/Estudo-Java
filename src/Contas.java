import java.util.Scanner;

public class Contas {
    
    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.printf("Selecione o primiro número");
        var valor1 = scanner.nextInt();
        System.out.println("Selecione o segundo número");
        var valor2 = scanner.nextInt();

        System.out.printf("%s + %s = %s\n", valor1, valor2, valor1 + valor2);


        //int a = scanner.nextInt();
        //int b = scanner.nextInt();


        /*System.out.printf("%s\n", a + b);
        System.out.printf("%s\n", a - b);
        System.out.printf("%s\n", a * b);
        System.out.printf("%s\n", a / b);
        System.out.printf("%s\n", a % b);*/

        scanner.close();
    }
}
