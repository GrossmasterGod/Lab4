package Vehicles;

import java.util.ArrayList;

public class Vehicle {
    private ArrayList sits;
    private Object T;
    private int max_sits;

    public int getAvailableSits() {
        return sits.size();
    }

    public void setMax_sits(int max_sits) {
        this.max_sits = max_sits;
    }

    public <T> void putPassengerIn(T passenger){
        if (getAvailableSits()>max_sits)
        sits.add(passenger);

    }
}
