package designpatterns.memento.calculator;

import designpatterns.commando.calculator.Calculator;
import upm.jbb.IO;

public class RestoreCommand extends MementableCommand{

    public RestoreCommand(Calculator calculator, MementoManager<MementableCalculatorMemento> mementoManager) {
        super(calculator, mementoManager);
    }

    @Override
    public void execute() {
        String mementoName = IO.getIO().readString("Restore point name");
        MementableCalculatorMemento memento = getMementoManager().getMemento(mementoName);
        ((MementableCalculator) calculator).restoreMemento(memento);
    }

    @Override
    public String name() {
        return "Restore an old total";
    }

}
