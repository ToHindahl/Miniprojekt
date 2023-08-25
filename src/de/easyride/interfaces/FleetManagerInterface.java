package de.easyride.interfaces;

import de.easyride.obj.Vehicle;

public interface FleetManagerInterface {

    /**
     * Zeigt die Fahrzeug Informationen an
     *
     * Testfall: Daten müssen nach dem Auto anlegen übereinstimmen
     *
     * @param vehicleId Die ID des Fahrzeuges
     */
    Vehicle getVehicleDetails(int vehicleId);

    /**
     * Fügt Fahrzeuge zu der Flotte hinzu
     *
     * Testfall: Wenn das Auto hinzugefügt dann muss es aus in der Liste sein
     *
     * @param vehicle Das hinzufügende Fahrzeug
     */
    boolean addVehicleToFleet(Vehicle vehicle);

    /**
     * Entfernt ein Fahrzeug aus der Flotte
     * @param vehicleId 
     */
    boolean removeVehicleFromFleet(int vehicleId);

}
