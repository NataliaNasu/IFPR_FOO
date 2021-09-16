class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria();
        contaCorrente.nome = "Nubank";
        contaCorrente.agencia = "0001";
        contaCorrente.conta = "1111 1111 1234 5678";
        contaCorrente.saldo = 15000;
        contaCorrente.imprimir();

        ContaBancaria contaPoupanca = new ContaBancaria();
        contaPoupanca.nome = "Banco do Brasil";
        contaPoupanca.agencia = "0100";
        contaPoupanca.conta = "1234 5678 9999 9999";
        contaPoupanca.saldo = 5000;
        contaPoupanca.imprimir();

        ContaBancaria contaEspecial = new ContaBancaria();
        contaEspecial.nome = "Banco Santander";
        contaEspecial.agencia = "0111";
        contaEspecial.conta = "1234 5555 5555 5678";
        contaEspecial.saldo = 20000;
        contaEspecial.imprimir();
    }
}
