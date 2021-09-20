package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {

        BotaoQuadrado quadrado = new BotaoQuadrado();
        quadrado.desenheQuadrado(2, 3);
        quadrado.desenhe("Azul");
        quadrado.aperte(0);
        quadrado.mova(0);
        quadrado.imprimir();

        BotaoRedondo redondo = new BotaoRedondo();
        redondo.desenheRedondo(5);
        redondo.desenhe("Vermelho");
        redondo.aperte(1);
        redondo.mova(1);
        redondo.imprimir();
    }
}
