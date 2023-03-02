package builder;

public class VPSBuilderImpl implements VPSBuilder {
    private OperatingSystem operatingSystem;
    private long ssdVolume;
    private long ramVolume;

    @Override
    public void setSsdVolume(long volume) {
        this.ssdVolume = volume;
    }

    @Override
    public void setRamVolume(long volume) {
        this.ramVolume = volume;
    }

    @Override
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public VirtualPrivateServer build() {
        return new VirtualPrivateServer(
                ssdVolume,
                ramVolume,
                operatingSystem
        );
    }
}

