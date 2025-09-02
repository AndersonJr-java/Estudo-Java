package atividades.relógiopolimorfismo;

public non-sealed class RelogioEUA extends Relogio {

    private String periodo;

    public String getPeriodo(){
        return periodo;
    }

    public void setPM(){
        this.periodo = "PM";
    }

    public void setAM(){
        this.periodo = "AM";
    }

    public void setHora(int hora){
        setAM();
        if ((hora > 12) && (hora <= 23)) {
            this.periodo = "PM";
            this.hora = hora - 12;
        }  else if (hora >= 24 ){
                this.hora = 0;
        } else {
            this.hora = hora;
        }
    }
  
    Relogio convert(final Relogio relogio){
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        this.hora = relogio.getHora();
        switch (relogio){
            case RelogioEUA relogioEUA -> {
                this.hora = relogioEUA.getHora();
                this.periodo = relogioEUA.getPeriodo();
            }
            case RelogioBR relogioBR -> this.setHora(relogioBR.getHora()); 
        }
        return this;
    }

    public String getTempo() {
        return super.getTempo() + " " + this.periodo;
    }
}
