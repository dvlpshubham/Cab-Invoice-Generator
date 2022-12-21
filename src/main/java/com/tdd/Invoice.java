package com.tdd;

public class Invoice {

    public int rideCount;
    public double totalFare;
    public double avgFare;

    /**
     * constructor
     *
     * @param rideCount - no. of rides
     * @param totalFare - total fare
     * @param avgFare   - average fare = total fare/ no. of rides
     */
    public Invoice(int rideCount, double totalFare, double avgFare) {
        super();
        this.rideCount = rideCount;
        this.totalFare = totalFare;
        this.avgFare = avgFare;
    }

    /**
     * We are overriding the equals method.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Invoice other = (Invoice) obj;
        return Double.doubleToLongBits(avgFare) == Double.doubleToLongBits(other.avgFare)
                && rideCount == other.rideCount
                && Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
    }

}