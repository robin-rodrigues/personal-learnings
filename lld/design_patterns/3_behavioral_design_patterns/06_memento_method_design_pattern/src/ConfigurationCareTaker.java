import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento) {
        history.add(memento);
    }

    public ConfigurationMemento undo() {
        if(!history.isEmpty()) {
            // get the last memento from the list
            ConfigurationMemento lastMemento = history.getLast();

            // remove the last memento from the list row
            history.remove(lastMemento);

            return lastMemento;
        }

        return null;
    }
}