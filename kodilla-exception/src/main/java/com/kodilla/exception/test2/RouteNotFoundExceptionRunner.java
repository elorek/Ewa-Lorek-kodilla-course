package com.kodilla.exception.test2;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightSearching flightSearching = new FlightSearching();
        try {
            boolean flight = flightSearching.findFlight(new Flight("Warsaw Chopin Airport", "Krakow Airport"));
            System.out.println(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("This route is unavailable. Change your destination, please.");
        }
    }
}
