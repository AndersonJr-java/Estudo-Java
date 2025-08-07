package estudo;
import java.util.Scanner;

public class RepeticaoWhile{
public static  void main(String[] args) {
    var scanner = new Scanner(System.in);
    var name = "";
    while (!name.equals("exit")) {
        System.out.println("Informe a cor da sua casa");
        name = scanner.next();
        System.out.println(name);
    }
    scanner.close();
}
}