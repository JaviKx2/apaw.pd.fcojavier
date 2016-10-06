package designpatterns.commando.calculator;

public class ResetCommand extends ComandoConcreto{

    public ResetCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        calculator.reset();        
    }

    @Override
    public String name() {
        return "Reset";
    }

}
