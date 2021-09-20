package br.ifpr.edu;

public class Carga extends Trem {
    int capacidade;
    boolean cargaPerigosa;

    public void imprimir() {
        System.out.println("\n    >>> Carga <<<");
        super.imprimir();
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Carga Perigosa: " + cargaPerigosa);
    }
}
