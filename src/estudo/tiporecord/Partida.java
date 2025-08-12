package estudo.tiporecord;

public record Partida(String name, int gols) {
    
    public Partida{

    }

    public Partida(String name){
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " gols: " + gols;
    }

}