package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideTwo implements BikeRide {
    private final Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.stop();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}