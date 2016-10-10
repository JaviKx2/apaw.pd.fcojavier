package designpatterns.command.calculator;

import upm.jbb.IO;

public class AddCommand extends ComandoConcreto{

    public AddCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        calculator.add(IO.getIO().readInt());        
    }

    @Override
    public String name() {
        return "Add";
    }

}
