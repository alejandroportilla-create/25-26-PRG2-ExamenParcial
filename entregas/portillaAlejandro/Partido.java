class Partido {

    private Equipo local;
    private Equipo visitante;
    private String fecha;
    private int golesLocal;
    private int golesVisitante;
    private boolean jugado;

    Partido(Equipo local, Equipo visitante, String fecha) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.jugado = false;
    }

    void registrarResultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.jugado = true;
    }

    boolean estaJugado() {
        return jugado;
    }

    Equipo local() {
        return local;
    }

    Equipo visitante() {
        return visitante;
    }

    int golesLocal() {
        return golesLocal;
    }

    int golesVisitante() {
        return golesVisitante;
    }
}