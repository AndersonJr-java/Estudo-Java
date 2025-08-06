import java.util.Scanner;

public class Estudo {
public static void main (String[] args) {
   var scanner = new Scanner(System.in);
    System.out.println("informe quantos cm tem seu pinto");
    var option = scanner.nextInt();
    switch (option) {
        case 1:
        System.out.println("Se mata");
        break;
        case 2:
        System.out.println("taca fogo");
        break;
        case 3:
        System.out.println("corta");
        break;
        case 4:
        System.out.println("faz uma cirurgia");
        break;
        case 5:
        System.out.println("vire mulher com clitorios avantajado");
        break;
        case 6:
        System.out.println("vc é criança?");
        break;
        case 7:
        System.out.println("ta sainda da juventude?");
        break;
        case 8:
        System.out.println("tá igual o china");
        break;
        case 9:
        System.out.println("Se mata");
        break;
        default:
        System.out.println("bom tamanho");
        break;
        
        
    }
    for (var i = 1;i <= 100; i  ++){
        if (i == 100) break;
}
    scanner.close();
}
}