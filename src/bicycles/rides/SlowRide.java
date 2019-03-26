package bicycles.rides;

import bicycles.Bicycle;

public class SlowRide implements BikeRide {
    private final Bicycle bicycle;

    public SlowRide(Bicycle bicycle){
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
        this.bicycle.stop();
    }

    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}