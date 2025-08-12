package estudo;
import java.util.Scanner;

public class Case {
public static void main (String[] args) {
   var scanner = new Scanner(System.in);
    System.out.println("informe quantos cm você tem");
    var option = scanner.nextInt();
    switch (option) {
        case 100:
        System.out.println("Bem pequeno");
        break;
        case 110:
        System.out.println("Faça uma melhor dieta");
        break;
        case 120:
        System.out.println("Você deve ter 12 anos");
        break;
        case 130:
        System.out.println("Um pouco pequeno");
        break;
        case 140:
        System.out.println("Está bom para uma criança");
        break;
        case 150:
        System.out.println("Tamanho rasoável");
        break;
        case 160:
        System.out.println("Cresça só mais um pouco");
        break;
        case 170:
        System.out.println("Muito bom");
        break;
        case 180:
        System.out.println("Altura ideal");
        break;
        default:
        System.out.println("Você joga Basquete?");
        break;
        
        
    }
    for (var i = 1;i <= 100; i  ++){
        if (i == 100) break;
}
    scanner.close();
}
}