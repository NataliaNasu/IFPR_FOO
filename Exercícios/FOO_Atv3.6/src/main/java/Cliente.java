public class Cliente extends Pessoa {
    String cpf;
    String rg;

    public void imprimir() {
        System.out.println("\n    >>> CLIENTE <<<");
        super.imprimir();
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }
}
