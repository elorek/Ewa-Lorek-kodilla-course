package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static List<Flight> getFlights() {
        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight("Warsaw", "Cracow"));
        flightsList.add(new Flight("Warsaw", "Gdansk"));
        flightsList.add(new Flight("Warsaw", "Wroclaw"));
        flightsList.add(new Flight("Wroclaw", "Gdansk"));
        flightsList.add(new Flight("Wroclaw", "Szczecin"));
        flightsList.add(new Flight("Gdansk", "Cracow"));
        flightsList.add(new Flight("Gdansk", "Poznan"));
        flightsList.add(new Flight("Cracow", "Bydgoszcz"));
        flightsList.add(new Flight("Cracow", "Poznan"));
        flightsList.add(new Flight("Szczecin", "Wroclaw"));
        flightsList.add(new Flight("Olsztyn", "Poznan"));
        flightsList.add(new Flight("Lodz", "Bialystok"));

        return flightsList;
    }

    public static void main(String[] args) {
        FindFlight findFlight = new FindFlight();
        findFlight.findFlightsFrom("Warsaw");
        System.out.println("Searching flight to city");
        findFlight.findFlightsTo("Poznan");
        System.out.println("Searching indirect flights");
        findFlight.findFlightsWithChange("Wroclaw", "Cracow");
    }
}
