public class ContaBancaria {
    String nome;
    String agencia;
    String conta;
    double saldo;

    public void imprimir() {
        System.out.println("\n  >>> Conta Bancária <<<");
        System.out.println("---------------------------");System.out.println("Nome: " + nome);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("---------------------------");
    }
}
