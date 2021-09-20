package br.ifpr.edu;

public class Trem {
    String partida;
    String chegada;
    int duracao;
    int vagoes;

    public void imprimir() {
        System.out.println("----------------------");
        System.out.println("Partida: " + partida);
        System.out.println("Chegada: " + chegada);
        System.out.println("Duração: " + duracao);
        System.out.println("Vagões: " + vagoes);
    }
}
