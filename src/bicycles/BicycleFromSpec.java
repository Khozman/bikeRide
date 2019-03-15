package bicycles;

public class BicycleFromSpec extends BicycleBase {

    private final BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification){
        this.bicycleSpecification = bicycleSpecification;
    }

    public void accelerate() {
        changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }

    public void brake() {
        changeSpeed(this.bicycleSpecification.getBrakeSpeed());
    }
}