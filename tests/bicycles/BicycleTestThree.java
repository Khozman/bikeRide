package bicycles;

import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTestThree {
    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideThree mBikeRide = new BikeRideThree(bicycle);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 0);
    }

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 0);
    }

    @Test
    public void shouldReturnCurrentSpeedForTandem() {
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(5, -3);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        BikeRideThree tBikeRide = new BikeRideThree(bicycle);
        tBikeRide.ride();

        assertEquals(tBikeRide.currentSpeed(), 0);
    }
}