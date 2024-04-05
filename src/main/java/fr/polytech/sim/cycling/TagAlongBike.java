package fr.polytech.sim.cycling;

public class TagAlongBike extends Bike {
    /**
     * Default constructor
     */
    public TagAlongBike() {
        this(new SimpleBike());
    }

    public TagAlongBike(SimpleBike bike) {
        super.components.add(bike);
    }
}
