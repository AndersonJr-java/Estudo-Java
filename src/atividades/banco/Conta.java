package atividades.banco;

import java.util.Scanner;

public class Conta {

    private final static Scanner scanner = new Scanner(System.in);

    private int saldoIni = 0;

    private int saldo = 0;

    private boolean cheque = false;

    private int valorCheque;

    public Conta(){
    }

  

    public void SaldoIni(int saldoIni){
        this.saldoIni = saldoIni;
        this.saldo = this.saldoIni;
        this.consultarCheque();
    }

    public void Cheque(boolean cheque){
        this.cheque = cheque;
    }

    public int getSaldo(){
        return saldo;
    }

    public void setCheque(boolean cheque){
    this.cheque = cheque;
    }

    public void Depositar(){
        
        System.out.println(" Quanto você gostaria de depositar?");
        var deposito = scanner.nextInt();
        
        int a = deposito;
        int b = saldo;
        int c = a + b;

        this.saldo = c;
        System.out.println(" Seu total ficará = " + c);
    }

    public void Sacar(){
        
        System.out.println(" Quanto você gostaria de sacar?");
        var sacar = scanner.nextInt();
        
        int a = sacar;
        int b = saldo;
        int c = b - a;

        this.saldo = c;

        System.out.println(" Seu total ficará = " + c);
    }
    
    public void PagarBoleto(){
        System.out.println(" Quantos R$ era o boleto?");
        var boleto = scanner.nextInt();

        int a = saldo;
        int b = boleto;
        int c = a - b;

        this.saldo = c;

        System.out.println(" Seu total ficará =" + c);
    }

    public void verifySaldo(){
        var amount = getSaldo();
        System.out.println(" Você tem " +amount+ " de saldo em sua conta");
    }

    public void ativarCheque(){
        
        if (this.cheque == true){
            System.out.println(" Você já ativou o cheque especial");
            return;
        }

        this.saldo = this.saldo + valorCheque;

        setCheque(true);
        System.out.println(" Você ativou seu cheque especial");

    }

    public void removerCheque(){
        
        if (this.cheque == false){
            System.out.println(" Você não ativou nenhum cheque");
            return;
        }

        this.saldo = this.saldo - this.valorCheque;

        setCheque(false);
        System.out.println(" Você removeu seu cheque especial");

    }

    public void verifyCheque(){
        if (this.cheque == true){
        System.out.println(" O seu cheque está ativado");
        
        } else {
            System.out.println(" O seu cheque não está ativado");
        } 
        
    }

    public void consultarCheque(){
        
        if (this.saldoIni >= 500){

            int a = saldoIni;
            int b = a / 2;

            this.valorCheque = b;

            System.out.printf(" O seu cheque especial equivale a : " + b);

        } else {

            int b = 50;
            
            this.valorCheque = b;

            System.out.printf(" O seu cheque especial equivale a : " + b);



        }

    }
}
