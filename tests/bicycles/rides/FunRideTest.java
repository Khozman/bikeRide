package bicycles.rides;

import bicycles.*;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldAcceptBicycle(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(9, -2, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);

        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(7, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);

        FunRide funRide = new FunRide(3);

        funRide.accept(tandem);
        funRide.accept(roadBike);

        assertEquals(funRide.accept(mountainBike), "Bicycle Accepted on board");

    }

    @Test
    public void shouldRejectBicycleIfBoardFull(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(9, -2, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);

        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(7, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);

        FunRide funRide = new FunRide(2);

        funRide.accept(roadBike);
        funRide.accept(mountainBike);

        assertEquals(funRide.accept(tandem), "Bicycle not Accepted ");

    }

    @Test
    public void shouldGetEnteredCountForAllBicycles(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(9, -2, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);

        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(7, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);

        BicycleSpecification bicycleSpecification3 = new BicycleSpecification(13, -5, BicycleType.Tandem);
        Bicycle blueTandem = new BicycleFromSpec(bicycleSpecification3);

        FunRide funRide = new FunRide(5);

        funRide.accept(tandem);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(blueTandem);

        assertEquals(funRide.getEnteredCount(), 4);
    }

    @Test
    public void shouldGetCountForBicycleType(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification5 = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle blueTandem = new BicycleFromSpec(bicycleSpecification5);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(9, -2, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);

        BicycleSpecification bicycleSpecification3 = new BicycleSpecification(9, -2, BicycleType.RoadBike);
        Bicycle blueRoadBike = new BicycleFromSpec(bicycleSpecification3);

        BicycleSpecification bicycleSpecification4 = new BicycleSpecification(9, -2, BicycleType.RoadBike);
        Bicycle redRoadBike = new BicycleFromSpec(bicycleSpecification4);

        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(7, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);

        FunRide funRide = new FunRide(6);

        funRide.accept(tandem);
        funRide.accept(blueTandem);
        funRide.accept(roadBike);
        funRide.accept(blueRoadBike);
        funRide.accept(redRoadBike);
        funRide.accept(mountainBike);

        assertEquals(funRide.getCountForType(BicycleType.Tandem), 2);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);
        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 1);
    }
}
