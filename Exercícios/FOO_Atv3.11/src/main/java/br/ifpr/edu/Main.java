package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
        AparelhoDeTrocaDeCalor modelo1 = new AparelhoDeTrocaDeCalor();
        modelo1.nome = "E302";
        modelo1.fabricante = "Brown";
        modelo1.peso = 5000;
        modelo1.preco = 20000;
        modelo1.areaDaSuperficieDiametroDoTubo = 2;
        modelo1.comprimentoDoTubo = 6;
        modelo1.pressaoDoTubo = 15;
        modelo1.pressaoDaConcha = 1.7;
        modelo1.imprimir();

        TanqueDeTetoFlutuante tanque = new TanqueDeTetoFlutuante();
        tanque.nome = "T111";
        tanque.fabricante = "Simplex";
        tanque.peso = 10000;
        tanque.preco = 50000;
        tanque.volume = 400000;
        tanque.pressao = 1.1;
        tanque.diametro = 8;
        tanque.altura = 9;
        tanque.imprimir();

        BombaDeDiafragma bomba = new BombaDeDiafragma();
        bomba.nome = "P101";
        bomba.fabricante = "Simplex";
        bomba.peso = 100;
        bomba.preco = 5000;
        bomba.pressaoDeSuccao = 1.1;
        bomba.pressaoDeDescarga = 3.3;
        bomba.taxaDeFluxo = 300;
        bomba.materialDoDiafragma = "Teflon";
        bomba.imprimir();
    }
}
