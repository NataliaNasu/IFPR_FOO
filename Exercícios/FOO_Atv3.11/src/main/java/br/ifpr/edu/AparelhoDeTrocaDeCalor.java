package br.ifpr.edu;

public class AparelhoDeTrocaDeCalor extends Equipamento {
    int areaDaSuperficieDiametroDoTubo;
    int comprimentoDoTubo;
    int pressaoDoTubo;
    double pressaoDaConcha;

    public void imprimir() {
        System.out.println("\n   >>> Aparelho De Troca De Calor <<<");
        System.out.println("-------------------------------------------");
        super.imprimir();
        System.out.println("Área da Superfície Diametro do Tubo: " + areaDaSuperficieDiametroDoTubo + " cm");
        System.out.println("Comprimento do Tubo: " + comprimentoDoTubo + " m");
        System.out.println("Pressão do Tubo: " + pressaoDoTubo + " atm");
        System.out.println("Pressão da Concha: " + pressaoDaConcha + " atm");
    }
}