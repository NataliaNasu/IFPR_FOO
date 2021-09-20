package br.ifpr.edu;

public class NaveBonus extends Nave {
    private int contador;

    public void contador(int contador) {
        this.contador = contador;
    }

    public void imprimir() {
        System.out.println("\n >>> BONUS <<<");
        super.imprimir();
        System.out.println("Contador: " + contador);
    }
}