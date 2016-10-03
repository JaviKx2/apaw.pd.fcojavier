package designpatterns.state.connection;

public class Wait extends State{

    @Override
    public void iniciar(Conexion conexion) {
    	throw new UnsupportedOperationException("Acción no permitida... ");        
    }

    @Override
    public void abrir(Conexion conexion) {
    	throw new UnsupportedOperationException("Acción no permitida... ");     
    }

    @Override
    public void cerrar(Conexion conexion) {
    	throw new UnsupportedOperationException("Acción no permitida... ");        
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
    	if (respuesta == 0) {
            conexion.setState(new Ready());
            conexion.setEstado(Estado.PREPARADO);
        } else {
        	conexion.setState(new Closed());
        	conexion.setEstado(Estado.CERRADO);
        }
    }

}
