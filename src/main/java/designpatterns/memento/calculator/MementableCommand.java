package designpatterns.memento.calculator;

import designpatterns.commando.calculator.Calculator;
import designpatterns.commando.calculator.ComandoConcreto;

public abstract class MementableCommand extends ComandoConcreto{

    private MementoManager<MementableCalculatorMemento> mementoManager;
    
    public MementableCommand(Calculator calculator, MementoManager<MementableCalculatorMemento> mementoManager) {
        super(calculator);
        this.mementoManager = mementoManager;
    }

    public abstract void execute();

    public abstract String name();
    
    protected MementoManager<MementableCalculatorMemento> getMementoManager(){
        return this.mementoManager;
    }
}
