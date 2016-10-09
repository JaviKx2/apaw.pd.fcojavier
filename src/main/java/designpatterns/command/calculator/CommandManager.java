package designpatterns.command.calculator;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, Comando> commands = new HashMap<>();

    public void add(Comando comando) {
        this.commands.put(comando.name(), comando);
    }

    public void execute(String key) {
        this.commands.get(key).execute();
    }

    public String[] keys() {
        return this.commands.keySet().toArray(new String[0]);
    }
}
