package bikes;

public abstract class ElectricBike extends EcoBike {

    private int maximumSpeed;
    private int batteryCapacity;

    public ElectricBike(EcoBikeType type, String brand, int weight, boolean isLightsAvailable, String color, String price, int maximumSpeed, int batteryCapacity) {
        super(type, brand, weight, isLightsAvailable, color, price);
        this.maximumSpeed = maximumSpeed;
        this.batteryCapacity = batteryCapacity;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    // TODO
    @Override
    public String toString() {
        return "ElectricBike{}";
    }
}
