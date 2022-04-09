package bikes;

public enum EcoBikeType {

    FOLDING_BIKE("FOLDING BIKE"),
    SPEED_ELEC("SPEEDELEC"),
    E_BIKE("E-BIKE");

    private final String name;

    EcoBikeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
