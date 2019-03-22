package bicycles;

import java.util.ArrayList;

public class FunRide {
    int maximNumBikes;
    //Bicycle[] board;
    ArrayList<Bicycle> board = new ArrayList<>();

    public FunRide(int maximNumBikes){
        this.maximNumBikes = maximNumBikes;
       // board = new Bicycle[maximNumBikes];
    }

    public String accept(Bicycle bike){

        if (board.size() < maximNumBikes) {
            board.add(bike);
            return "Bicycle Accepted on board";
        }
        return "Bicycle not Accepted ";
    }

    public BicycleType getCountForType(){

    }

    public int getEnteredCount() {
        return board.size();
    }
}
