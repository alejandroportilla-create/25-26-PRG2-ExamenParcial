class Liga {

    private String nombre;
    private Equipo[] equipos;
    private Partido[] partidos;
    private int numEquipos;
    private int numPartidos;

    public Liga(String nombre, int maxEquipos, int maxPartidos) {
        this.nombre = nombre;
        this.equipos = new Equipo[maxEquipos];
        this.partidos = new Partido[maxPartidos];
        this.numEquipos = 0;
        this.numPartidos = 0;
    }

    public void agregarEquipo(Equipo equipo) {
        equipos[numEquipos] = equipo;
        numEquipos++;
    }

    public void programarPartido(Equipo local, Equipo visitante, String fecha) {
        partidos[numPartidos] = new Partido(local, visitante, fecha);
        numPartidos++;
    }

    public void registrarResultado(Partido partido, int golesLocal, int golesVisitante) {

        partido.registrarResultado(golesLocal, golesVisitante);

        if (golesLocal > golesVisitante) {
            partido.local().sumarPuntos(3);
        } else if (golesLocal < golesVisitante) {
            partido.visitante().sumarPuntos(3);
        } else {
            partido.local().sumarPuntos(1);
            partido.visitante().sumarPuntos(1);
        }
    }

    public Equipo[] clasificacion() {

        Equipo[] copia = new Equipo[numEquipos];

        for (int i = 0; i < numEquipos; i++) {
            copia[i] = equipos[i];
        }

        for (int i = 0; i < numEquipos - 1; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                if (copia[j].puntos() > copia[i].puntos()) {
                    Equipo aux = copia[i];
                    copia[i] = copia[j];
                    copia[j] = aux;
                }
            }
        }

        return copia;
    }

    public Partido[] partidosPendientes() {

        int contador = 0;

        for (int i = 0; i < numPartidos; i++) {
            if (!partidos[i].estaJugado()) {
                contador++;
            }
        }

        Partido[] pendientes = new Partido[contador];
        int j = 0;

        for (int i = 0; i < numPartidos; i++) {
            if (!partidos[i].estaJugado()) {
                pendientes[j] = partidos[i];
                j++;
            }
        }

        return pendientes;
    }
}