package bicycles;

public interface Bicycle {
    void accelerate();
    void brake();
    void stop();
    int currentSpeed();
    BicycleType getBicycleType();
}