package br.ifpr.edu;

public class BotaoRedondo extends Botao {
    private int raio;
       
    public void desenheRedondo(int raio) {
        this.raio = raio;
        System.out.println("\n\n==================");
        System.out.println("~ Botao Redondo ~ ");
    }

    public void imprimir() {
        System.out.println("\n >>> REDONDO <<<");
        super.imprimir();
        System.out.println("Raio: " + raio);
    }
}
