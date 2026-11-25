public class ReproductorAudio {
    private int volumenActual;
    private String estado;

    public ReproductorAudio() {
        volumenActual = 50;
        estado = "detenido";
    }

    public void play() {
        estado = "reproduciendo";
        System.out.println("Reproduciendo audio.");
    }

    public void pause() {
        if (estado.equals("reproduciendo")) {
            estado = "pausado";
            System.out.println("Audio pausado.");
        } else {
            System.out.println("No se puede pausar porque no está reproduciendo.");
        }
    }

    public void cambiarVolumen(int nuevoVolumen) {
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            volumenActual = nuevoVolumen;
            System.out.println("Volumen cambiado a " + volumenActual);
        } else {
            System.out.println("Volumen inválido. Debe estar entre 0 y 100.");
        }
    }

    public String getEstado() { return estado; }
    public int getVolumenActual() { return volumenActual; }
}
