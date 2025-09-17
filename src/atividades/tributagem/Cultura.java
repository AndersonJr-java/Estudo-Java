package atividades.tributagem;

public record Cultura(double preco2) implements Tributo {

    public double getTributo() {
        return (preco2 / 100) * 4 + preco2;
    }
}