package bikes;

import java.util.Objects;

import static bikes.EcoBikeType.FOLDING_BIKE;

public class FoldingBike extends EcoBike {

    private int sizeOfWheels;
    private int numberOfGears;

    public FoldingBike(String brand, int weight, boolean isLightsAvailable, String color, String price, int sizeOfWheels, int numberOfGears) {
        super(FOLDING_BIKE, brand, weight, isLightsAvailable, color, price);
        this.sizeOfWheels = sizeOfWheels;
        this.numberOfGears = numberOfGears;
    }

    public int getSizeOfWheels() {
        return sizeOfWheels;
    }

    public void setSizeOfWheels(int sizeOfWheels) {
        this.sizeOfWheels = sizeOfWheels;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    // TODO override toString
    @Override
    public String toString() {
        return "FoldingBike{}";
    }

    // TODO override equals
    // TODO do we really need equals for each class? (as it mentioned in task) I guess it is needed only for bikes classes
    // TODO do we need hashCode? (equals and hashCode contract) (Is it ok to override equals without hashCode?)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoldingBike that = (FoldingBike) o;
        return sizeOfWheels == that.sizeOfWheels && numberOfGears == that.numberOfGears;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeOfWheels, numberOfGears);
    }
}
