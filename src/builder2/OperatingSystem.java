package builder2;

public class OperatingSystem {
    private final OperatingSystemType type;
    private final String release;

    public OperatingSystem(OperatingSystemType type, String release) {
        this.type = type;
        this.release = release;
    }

    public OperatingSystemType getType() {
        return type;
    }

    public String getRelease() {
        return release;
    }
}