package designpatterns.state.connection;

public class Wait extends State{

    @Override
    public void iniciar(Conexion conexion) {
        conexion.accionNoPermitida();      
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
        conexion.accionNoPermitida();
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.accionNoPermitida();
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
    	if (respuesta == 0) {
            conexion.setState(new Ready());
        } else {
        	conexion.setState(new Closed());
        }
    }
    
    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }

}
