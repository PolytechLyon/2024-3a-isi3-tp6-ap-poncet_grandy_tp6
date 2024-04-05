package fr.polytech.sim.cycling;

public class TagAlongBike extends Bike {
    public TagAlongBike(SimpleBike bike) {
        super.components.add(bike);
    }
}
