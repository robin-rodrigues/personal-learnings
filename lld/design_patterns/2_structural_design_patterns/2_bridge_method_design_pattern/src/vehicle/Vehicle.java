package vehicle;

import workshop.Workshop;

public abstract class Vehicle {
    public Workshop workshop1;
    public Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract public void manufacture();
}
