package org.sanaa.design.builder.builders;

import org.sanaa.design.builder.cars.CarType;
import org.sanaa.design.builder.components.Engine;
import org.sanaa.design.builder.components.GPSNavigator;
import org.sanaa.design.builder.components.Transmission;
import org.sanaa.design.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}