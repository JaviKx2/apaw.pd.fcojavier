package designpatterns.state.connection;

public class Conexion {
    private State state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.state = new Closed();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.state.getEstado();
    }

    public void setState(State state) {
        this.state = state;
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
    
    public void accionNoPermitida(){
        throw new UnsupportedOperationException("Acción no permitida... ");
    }
}
