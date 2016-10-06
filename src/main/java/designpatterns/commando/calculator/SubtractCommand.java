package designpatterns.commando.calculator;

import upm.jbb.IO;

public class SubtractCommand extends ComandoConcreto{

    public SubtractCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        this.calculator.subtract(IO.getIO().readInt());      
    }

    @Override
    public String name() {
        return "Subtract";
    }

}
