package designpatterns.state.connection;

public class Closed extends State{

    @Override
    public void iniciar(Conexion conexion) {
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setState(new Ready());
        conexion.setEstado(Estado.PREPARADO);
    }

    @Override
    public void cerrar(Conexion conexion) {
        //Do nothing
    }

    @Override
    public void parar(Conexion conexion) {
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
    	throw new UnsupportedOperationException("Acción no permitida... ");
    }
    
}
