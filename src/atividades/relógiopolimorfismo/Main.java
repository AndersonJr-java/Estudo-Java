package atividades.relógiopolimorfismo;

public class Main {
    
    public static void main(String []args){
        Relogio relogioBR = new RelogioBR();
        relogioBR.setSegundo(0);
        relogioBR.setMinuto(0);
        relogioBR.setHora(25);

        System.out.println(relogioBR.getTempo());

        System.out.println(new RelogioEUA().convert(relogioBR).getTempo());
    }

    
}
