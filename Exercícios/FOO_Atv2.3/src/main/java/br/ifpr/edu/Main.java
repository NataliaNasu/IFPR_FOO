package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
    
        Termostato forno = new Termostato();
        forno.temperatura(120, 300);
        forno.tempDesejada(180);
        forno.imprimir();

        Termostato fogao = new Termostato();
        fogao.temperatura(100, 300);
        fogao.tempDesejada(1200);
        fogao.imprimir();
    }
}