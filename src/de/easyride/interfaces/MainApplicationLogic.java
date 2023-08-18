package de.easyride.interfaces;

import de.easyride.obj.Ride;
import de.easyride.obj.Route;
import de.easyride.obj.Stop;
import de.easyride.obj.Vehicle;

import java.util.List;

public interface MainApplicationLogic {

    /**
     * Plant die Route anhand
     * @param stops
     */
    Route routePlanning(List<Stop> stops);

}