package builder;

public interface VPSBuilder {
    void setSsdVolume(long volume);
    void setRamVolume(long volume);
    void setOperatingSystem(OperatingSystem operatingSystem);
    VirtualPrivateServer build();
}
