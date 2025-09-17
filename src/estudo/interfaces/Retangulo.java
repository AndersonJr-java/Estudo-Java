package estudo.interfaces;

public record Retangulo(double altura, double base) implements FormaGeometrica{

    public double getArea(){
        return altura * base;
    }
}
