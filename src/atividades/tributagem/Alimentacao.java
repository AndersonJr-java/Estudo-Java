package atividades.tributagem;

public record Alimentacao(double preco1) implements Tributo{

    public double getTributo() {
        return (preco1 / 100) + preco1;
    }
}
