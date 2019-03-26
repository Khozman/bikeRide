package bicycles.rides;

import bicycles.*;

import java.util.ArrayList;

public class FunRide {
    int maximNumBikes;
    ArrayList<Bicycle> board = new ArrayList<>();
    private Object BicycleType;

    public FunRide(int maximNumBikes){
        this.maximNumBikes = maximNumBikes;
    }

    public String accept(Bicycle bike){

        if (board.size() < maximNumBikes && !board.contains(bike)) {
            board.add(bike);
            return "Bicycle Accepted on board";
        }
        return "Bicycle not Accepted ";
    }

    public Integer getCountForType(bicycles.BicycleType type){
        int counter = 0;
        for(Bicycle bike : board){
            if(bike.getBicycleType() == type){
//                System.out.println(bike.getBicycleType());
                counter ++;
            }
        }
        return counter;
    }

    public int getEnteredCount() {
        return board.size();
    }
}