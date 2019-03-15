package bicycles;

import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTestOne {
    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(bicycle);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 14);
    }

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 36);
    }

    @Test
    public void shouldReturnCurrentSpeedForTandem() {
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(5, -3);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        BikeRideOne tBikeRide = new BikeRideOne(bicycle);
        tBikeRide.ride();

        assertEquals(tBikeRide.currentSpeed(), 14);
    }
}