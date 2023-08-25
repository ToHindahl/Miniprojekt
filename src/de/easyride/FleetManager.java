package de.easyride;

import de.easyride.interfaces.FleetManagerInterface;
import de.easyride.obj.Vehicle;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class FleetManager implements FleetManagerInterface {
    /**
     * Zeigt die Fahrzeug Informationen an
     * <p>
     * Testfall: Daten müssen nach dem Auto anlegen übereinstimmen
     *
     * @param vehicleId Die ID des Fahrzeuges
     */

    private List<Vehicle> vehicles;

    public FleetManager() {
        vehicles = new ArrayList<>();
    }

    @Override
    public Vehicle getVehicleDetails(int vehicleId) {
        return vehicles.stream()
                .filter(vehicle -> vehicleId == vehicle.getVehicleId())
                .findAny()
                .orElse(null);
    }

    /**
     * Fügt Fahrzeuge zu der Flotte hinzu
     * <p>
     * Testfall: Wenn das Auto hinzugefügt dann muss es aus in der Liste sein
     *
     * @param vehicle Das hinzufügende Fahrzeug
     */
    @Override
    public boolean addVehicleToFleet(Vehicle vehicle) {
        if(vehicles.contains(vehicle) || vehicle == null) {
            return false;
        } else {
            vehicles.add(vehicle);
            return true;
        }
    }

    /**
     * Entfernt ein Fahrzeug aus der Flotte
     * <p>
     * Testfall: Wenn das Auto Entfernt dann muss es aus der Liste entfernt sein
     *
     * @param vehicleId ID des zu entfernendes Fahrzeug
     */
    @Override
    public boolean removeVehicleFromFleet(int vehicleId) {
        if(!vehicles.contains(getVehicleDetails(vehicleId))) {
            return false;
        } else {
            vehicles.remove(getVehicleDetails(vehicleId));
            return true;
        }
    }
}
