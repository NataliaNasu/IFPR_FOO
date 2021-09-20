package br.ifpr.edu;

public class TanqueDeTetoFlutuante extends Equipamento {
    int volume;
    double pressao;
    int diametro;
    int altura;

    public void imprimir() {
        System.out.println("\n > Tanque de Teto Flutuante <");
        System.out.println("------------------------------");
        super.imprimir();
        System.out.println("Volume: " + volume + " L");
        System.out.println("Pressão: " + pressao + " atm");
        System.out.println("Diâmetro: " + diametro + " m");
        System.out.println("Altura: " + altura + " m");
    }
}
