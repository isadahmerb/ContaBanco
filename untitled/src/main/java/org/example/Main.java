package org.example;

public class Main {
    public static void main(String[] args) {
        conta c1 = new conta("cc", "isa");
        c1.Depositar();
        c1.PagarT();
        c1.status();
        c1.Sacar();

        conta c2 = new conta("cp", "daniel");
        c2.Depositar();
        c2.PagarT();
        c2.status();
        c2.Sacar();
        c2.PagarT();
        c2.FecharC();

    }
}