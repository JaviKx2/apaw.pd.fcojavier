package designpatterns.state.connection;

public abstract class State {
    public abstract Estado getEstado();

    public abstract void iniciar(Conexion conexion);

    public abstract void abrir(Conexion conexion);

    public abstract void cerrar(Conexion conexion);

    public abstract void parar(Conexion conexion);

    public abstract void enviar(Conexion conexion, String msg);

    public abstract void recibir(Conexion conexion, int respuesta);
}
