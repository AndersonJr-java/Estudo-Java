package atividades.relógiopolimorfismo;

public non-sealed class RelogioBR extends Relogio{
    

    Relogio convert(final Relogio relogio){
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio){

            case RelogioEUA relogioEUA -> this.hora = (relogioEUA.getPeriodo().equals("PM")) ?
                    relogioEUA.getHora() + 12 :
                    relogioEUA.getHora();

            case RelogioBR relogioBR -> this.hora = relogioBR.getHora();         
        }
        return null;
    }


}
