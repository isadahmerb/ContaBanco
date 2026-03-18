package org.example;

public class conta{
    int cont = 0;
    int num = 0;
    String tipo;
    String dono;
    double saldo;
    boolean status;



    public conta(String t, String d) {
        cont++;
        this.num = cont;
        this.tipo = t;
        this.dono = d;
        this.status = true;

        if (t.equals("cc")) {
            this.saldo = 50;
        }
        if (t.equals("cp")) {
            this.saldo = 150;
        }
    }
    public void status(){
        System.out.println(" o numero da conta e " + this.num);
        System.out.println("o dono " + this.dono);
        System.out.println("tipo  " + this.tipo);
        System.out.println("saldo " + this.saldo);
    }

    public void FecharC(){

    }

    public void Sacar(){

    }

    public void Depositar(){

    }

    public void PagarT(){

    }

}
