package estudo.orientaçãoObjeto;

public class Main {

    public static void main(String[] args) {

        var Game1 = new Game("Tower Defense");
        Game1.incAgeGame();
        var Game2 = new Game("Parkour");
        Game2.incAgeGame();
        System.out.println("Type game: " + Game1.gettype() + " Value game: " + Game1.getvalue());
        System.out.println("Type game: " + Game2.gettype() + " Value game: " + Game2.getvalue());   
    }
    
}