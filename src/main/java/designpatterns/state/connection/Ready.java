package designpatterns.state.connection;

public class Ready extends State{

    @Override
    public void iniciar(Conexion conexion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void abrir(Conexion conexion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(this); 
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(this);       
    }

    @Override
    public void enviar(Conexion conexion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void recibir(Conexion conexion) {
        // TODO Auto-generated method stub
        
    }

}
