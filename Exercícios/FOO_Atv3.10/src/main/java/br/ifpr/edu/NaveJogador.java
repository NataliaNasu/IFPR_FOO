package br.ifpr.edu;

public class NaveJogador extends Nave {
    private int vidas;
    private int pontos;
    private boolean podeAtirar;

    public void situacaoJogador(int vidas, int pontos, boolean podeAtirar) {
        this.vidas = vidas;
        this.pontos = pontos;
        this.podeAtirar = podeAtirar;
    }

    public void imprimir() {
        System.out.println("\n >>> JOGADOR <<<");
        super.imprimir();
        System.out.println("Vidas: " + vidas);
        System.out.println("Pontos: " + pontos);
        System.out.println("Pode Atirar: " + podeAtirar);
    }
}