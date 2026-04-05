class Equipo {

    private String nombre;
    private String color;
    private int puntos;

    Equipo(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.puntos = 0;
    }

    String nombre() {
        return nombre;
    }

    String color() {
        return color;
    }

    int puntos() {
        return puntos;
    }

    void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }
}