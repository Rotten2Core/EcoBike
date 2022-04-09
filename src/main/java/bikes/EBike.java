package bikes;

import static bikes.EcoBikeType.E_BIKE;

public class EBike extends ElectricBike {

    public EBike(String brand, int weight, boolean isLightsAvailable, String color, String price, int maximumSpeed, int batteryCapacity) {
        super(E_BIKE, brand, weight, isLightsAvailable, color, price, maximumSpeed, batteryCapacity);
    }
}
