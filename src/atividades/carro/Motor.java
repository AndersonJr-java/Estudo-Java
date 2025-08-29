package atividades.carro;


public class Motor {

    private int velocidade = 0;

    private boolean ligarCarro = false;

    private int marcha = 0;

    public Motor(){
    }

    public void SetCarro(boolean ligarCarro){
            this.ligarCarro = ligarCarro;
    }

    public void CarroLigado(){
        
    if (this.ligarCarro == true){
        System.out.println(" Você já ligou seu carro");
        return;
    }

    SetCarro(true);
    System.out.println(" Você ligou seu carro");

    }

    public void CarroDesligado(){

    if (this.ligarCarro == false){
        System.out.println("Você já desligou seu carro");
        return;
    } else if (this.velocidade >= 1){
        System.out.println("Diminua sua velocidade para poder desligar o carro");
        return;
    } else if (this.marcha >= 1) {
        System.out.println("Diminua sua marcha para poder desligar o carro");
    } else
        SetCarro(false);
        System.out.println("Você desligou seu carro");
    }

    public void Acelerar(){
        if (this.ligarCarro == false){
            System.out.println("Você precisa ligar seu carro");
        } 
        else if (this.velocidade == 120){
            System.out.println("Você não pode acelerar o seu carro, está no limite");
            return;
        }
        else {
            System.out.println("Você acelerou seu carro +5");
        this.velocidade += 5;
        }
    }

    public void Desacelerar(){
        if (this.ligarCarro == false){
            System.out.println("Você precisa ligar seu carro");
        }  
        else if (this.velocidade == 0){
            System.out.println("O seu carro não pode desacelerar, está no limite");
            return;
        } 
        else {
            System.out.println("Você desacelerou seu carro -5");
        this.velocidade -=5;
        }
    }

    public void VirarDireita(){
         if (this.ligarCarro == false){
            System.out.println("Você está com o carro desligado");
        } else if (this.velocidade <= 0){
            System.out.println("Velocidade insuficiente para virar");
        } else if (this.velocidade >= 40){
            System.out.println("Diminua sua velocidade para virar");
        } else {
             System.out.println("Você virou a Direita");
        }
       
    }

    public void VirarEsquerda(){
        if (this.ligarCarro == false){
            System.out.println("Você está com o carro desligado");
        }
        else if (this.velocidade <= 0){
            System.out.println("Velocidade insuficiente para virar");
        } else if (this.velocidade >= 40){
            System.out.println("Diminua sua velocidade para virar");
        } else {
            System.out.println("Você virou a Esquerda");
        }
        
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void ChecarVelocidade(){
        var amount = getVelocidade();
        System.out.println(" Você tem " +amount+ " de velocidade em seu carro");
    }

    public int getMarcha(){
        return marcha;
    }

    public void SubirMarcha(){
        if (this.marcha >= 6) {
            System.out.println("Sua marcha está no máximo possível");
        } else if (this.ligarCarro == false) {
            System.out.println("Ligue seu carro para poder mudar de marcha");
        } else {
            this.marcha += 1;
        }
    }

    public void DescerMarcha(){
        if (this.ligarCarro == false) {
            System.out.println("Ligue seu carro para poder mudar de marcha");
        } else if (this.marcha <= 0) {
            System.out.println("Sua marcha está no mínimo possível");
        } else {
            this.marcha -= 1;
        }
    }

    public void checarMarcha(){
        var amount = getMarcha();
        System.out.println("Você está com " +amount+ " de marcha em seu carro");
    }
}
