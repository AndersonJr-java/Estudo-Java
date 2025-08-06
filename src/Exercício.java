import java.util.Scanner;

public class Exercício {
    public static void  main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe sua comida favorita");
        var name = scanner.next();
        System.out.println("quanto voce pagaria para comer ela, agora na sua casa?");
        var valor = scanner.nextInt();
        System.out.printf("A %s está em promoção? (s/n)", name);
        var isOferta = scanner.next().equalsIgnoreCase("s");

        /*if (valor >= 20) {
            System.out.println("Sua comida chegará em 20 minutos\n");
        } else if (valor >=15 && isOferta) {
            System.out.printf("Você pediu um(a) %s\nPois seu preço de %s consegue pagar ela em promoção\nEla chegará em 20 minutos\n", name, valor);
            } else {
                System.out.println("Deixe para um outro dia!\n");
            }*/
         
        /*var comidaPaga = (valor >= 20) || (valor >= 15 && isOferta);
        var message = "";
            if (comidaPaga) {
            message = name + "chegará em 20 minutos \n";
            } else {
            message = "Deixe para outro dia \n";
             }
             System.out.println(message);/* */
         

         /* Operador Elvis
        var comidaPaga = (valor >= 20) || (valor >= 15 && isOferta);
        var message = comidaPaga?
                "Sua comida chegará em 20 minutos\n":
                "Deixe para outro dia\n";
            System.out.println(message)
          */
    }
        
}