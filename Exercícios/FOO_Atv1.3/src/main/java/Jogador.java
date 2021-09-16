public class Jogador {
    String nome;
    String time;
    int numeroCamisa;

    void chutar() {
        if (numeroCamisa == 10)
            System.out.println("\nChutar para o gol!");
        else
            System.out.println("\nChutar para o atacante");
    }

    void imprimir(){
        System.out.println("-------------------------");
        System.out.println("Nome = " + nome);
        System.out.println("Time = " + time);
        System.out.println("Numero da camisa = " + numeroCamisa);
        System.out.println("-------------------------");
    }
}
