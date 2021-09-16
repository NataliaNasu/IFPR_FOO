package br.edu.ifpr;

public class Main {
    public static void main(String[] args) {
        Matematica calculadora1 = new Matematica(); 
        double adicao = calculadora1.somar(6.0, 4.0);
        System.out.println("\nAdicao = " + adicao);

        Matematica calculadora2 = new Matematica();
        double subtracao = calculadora2.subtrair(6.0, 4.0);
        System.out.println("\nSubtracao = " + subtracao);

        Matematica calculadora3 = new Matematica();
        double multiplicacao = calculadora3.multiplicar(6.0, 4.0);
        System.out.println("\nMultiplicacao = " + multiplicacao);
    }
}
