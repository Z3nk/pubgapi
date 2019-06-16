package net.pubgapi.model.telemetry;

import net.pubgapi.model.telemetry.event.TelemetryEvent;

import java.util.List;

public class Telemetry {

    private final List<TelemetryEvent> telemetryEvents;

    public Telemetry(List<TelemetryEvent> telemetryEvents) {
        this.telemetryEvents = telemetryEvents;
    }

    public List<TelemetryEvent> getTelemetryEvents() {
        return telemetryEvents;
    }

}
