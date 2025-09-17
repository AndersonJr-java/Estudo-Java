package estudo.interfaces;

public record Quadrado(double lado) implements FormaGeometrica{

    public double getArea(){
        return lado * lado;
    }
}
