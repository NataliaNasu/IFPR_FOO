package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
        Termometro digital01 = new Termometro();
        digital01.setTemperatura(37.6);
        digital01.imprimir();

        Termometro digital02 = new Termometro();
        digital02.setTemperatura(36.2);
        digital02.imprimir();

        Termometro digital03 = new Termometro();
        digital03.setTemperatura(39.8);
        digital03.imprimir();
    }
}
