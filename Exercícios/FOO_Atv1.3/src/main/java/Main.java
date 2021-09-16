public class Main {
    public static void main(String[] args) {
        Jogador marta = new Jogador();
        marta.nome = "Marta";
        marta.time = "Brasil";
        marta.numeroCamisa = 10;
        marta.chutar();
        marta.imprimir();

        Jogador neymar = new Jogador();
        neymar.nome = "Neymar";
        neymar.time = "Paris";
        neymar.numeroCamisa = 10;
        neymar.chutar();
        neymar.imprimir();

        Jogador ronaldinho = new Jogador();
        ronaldinho.nome = "Ronaldinho Gaúcho";
        ronaldinho.time = "Brasil";
        ronaldinho.numeroCamisa = 7;
        ronaldinho.chutar();
        ronaldinho.imprimir();
    }
}
