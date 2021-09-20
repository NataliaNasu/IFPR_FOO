package br.ifpr.edu;

public class Passageiro extends Trem {
    boolean primeiraClasse;
    boolean refeicao;

    public void imprimir() {
        System.out.println("\n >>> Passageiro <<<");    
        super.imprimir();
        System.out.println("Primeira Classe: " + primeiraClasse);
        System.out.println("Refeição: " + refeicao);
    }
}
