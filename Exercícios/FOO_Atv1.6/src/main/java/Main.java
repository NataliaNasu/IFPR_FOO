public class Main {
    public static void main(String[] args) {
        Termometro termometro1 = new Termometro();
        termometro1.temperatura = 37.6;
        termometro1.obterTemperatura();
        termometro1.imprimir();

        Termometro termometro2 = new Termometro();
        termometro2.temperatura = 36.2;
        termometro2.obterTemperatura();
        termometro2.imprimir();

        Termometro termometro3 = new Termometro();
        termometro3.temperatura = 39.8;
        termometro3.obterTemperatura();
        termometro3.imprimir();
    }
}
