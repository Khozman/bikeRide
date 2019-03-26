package bicycles.specification;

import bicycles.BicycleType;

public class BicycleSpecification {
    private final BicycleType bicycleType;
    /*private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;

    }
    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrakeSpeed() {
        return brakeSpeed;
    }*/

    private int accelerationSpeed;
    private int brakeSpeed;
    // add a variable for brakeSpeed

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        // existing code above this
        this.bicycleType = bicycleType;
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }
    // add getters for brakeSpeed
}