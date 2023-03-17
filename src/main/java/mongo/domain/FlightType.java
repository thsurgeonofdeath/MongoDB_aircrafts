package mongo.domain;

import java.time.LocalDate;
import java.util.Date;

public class FlightType {
    private String id;
    private String departureCity;
    private String destinationCity;
    private FlightType type;
    private boolean isDelayed;
    private int durationMin;
    private LocalDate departureDate;
    private Aircraft aircraft;
    private LocalDate crearedAt;

    public FlightType(LocalDate crearedAt) {
        this.crearedAt = LocalDate.now();
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public FlightType getType() {
        return type;
    }

    public boolean isDelayed() {
        return isDelayed;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }
}
