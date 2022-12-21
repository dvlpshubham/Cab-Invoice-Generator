package com.tdd;


public class Rides {
    public double distance;
    public double time;
    public boolean isPremium;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    /**
     * Constructor
     *
     * @param distance  - Distance traveled by cab
     * @param time      - time taken
     * @param isPremium - Is the ride premium of normal
     */
    public Rides(double distance, double time, boolean isPremium) {
        super();
        this.distance = distance;
        this.time = time;
        this.isPremium = isPremium;
    }

}