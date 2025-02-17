public class MementoExample {
    public static void main(String[] args) {

        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        // initiate State of the originator
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 10);

        // save it
        ConfigurationMemento snapshot1 = originator.createMemento();

        // add it to history
        careTaker.addMemento(snapshot1);

        System.out.println("Originator State 1: " + originator.toString());

        // originator changing to new state
        originator.setHeight(7);
        originator.setWidth(12);

        // save it
        ConfigurationMemento snapshot2 = originator.createMemento();

        // add it to history
        careTaker.addMemento(snapshot2);

        System.out.println("Originator State 2: " + originator.toString());

        // originator changing to new state
        originator.setHeight(9);
        originator.setWidth(14);

        System.out.println("Originator State 3: " + originator.toString());

        // UNDO
        ConfigurationMemento restoredStateMemento =  careTaker.undo();
        originator.restoreMemento(restoredStateMemento);

        System.out.println("Restored Originator Memento State from CareTaker: " + originator.toString());

    }
}