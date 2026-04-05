## Clase Equipo

Guarda la información básica de cada equipo de la liga. Cada equipo tiene un nombre, un color y los puntos acumulados a lo largo de la competición.

Se encarga de gestionar sus propios puntos, permitiendo consultarlos y actualizarlos cuando se registran los resultados de los partidos. Es una clase sencilla que representa el estado de cada equipo dentro de la liga.


## Clase Partido

Representa un enfrentamiento entre dos equipos en una fecha determinada. Un partido conoce a su equipo local y visitante, además del resultado cuando este se registra.

Permite saber si el partido ha sido jugado o si sigue pendiente. También se encarga de almacenar los goles de cada equipo cuando se introduce el resultado. Es fundamental para relacionar equipos y organizar la competición.


## Clase Liga

Es la clase principal del sistema y la encargada de coordinar toda la lógica. Gestiona los equipos y los partidos de la liga utilizando arrays.

Permite añadir equipos y programar partidos entre ellos, controlando en todo momento cuántos elementos hay mediante contadores. También permite registrar los resultados de los partidos, actualizando automáticamente los puntos de los equipos según las reglas (victoria, empate o derrota).

Además, proporciona métodos para obtener la clasificación de la liga, ordenando los equipos por puntos, y para consultar los partidos pendientes, es decir, aquellos que aún no se han jugado.


## Clase Principal (Main)

Es el punto de entrada del programa donde se crea la liga y se ejecuta el escenario. Aquí se instancian los equipos, se agregan a la liga, se programan los partidos y se registran los resultados.

También permite comprobar el funcionamiento del sistema consultando la clasificación y los partidos pendientes.