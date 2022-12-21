package com.tdd;

public class Rides {
    public double distance;
    public double time;

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

    /**
     * Constructor
     *
     * @param distance - Distance traveled by cab
     * @param time     - time taken
     */
    public Rides(double distance, double time) {
        super();
        this.distance = distance;
        this.time = time;
    }

}