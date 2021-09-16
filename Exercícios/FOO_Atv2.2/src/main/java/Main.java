public class Main {
    public static void main(String[] args) {

        Relogio horario = new Relogio();
        horario.informaHora(30);
        horario.informaMinuto(80);
        horario.informaSegundo(-40);
        horario.imprimir();

        Relogio horario2 = new Relogio();
        horario2.informaHora(10);
        horario2.informaMinuto(20);
        horario2.informaSegundo(30);
        horario2.imprimir();
    }
}
