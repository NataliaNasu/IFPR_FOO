public class Main {
    public static void main(String[] args) {
        
        Livro javaAvancado = new Livro();
        javaAvancado.descontoLivro("Java Avançado", 88.0, 30);
        javaAvancado.imprimir();;

        Livro javaIniciante = new Livro();
        javaIniciante.descontoLivro("Java para Iniciantes", 88.0, 90);
        javaIniciante.imprimir();
    }
}
