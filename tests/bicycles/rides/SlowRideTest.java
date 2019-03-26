package bicycles.rides;

import bicycles.Bicycle;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlowRideTest {
    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        SlowRide mBikeRide = new SlowRide(bicycle);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 0);
    }

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        SlowRide bikeRide = new SlowRide(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 0);
    }

    @Test
    public void shouldReturnCurrentSpeedForTandem() {
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(5, -3, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        SlowRide tBikeRide = new SlowRide(bicycle);
        tBikeRide.ride();

        assertEquals(tBikeRide.currentSpeed(), 0);
    }
}