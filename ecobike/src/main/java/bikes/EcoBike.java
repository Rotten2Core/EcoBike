package bikes;

public abstract class EcoBike {

    private EcoBikeType type;
    private String brand;
    private int weight;
    private boolean isLightsAvailable;
    private String color;
    private String price;

    public EcoBike(EcoBikeType type, String brand, int weight, boolean isLightsAvailable, String color, String price) {
        this.type = type;
        this.brand = brand;
        this.weight = weight;
        this.isLightsAvailable = isLightsAvailable;
        this.color = color;
        this.price = price;
    }

    public EcoBikeType getType() {
        return type;
    }

    public void setType(EcoBikeType type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isLightsAvailable() {
        return isLightsAvailable;
    }

    public void setLightsAvailable(boolean lightsAvailable) {
        isLightsAvailable = lightsAvailable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
