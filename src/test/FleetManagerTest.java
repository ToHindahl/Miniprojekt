package test;

import de.easyride.FleetManager;
import de.easyride.obj.Vehicle;
import org.junit.Before;
import org.junit.Test;

public class FleetManagerTest {

    private FleetManager fleetManager;

    @Before
    public void setUp() {
        fleetManager = new FleetManager();
    }


    /**
     * Test ob Methode funktioniert
     */
    @Test
    public void testAddVehicle() {
        Vehicle vehicle = new Vehicle(123, "VW");
        fleetManager.addVehicleToFleet(vehicle);
        assert fleetManager.getVehicleDetails(123) == vehicle;
        assert fleetManager.getVehicles().size() == 1;
    }


    /**
     * Test ob ein Fahrzeug nur einmal hinzugefügt werden kann
     */
    @Test
    public void testAddVehicleTwice() {
        Vehicle vehicle = new Vehicle(123, "VW");
        fleetManager.addVehicleToFleet(vehicle);
        assert fleetManager.addVehicleToFleet(vehicle) == false;
        assert fleetManager.getVehicles().size() == 1;
    }


    /**
     * Test ob es zu einem Abbruch kommt, wenn ein Fahrzeug mit null hinzugefügt wird
     */
    @Test
    public void testAddVehicle3(){
        assert fleetManager.addVehicleToFleet(null) == false;
        assert fleetManager.getVehicles().size() == 0;
    }





    /**
     * Test ob Methode funktioniert
     */
    @Test
    public void testRemoveVehicle() {
        Vehicle vehicle = new Vehicle(123, "VW");
        fleetManager.addVehicleToFleet(vehicle);
        assert fleetManager.getVehicleDetails(123) == vehicle;
        fleetManager.removeVehicleFromFleet(123);
        assert fleetManager.getVehicleDetails(123) == null;
        assert fleetManager.getVehicles().size() == 0;
    }

    @Test
    public void testRemoveVehicle2() {
        Vehicle vehicle = new Vehicle(123, "VW");
        fleetManager.addVehicleToFleet(vehicle);
        assert fleetManager.removeVehicleFromFleet(123) == true;
        assert fleetManager.getVehicles().size() == 0; 
    }

}
