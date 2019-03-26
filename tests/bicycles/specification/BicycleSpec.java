package bicycles.specification;

import org.junit.jupiter.api.Test;
import bicycles.BicycleType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpec {
//Testing for the getAccelerationSpeed method for each bike...
    @Test
    public void shouldReturnCorrectSpecsForMountainBike() {
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        assertEquals(mountainBikeSpec.getAccelerationSpeed(), 5);
        assertEquals(mountainBikeSpec.getBrakeSpeed(), -3);
        assertEquals(mountainBikeSpec.getBicycleType(), BicycleType.MountainBike);

    }

    @Test
    public void shouldReturnCorrectSpecsForRoadBike() {
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(9, -4, BicycleType.RoadBike);

        assertEquals(roadBikeSpec.getAccelerationSpeed(), 9);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
        assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);

    }

    @Test
    public void shouldReturnCorrectSpecsForTandem() {
        // Tandem
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(11, -6, BicycleType.Tandem);

        assertEquals(tandemBikeSpec.getAccelerationSpeed(), 11);
        assertEquals(tandemBikeSpec.getBrakeSpeed(), -6);
        assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.Tandem);

    }

}
