package estudo.orientaçãoObjeto;

import java.time.OffsetDateTime;

public class Game {
    
    private final String type;

    private int value;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Game(String type){
        this.type = type;
        this.value = 2;
    }
    
    public String gettype(){
        return this.type;
    }

    public int getvalue(){
        return this.value;
    }

    public void incAgeGame(){
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
        
        this.value =+1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}