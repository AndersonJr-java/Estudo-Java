package atividades.tributagem;

public record Vestuario(double preco4) implements Tributo {

    public double getTributo() {
        return (preco4 / 100) * 2.5 + preco4;
    }

}
