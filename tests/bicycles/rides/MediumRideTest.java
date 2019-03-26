package bicycles.rides;

import bicycles.Bicycle;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediumRideTest {
    @Test
    public void shouldReturnCurrentSpeedForMountainBike() {
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        MediumRide mBikeRide = new MediumRide(bicycle);
        mBikeRide.ride();

        assertEquals(mBikeRide.currentSpeed(), 5);
    }

    @Test
    public void shouldReturnCurrentSpeedForRoadBike() {
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        MediumRide bikeRide = new MediumRide(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 14);
    }

    @Test
    public void shouldReturnCurrentSpeedForTandem() {
        // Tandem
        BicycleSpecification tandemSpec = new BicycleSpecification(5, -3, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemSpec);
        MediumRide tBikeRide = new MediumRide(bicycle);
        tBikeRide.ride();

        assertEquals(tBikeRide.currentSpeed(), 5);
    }
}