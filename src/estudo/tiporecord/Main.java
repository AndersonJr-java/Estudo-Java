package estudo.tiporecord;

public class Main {

    public static void main(String[] args){
        var partida = new Partida("Real Madrid", 4);
        System.out.println(partida.getInfo());
        System.out.println(partida.name());
    }
}