package builder;

public class VirtualPrivateServer {
    private final long ssdVolume;
    private final long ramVolume;
    private final OperatingSystem operatingSystem;

    public VirtualPrivateServer(long ssdVolume, long ramVolume, OperatingSystem operatingSystem) {
        this.ssdVolume = ssdVolume;
        this.ramVolume = ramVolume;
        this.operatingSystem = operatingSystem;
    }

    public long getSsdVolume() {
        return ssdVolume;
    }

    public long getRamVolume() {
        return ramVolume;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }
}
