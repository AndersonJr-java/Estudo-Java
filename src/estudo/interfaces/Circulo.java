package estudo.interfaces;

public record Circulo(double raio) implements FormaGeometrica{

    private static final double pi = 3.14;

    public double getArea(){
        return pi * (raio * raio);
    }
}
