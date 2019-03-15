package bicycles;

import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTestTwo {
    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideTwo mBikeRide = new BikeRideTwo(bicycle);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 5);
    }

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 14);
    }

    @Test
    public void shouldReturnCurrentSpeedForTandem() {
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(5, -3);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        BikeRideTwo tBikeRide = new BikeRideTwo(bicycle);
        tBikeRide.ride();

        assertEquals(tBikeRide.currentSpeed(), 5);
    }
}