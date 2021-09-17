public class Fornecedor extends Pessoa {
    String cnpj;
    String ie;

    public void imprimir() {
        System.out.println("\n   >>> FORNECEDOR <<<");
        super.imprimir();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("IE: " + ie);
    }
}
