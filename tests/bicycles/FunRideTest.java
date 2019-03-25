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

        assertEquals(funRide.getEnteredCount(), 4);
        assertEquals(funRide.getCountForType(BicycleType.Tandem), 4);
        assertEquals(funRide.accept(bicycle), "Bicycle Accepted on board");

    }

//    @Test
//    public void shouldRejectBicycle(){
//
//
//        assertEquals(FunRide.reject(bicycle), "Bicycle not Accepted ");
//    }
}
