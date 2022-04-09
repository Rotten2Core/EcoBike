package bikes;

import static bikes.EcoBikeType.SPEED_ELEC;

public class SpeedElec extends ElectricBike {

    public SpeedElec(String brand, int weight, boolean isLightsAvailable, String color, String price, int maximumSpeed, int batteryCapacity) {
        super(SPEED_ELEC, brand, weight, isLightsAvailable, color, price, maximumSpeed, batteryCapacity);
    }
}
