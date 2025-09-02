package atividades.relógiopolimorfismo;

public sealed abstract class Relogio permits RelogioBR, RelogioEUA{

    protected int hora;

    protected int minuto;

    protected int segundo;
    

    public int getHora() {
        return hora;
    }

    public void setHora(int hora){
        if (hora >= 24) {
            this.hora = 24;
            return;
        }
        this.hora = hora;
    }

    public void setMinuto(int minuto){
        if (minuto >= 60) {
            this.minuto = 60;
        }
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 60) {
            this.segundo = 60;
        }
        this.segundo = segundo;
    }

    private String formato(int value){
        return value < 9 ?"0" +value : String.valueOf(value);
    }

    public String getTempo(){
        return formato(hora) + ":" + formato(minuto) + ":" + formato(segundo);
    }

    abstract Relogio convert(Relogio relógio);
}
