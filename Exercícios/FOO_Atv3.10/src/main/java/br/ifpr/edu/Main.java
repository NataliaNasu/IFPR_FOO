package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
        NaveJogador jogador1 = new NaveJogador();
        jogador1.situacaoNave(10, 50, 1);
        jogador1.situacaoJogador(3, 0, true);
        jogador1.imprimir();

        NaveBonus bonus1 = new NaveBonus();
        bonus1.situacaoNave(20, 25, 1);
        bonus1.contador(5);
        bonus1.imprimir();

        NaveInvasor invasor1 = new NaveInvasor();
        invasor1.situacaoNave(5, 25, -1);
        invasor1.imprimir();
    }
}
