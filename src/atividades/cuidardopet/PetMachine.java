package atividades.cuidardopet;

public class PetMachine {
    
    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public PetMachine(){

    }

    public void takeaShower(){
        if (this.pet == null){
            System.out.println("coloque seu pet na máquina");
            return;
    }
        this.water -= 10;
        this.shampoo -= 2;
    
        pet.setClean(true);
        System.out.println("o pet" + pet.getName() + " Está limpo");

    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina está cheia");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo está cheia");
            return;
        }

        shampoo += 2;
    }

    public int getWater(){
        return water;
    }

    public int getShampoo(){
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if (!this.clean){
            System.out.println("A máquina está suja, para colocar pet é necessário limpar");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina esse momento");
            return;
        }

        this.pet = pet; 
        System.out.println("O pet " + pet.getName() + "foi colocado na máquina");
    }

    public void removePet(){

        this.clean = this.pet.isClean();
        System.out.println("O pet " +this.pet.getName()+ " está saindo da máquina");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }

}
