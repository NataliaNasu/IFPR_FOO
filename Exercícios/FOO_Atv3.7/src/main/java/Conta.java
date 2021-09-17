public class Conta {
    private int numConta;
    private String dataAbertura;
    private String dataEncerramento;
    private int situacao;
    private int senha;
    private double saldo;
    private double limite_conta;
    private double saque;

    public void abrirConta(int numConta, int situacao, int senha) {
        this.numConta = numConta;
        this.situacao = situacao;
        System.out.println("\n\n------------------------------");
        if (numConta == 4321)
            System.out.println("Número da conta validado");
        else {
            System.out.println("Número da conta inválido");
            this.numConta = 0;
        }
        if (situacao == 1)
            System.out.println("Conta ativa");
        else
            System.out.println("Conta inativa");
        if (senha == 1234)
            System.out.println("Abrindo...");
        else {
            System.out.println("Senha incorreta!");
            this.senha = 0;
        }
    }

    public void sacarValor(double saldo, double limite_conta, double saque) {
        this.saldo= saldo;
        this.limite_conta = limite_conta;
        this.saque = saque;
        if (saque > saldo) {
            System.out.println("Saldo indisponível!");
            if (saque <= (saldo + limite_conta))
                System.out.println("Saque liberado com uso de crédito!");
            else
                System.out.println("Crédito indisponível");
        } else {
            System.out.println("Quantia liberada!");
        }
    }

    public void imprimir() {
        System.out.println("------------------------------");
        System.out.println("Número da conta: " + numConta);
        System.out.println("Data de Abertura: " + dataAbertura);
        System.out.println("Data de Encerramento: " + dataEncerramento);
        System.out.println("Situação: " + situacao);
        System.out.println("Senha: " + senha);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite da conta: R$" + limite_conta);
    }
}