package designpatterns.state.connection;

public abstract class State {
    public abstract void iniciar(Conexion conexion);

    public abstract void abrir(Conexion conexion);

    public abstract void cerrar(Conexion conexion);

    public abstract void parar(Conexion conexion);

    public abstract void enviar(Conexion conexion);

    public abstract void recibir(Conexion conexion);

}
