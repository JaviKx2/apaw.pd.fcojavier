package designpatterns.memento.calculator;

import designpatterns.commando.calculator.AddCommand;
import designpatterns.commando.calculator.Calculator;
import designpatterns.commando.calculator.CommandManager;
import designpatterns.commando.calculator.PrintCommand;
import designpatterns.commando.calculator.ResetCommand;
import designpatterns.commando.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainMementableCalculator {
    private CommandManager commandManager;

    public MainMementableCalculator() {
        Calculator calculator = new MementableCalculator();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        
        MementoManager<MementableCalculatorMemento> mementoManager;
        mementoManager = new MementoManager<>();
        this.commandManager.add(new SaveCommand(calculator, mementoManager));
        this.commandManager.add(new RestoreCommand(calculator, mementoManager));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainMementableCalculator());
    }
}
