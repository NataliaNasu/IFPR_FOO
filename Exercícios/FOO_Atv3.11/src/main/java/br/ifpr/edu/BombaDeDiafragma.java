package br.ifpr.edu;

public class BombaDeDiafragma extends Equipamento {
    double pressaoDeSuccao;
    double pressaoDeDescarga;
    int taxaDeFluxo;
    String materialDoDiafragma;

    public void imprimir() {
        System.out.println("\n  >>> Bomba de Diafragma <<<");
        System.out.println("------------------------------");
        super.imprimir();
        System.out.println("Pressão de Sucção: " + pressaoDeSuccao + " atm");
        System.out.println("Pressão de Descarga: " + pressaoDeDescarga + " atm");
        System.out.println("Taxa de Fluxo: " + taxaDeFluxo + " I/h");
        System.out.println("material Do Diafragma: " + materialDoDiafragma);
    }
}
