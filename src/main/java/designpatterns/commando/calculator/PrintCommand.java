package designpatterns.commando.calculator;

import upm.jbb.IO;

public class PrintCommand extends ComandoConcreto{

    public PrintCommand(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void execute() {
        IO.getIO().println(calculator.getTotal());
    }

    @Override
    public String name() {
        return "Print";
    }

}
