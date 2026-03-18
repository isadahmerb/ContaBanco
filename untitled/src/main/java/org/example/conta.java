package org.example;
import java.util.Scanner;


public class conta{
    public static int cont = 0;
    public int num = 0;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    Scanner sc = new Scanner(System.in);


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
        System.out.println("N=" + this.num);
        System.out.println("Pertence a " + this.dono);
        System.out.println("tipo : " + this.tipo);
        System.out.println("saldo = " + this.saldo);
    }

    public void FecharC(){
        if (this.saldo < 0) {
            System.out.println("PAGUE SUAS DIVIDAS IMEDIATAMENTE!!!!!!!!!");
        }
        status = false;
        System.out.println("CONTA ENCERRADA");
    }

    public void Sacar(){
        double s;
        System.out.println("Qual o valor do saque? ");
        s = sc.nextDouble();
        saldo = saldo - s;
        System.out.println(saldo);
    }

    public double Depositar(){
        double d;
        System.out.println("Quanto q voce vai depositar?");
        d = sc.nextDouble();
        saldo = saldo + d;
        System.out.println(saldo);

        return d;
    }

    public void PagarT(){
        if (tipo.equals("cc")) {
            this.saldo = saldo - 12.00;
        }
        if (tipo.equals("cp")) {
            this.saldo = saldo - 20.00;
        }
        if (saldo > 0) {
            System.out.println("DIVIDAS");
        }
    }

}
