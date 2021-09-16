package br.ifpr.edu;

public class Termostato {
    private int tempMin;
    private int tempMax;
    private int tempAtual;
    private int tempDesejada;

    public void temperatura(int tempMin, int tempMax) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.tempAtual = 0;
    }

    public void tempDesejada(int temp) {
        if ((temp >= this.tempMin) && (temp <= this.tempMax))
            this.tempDesejada = temp;
        else
            System.out.println(">> Temperatura Indisponível <<");
    }

    public void imprimir() {
        System.out.println("------------------------------");
        System.out.println("\t\tTemperatura = " + this.tempDesejada);
        System.out.println("------------------------------\n");
    }
}
