package atividades.Telefonia;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        var scanner = new Scanner(System.in);
        System.out.println("Informe o número telefonico que queira discar");
        String numeroTelefonico = scanner.next();
        var formatado = "";
        var tipo = "";
        var tamanho = numeroTelefonico.length();
        switch (tamanho) {
            case 8 -> {
                formatado = TipoTelefonico.TELEFONE_FIXO.getNumeroFormatado(numeroTelefonico);
                tipo = "TELEFONE FIXO";
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s", formatado, tipo);
            }
            case 10 -> {
                formatado = TipoTelefonico.TELEFONE_FIXO_DDD.getNumeroFormatado(numeroTelefonico);
                tipo = "TELEFONE FIXO COM DDD";
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s", formatado, tipo);
            }
            case 9 -> {
                formatado = TipoTelefonico.CELULAR.getNumeroFormatado(numeroTelefonico);
                tipo = "CELULAR";
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s", formatado, tipo);
            }
            case 11 -> {
                formatado = TipoTelefonico.CELULAR_DDD.getNumeroFormatado(numeroTelefonico);
                tipo = "CELULAR COM DDD";
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s", formatado, tipo);
            }
            default -> System.out.println("Numero não existente, por favor cheque se está certo");
        }
    }
}
