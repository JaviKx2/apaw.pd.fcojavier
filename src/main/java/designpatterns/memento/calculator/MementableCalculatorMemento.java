package designpatterns.memento.calculator;

public class MementableCalculatorMemento {
    int total;
    
    public MementableCalculatorMemento(int total){
        this.total = total;
    }

    public int getState() {
        return total;
    }

    public void setState(int total) {
        this.total = total;
    }
}
