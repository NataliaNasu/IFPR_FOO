public class Main {
    public static void main(String[] args) {
        ContaEspecial especial01 = new ContaEspecial();
        especial01.abrirConta(4321, 1, 1234);
        especial01.sacarValor(5000, 2000, 2500);
        especial01.jurosConta(2500);
        especial01.imprimir();

        ContaEspecial especial02 = new ContaEspecial();
        especial02.abrirConta(9999, 0, 4321);
        especial02.sacarValor(500, 1500, 2500);
        especial02.jurosConta(500);
        especial02.imprimir();

        ContaPoupanca poupanca01 = new ContaPoupanca();
        poupanca01.abrirConta(4321, 1, 1234);
        poupanca01.sacarValor(2000, 1000, 500);
        poupanca01.rendaConta(1000, "Vencida");
        poupanca01.imprimir();

        ContaPoupanca poupanca02 = new ContaPoupanca();
        poupanca02.abrirConta(5678, 0, 9999);
        poupanca02.sacarValor(500, 1000, 2000);
        poupanca02.rendaConta(500, "À vencer...");
        poupanca02.imprimir();
    }
}
