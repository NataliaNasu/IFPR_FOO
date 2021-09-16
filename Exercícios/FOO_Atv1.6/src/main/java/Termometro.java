public class Termometro {
    double temperatura;

    double obterTemperatura() {
        return temperatura;
    }

    public void imprimir() {
        System.out.println("\n----------------------");
        System.out.println("Temperatura = " + temperatura + "ºC");
        System.out.println("----------------------");
    }
}
