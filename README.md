# Reto Sofka
## Leer por favor
### El readme tiene como objetivo aclarar las funcionalidades que tiene mi proyecto, ya que el proyecto podia ser entendido de diferentes maneras.
### Envié un correo para aclarar algunas dudas, pero no fue respondido.
1. Todos los datos han sido guardados en una base de datos que están en un servidor remoto. La estructura de la base de datos se puede encontrar en la carpeta local del proyecto y puede ser guardada o creada de forma local, cambiando lo datos de conexion en el archivo conexion.java del proyecto
1. El ejercicio decia, que un jugador podia ser un conductor, yo lo interprete que un jugador antes de iniciar la carrera escogia un conductor, por lo que agregue un lista de 10 conductores con el fin de que cada jugador escogiera un conductor.
1. Defini que cada conductor tenia un carro o automovil, por lo que esta relacion ya esta definida. Es decir, el conductor siempre va tener el mismo vehiculo. Conductor y jugador son distintos. Un jugador es creado en consola, pero un conductor ya está creado. Un jugador se asocia con un conductor. 
1. También cree tabla pista, esta tabla pista tiene varias lugares para realizar la carrera, el usuario elige cual. Esta tabla pista, se relaciona con la tabla carro, generando una relacion muchos a muchos donde irá la posicion de los carros con su posicion o numero de carril
1. Para acceder al historial de cada carrera de una forma mas facil, cree una tabla juego  que tendrá un id y una fecha, esta tabla se relaciona con la tabla jugadores. Generando una relacion muchos a muchos que es la tabla juego_jugadores, en esta tabla quedará guardado el podio del juego. es decir la posicion en la que llego cada jugador
1. El historial o la cantidad de veces que ha ganado un conductor quedará  guardado en la tabla conductores. En el ejercicio decia conductores, pero podia ser interpretado tambien como jugadores, puesto  que inicialmente defini que cada jugador debia elegir un conductor, el conductor es el que guardara el historial de ganadas es decir cada vez que quede de primer puesto aumentara 1. 


<img src="/Captura.PNG" alt="db"/>
