package br.ifpr.edu;

public class Main {
    public static void main(String[] args) {
        Carga carregamento = new Carga();
        carregamento.partida = "São Paulo";
        carregamento.chegada = "Rio de Janeiro";
        carregamento.duracao = 7;
        carregamento.capacidade = 400;
        carregamento.vagoes = 4;
        carregamento.cargaPerigosa = false;
        carregamento.imprimir();

        Passageiro fulano = new Passageiro();
        fulano.partida = "Londrina";
        fulano.chegada = "Curitiba";
        fulano.duracao = 10;
        fulano.primeiraClasse = true;
        fulano.vagoes = 1;
        fulano.refeicao = false;
        fulano.imprimir();
    }
}
