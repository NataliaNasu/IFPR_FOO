public class ContaPoupanca extends Conta {
    private double saldo;
    private double rendimento;
    private String dataAniversario;

    public double rendaConta(double saldo, String dataAniversario) {
        this.saldo = saldo;
        this.dataAniversario = dataAniversario;
        rendimento = saldo * 5 /100;
        if ((saldo > 0) && (dataAniversario == "Vencida"))
            System.out.println("Rendimento mensal: R$" + rendimento);
        else
            System.out.println("Rendimento mensal inexistente");
        return rendimento;
    }

    public void imprimir() {
        System.out.println("------------------------------");
        System.out.println("      >>> Poupança <<<");
        super.imprimir();
        System.out.println("Data de Aniversário: " + dataAniversario);
        System.out.println("------------------------------");
    }
}