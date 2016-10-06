package designpatterns.memento.calculator;

import designpatterns.commando.calculator.Calculator;
import upm.jbb.IO;

public class SaveCommand extends MementableCommand{

    public SaveCommand(Calculator calculator, MementoManager<MementableCalculatorMemento> mementoManager) {
        super(calculator, mementoManager);
    }

    @Override
    public void execute() {
        String mementoName = IO.getIO().readString("Restore point name");
        MementableCalculatorMemento memento = new MementableCalculatorMemento(calculator.getTotal());
        getMementoManager().addMemento(mementoName, memento);
    }

    @Override
    public String name() {
        return "Save current total";
    }

}
