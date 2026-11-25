public class main {
    public static void main(String[] args) {
        ReproductorAudio reproductor = new ReproductorAudio();
        ControlRemoto control = new ControlRemoto(reproductor);

        control.reproducir();
        control.cambiarVolumen(75);
        control.pausar();

        System.out.println("Estado final: " + reproductor.getEstado());
        System.out.println("Volumen final: " + reproductor.getVolumenActual());
    }
}
