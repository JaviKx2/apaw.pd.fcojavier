package designpatterns.commando.calculator;

public abstract class ComandoConcreto implements Comando{
    protected Calculator calculator;
    
    public ComandoConcreto(Calculator calculator){
        this.calculator = calculator;
    }
    
    public abstract void execute();

    public abstract String name();

}
