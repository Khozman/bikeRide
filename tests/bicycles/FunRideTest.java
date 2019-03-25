package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldAcceptBicycle(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);

        assertEquals(funRide.accept(bicycle), "Bicycle Accepted on board");

    }

    @Test
    public void shouldRejectBicycleIfBoardFull(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);

        assertEquals(funRide.accept(bicycle), "Bicycle not Accepted ");

    }

    @Test
    public void shouldGetEnteredCountForAllBicycles(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(bicycleSpecification);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);

        assertEquals(funRide.getEnteredCount(), 4);
    }

    @Test
    public void shouldGetCountForBicycleType(){
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);

        BicycleSpecification bicycleSpecification1 = new BicycleSpecification(9, -2, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification1);

        BicycleSpecification bicycleSpecification2 = new BicycleSpecification(7, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification2);

        FunRide funRide = new FunRide(6);

        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);

        assertEquals(funRide.getCountForType(BicycleType.Tandem), 2);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);
        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 1);
    }
}
