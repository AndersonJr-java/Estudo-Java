package estudo.calculadora;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tipo de operação que deseja fazer (1 = soma ou 2 = subtracao)");
        var operacaoOpcao = scanner.nextInt();
       while(operacaoOpcao > 2 || operacaoOpcao < 1){
           System.out.println("Escolhe uma opção válida (1 = soma, 2 = subtração");
           operacaoOpcao = scanner.nextInt();
       }
       var operacaoSelecionada = Operacao.values()[operacaoOpcao - 1];
       System.out.println("Informe os números que seram usados na operação, separando ele por uma *,* (Ex: 1,2,3)");
       var numeros = scanner.next();
       var numeroArray = Arrays.stream(numeros.split(","))
               .mapToLong(Long::parseLong)
               .toArray();
       var resultado = operacaoSelecionada.getOperacaoChamar().exec(numeroArray);
       var mostrarOperacao = numeros.replaceAll(",", operacaoSelecionada.getSinal());
       System.out.printf("O resultado da operação %s  = %s \n", mostrarOperacao, resultado);
    }
}
