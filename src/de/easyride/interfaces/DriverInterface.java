package de.easyride.interfaces;

import de.easyride.obj.PassengerInfo;
import de.easyride.obj.Stop;

public interface DriverInterface {

    /**
     * Wählt den nächsten Stopp aus
     * @return nächster Stopp
     */
    Stop queryNextStop();

    /**
     * Greift aud die Informationen des nächsten Kunden am nächsten Stopp zu
     * @param stopId Die ID des nächsten Stopps
     * @return Kunden Information
     */
    PassengerInfo fetchPassengerInfoAtStop(int stopId);

    /*+
     * Bestätigt die Ankunft an dem Haltepunkt
     * @param stopId Die ID des Haltepunkts
     */
    void confirmReachingStop(int stopId);
}
