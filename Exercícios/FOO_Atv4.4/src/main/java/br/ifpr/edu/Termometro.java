package br.ifpr.edu;

public class Termometro {
    private double temperatura;

    public Termometro() {

    }

    public Termometro(double temperatura){
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void imprimir() {
        System.out.println("\n----------------------");
        System.out.println("Temperatura = " + temperatura + "oC");
        System.out.println("----------------------");
    }
}
