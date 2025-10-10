package atividades.Telefonia;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        var scanner = new Scanner(System.in);
        System.out.println("Informe o número telefonico que queira discar");
        String numeroTelefonico = scanner.next();
        switch (numeroTelefonico.length()) {
            case 8 ->
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s",
                        TipoTelefonico.TELEFONE_FIXO.getNumeroFormatado(numeroTelefonico),
                        TipoTelefonico.TELEFONE_FIXO.getTipo());

            case 10 ->
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s",
                        TipoTelefonico.TELEFONE_FIXO_DDD.getNumeroFormatado(numeroTelefonico),
                        TipoTelefonico.TELEFONE_FIXO_DDD.getTipo());

            case 9 ->
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s",
                        TipoTelefonico.CELULAR.getNumeroFormatado(numeroTelefonico),
                        TipoTelefonico.CELULAR.getTipo());

            case 11 ->
                System.out.printf("Seu número é: %s, e o tipo que procura é: %s",
                        TipoTelefonico.CELULAR_DDD.getNumeroFormatado(numeroTelefonico),
                        TipoTelefonico.CELULAR_DDD.getTipo());

            default -> System.out.println("Numero não existente, por favor cheque se está certo");
        }
    }
}
