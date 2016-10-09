package designpatterns.memento.calculator;

import designpatterns.commando.calculator.Calculator;

public class MementableCalculator extends Calculator implements Mementable<MementableCalculatorMemento>{
     
    @Override
    public MementableCalculatorMemento createMemento() {
        return new MementableCalculatorMemento(this.getTotal());
    }

    @Override
    public void restoreMemento(MementableCalculatorMemento memento) {
        this.setTotal(memento.getState());
    }

}
