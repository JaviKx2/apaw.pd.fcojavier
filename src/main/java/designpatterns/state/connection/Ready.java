package designpatterns.state.connection;

public class Ready extends State{

    @Override
    public void iniciar(Conexion conexion) {
    	// Do nothing
    }

    @Override
    public void abrir(Conexion conexion) {
    	//Do nothing
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(new Closed());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new Stopped());  
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
    	conexion.getLink().enviar(msg);
    	conexion.setState(new Wait());     
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        conexion.accionNoPermitida();      
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
