package com.tdd;

public class InvoiceGenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to cab invoice generator");
    }

    /**
     * Method to calculate fare Using formula = 10*distance + ride time If fare is
     * less than 5, fare set to 5.
     *
     * @param ride - ride with distance and time values
     * @return - fare, if less than 5 fare = 5
     */
    public double generateInvoice(Rides ride) {
        double fare = 10 * ride.distance + ride.time;

        return fare > 5 ? fare : 5;
    }

    /**
     * Method to calculate total fare from multiple rides When there are elements of
     * Rides array: for every element, called generateInvoice method and returned
     * fare added to total fare
     *
     * @param rides - array of rides
     * @return - totalFare
     */
    public double calculateTotalFare(Rides[] rides) {
        double totalFare = 0;
        for (Rides ride : rides) {
            totalFare += this.generateInvoice(ride);
        }
        return totalFare;
    }
}