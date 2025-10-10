package estudo.calculadora;

import java.util.stream.LongStream;

public enum Operacao {

    SOMA(n -> LongStream.of(n).reduce(0, Long::sum), "+"),
    SUBTRACAO(n -> LongStream.of(n).reduce(0, (n1, n2) -> n1 - n2), "-");

    private final Calcular operacaoChamar;

    private final String sinal;

    Operacao(Calcular operacaoChamar, String sinal){
        this.operacaoChamar = operacaoChamar;
        this.sinal = sinal;
    }

    public String getSinal() {
        return sinal;
    }

    public Calcular getOperacaoChamar(){
        return operacaoChamar;
    }
}
