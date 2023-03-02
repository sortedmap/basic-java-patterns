package builder;

public enum OperatingSystemType {
    WINDOWS("Windows"),
    LINUX("Linux");

    private String name;

    OperatingSystemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}