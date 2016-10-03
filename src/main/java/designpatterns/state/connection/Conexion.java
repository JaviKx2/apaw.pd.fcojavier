package designpatterns.state.connection;

public class Conexion {
    private Estado estado;
    
    private State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = Estado.CERRADO;
        this.state = new Stopped();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void setEstado(Estado estado){
    	this.estado = estado;
    }

    public void abrir() {
        state.abrir(this);
    }
    
    public void cerrar() {
        state.cerrar(this);
    }
    
    public void parar() {
        state.parar(this);
    }
    
    public void iniciar() {
        state.iniciar(this);
    }
    
    public void enviar(String message) {
        state.enviar(this, message);
    }
    
    public void recibir(int number) {
        state.recibir(this, number);
    }
}
