package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
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
    }

    /*private int accelerationSpeed;
    // add a variable for brakeSpeed

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        // existing code above this
        this.bicycleType = bicycleType;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }
    // add getters for brakeSpeed*/
}