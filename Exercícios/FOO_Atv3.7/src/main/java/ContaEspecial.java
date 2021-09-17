public class ContaEspecial extends Conta {
    private double jurosMensal;
    private double saldo;

    public double jurosConta(double saldo) {
        this.saldo = saldo;
        jurosMensal = saldo * 2 / 100;
        return jurosMensal;
    }

    public void imprimir() {
        System.out.println("------------------------------");
        System.out.println("   >>> Conta Especial <<<");
        super.imprimir();
        System.out.println("Juros mensal: " + jurosMensal);
        System.out.println("------------------------------");
    }
}