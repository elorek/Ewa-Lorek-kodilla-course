package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {
    public void findFlightsTo(String city) {
        Application.getFlights().stream().filter(flight -> flight.getTo().equals(city)).forEach(flight -> System.out.println(flight));
    }

    public void findFlightsFrom(String city) {
        Application.getFlights().stream().filter(flight -> flight.getFrom().equals(city)).forEach(flight -> System.out.println(flight));
    }

    public void findFlightsWithChange(String departure, String arrival) {
        List<Flight> flightsFrom = Application.getFlights().stream()
                .filter(flight -> flight.getFrom().equals(departure))
                .collect(Collectors.toList());
        List<Flight> flightsTo = Application.getFlights().stream()
                .filter(flight -> flight.getTo().equals(arrival))
                .collect(Collectors.toList());

        for (Flight startingFlight : flightsFrom) {
            for (Flight departingFlight : flightsTo) {
                if(startingFlight.getTo().equals(departingFlight.getFrom())) {
                    System.out.println(startingFlight);
                    System.out.println(departingFlight);
                }
            }
        }
    }
}
