package designpatterns.state.connection;

public class Stopped extends State {

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setState(new Ready());
	}

	@Override
	public void abrir(Conexion conexion) {
	    conexion.accionNoPermitida();
	}

	@Override
	public void cerrar(Conexion conexion) {
	    conexion.accionNoPermitida();
	}

	@Override
	public void parar(Conexion conexion) {
		// Do nothing
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
	    conexion.accionNoPermitida();
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
	    conexion.accionNoPermitida();
	}
	
    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }

}
