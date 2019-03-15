package bicycles;

public abstract class BicycleBase implements Bicycle{

    private int speed;

    protected void changeSpeed(int i){
        if(speed + i >= 0) {
            speed += i;
            return;
        }
        stop();
    }
    public void stop(){
        speed = 0;
    }
    public int currentSpeed() {
        return speed;
    }
}