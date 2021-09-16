public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public void informaHora(int hora) {
        this.hora = hora;
        if ((this.hora <= 24) && (this.hora >= 0)) {
          this.hora = hora;
        } else {
          System.out.println("\nHora inválida");
          this.hora = 0;
        }
    }

    public void informaMinuto(int minuto) {
        this.minuto = minuto;
        if ((this.minuto <= 60) && (this.minuto >= 0)) {
          this.minuto = minuto;
        } else {
          System.out.println("Minuto inválido");
          this.minuto = 0;
        }
    }

    public void informaSegundo(int segundo) {
        this.segundo = segundo;
        if ((this.segundo <= 60) && (this.segundo >= 0)) {
          this.segundo = segundo;
        } else {
          System.out.println("Segundo inválido");
          this.segundo = 0;
        }
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("\tHorário: " + hora + ":" + minuto + ":" + segundo);
        System.out.println("------------------------\n");
    }
}
