package atividades.tributagem;

public record Saude(double preco3) implements Tributo {

    public double getTributo() {
        return (preco3 / 100) * 1.5 + preco3;
    }
}
