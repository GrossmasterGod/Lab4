package Vehicles;

public class Bus extends Vehicle{
    @Override
    public void setMax_sits(int max_sits) {
        super.setMax_sits(max_sits);
    }
    
    public int max_sits(){
        return 32;
    }
}
