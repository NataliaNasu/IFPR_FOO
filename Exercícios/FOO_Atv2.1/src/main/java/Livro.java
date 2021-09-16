public class Livro {
    private String titulo;
    private double valor;
    private double desconto;
    private double descontoReal;
    private double valorFinal;

    public void descontoLivro(String titulo, double valor, double desconto) {
        this.titulo = titulo;
        this.valor = valor;
        if (desconto > 50) {
          System.out.println(">>>> DESCONTO INVÁLIDO! <<<<");
          this.valorFinal = valor;
        } else {
          this.desconto = desconto;
          this.descontoReal = valor * (desconto / 100);
          this.valorFinal = valor - descontoReal;
        }
    }

    public void imprimir() {
        System.out.println("=========== DADOS ===========");
        System.out.println("Título: " + titulo);
        System.out.println("Valor: R$" + valor);
        System.out.println("Desconto em %: " + desconto);
        System.out.println("========= RESULTADO =========");
        System.out.println("Preco Final: R$" + valorFinal);
        System.out.println("Com desconto de: R$ " + descontoReal);
        System.out.println("=============================\n");
    }
}