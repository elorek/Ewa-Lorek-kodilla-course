package com.kodilla.exception.test2;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {
    public boolean findFlight (Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("Warsaw Chopin Airport", false);
        airportList.put("Warsaw Modlin Airport", true);
        airportList.put("Katowice Airport", false);
        airportList.put("Lublin Airport", true);
        airportList.put("Poznan Airport", true);

        if (airportList.containsKey(flight.getArrivalAirport())) {
            return airportList.get(flight.getArrivalAirport());
        } else {
           throw new RouteNotFoundException();
        }

    }
}
