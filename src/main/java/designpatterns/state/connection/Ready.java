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
        conexion.setEstado(Estado.CERRADO);
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new Stopped());  
        conexion.setEstado(Estado.PARADO);
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
    	conexion.getLink().enviar(msg);
    	conexion.setState(new Wait());     
    	conexion.setEstado(Estado.ESPERANDO);
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
    	throw new UnsupportedOperationException("Acción no permitida... ");       
    }

}
