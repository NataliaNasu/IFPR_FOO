public class Pessoa {
    String nome;
    String endereco;
    String fone;
    String email;

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Fone: " + fone);
        System.out.println("Email: " + email);
    }
}