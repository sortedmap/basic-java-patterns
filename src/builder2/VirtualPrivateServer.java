package builder2;

public class VirtualPrivateServer {
    private long ssdVolume;
    private long ramVolume;
    private OperatingSystem operatingSystem;

    public VirtualPrivateServer(long ssdVolume, long ramVolume, OperatingSystem operationSystem) {
        this.ssdVolume = ssdVolume;
        this.ramVolume = ramVolume;
        this.operatingSystem = operationSystem;
    }

    public static class Builder {
        private VirtualPrivateServer server;

        public Builder withSsdVolume(long volume) {
            server.ssdVolume = volume;
            return this;
        }

        public Builder withRamVolume(long volume) {
            server.ramVolume = volume;
            return this;
        }

        public Builder withOperatingSystem(OperatingSystem operatingSystem) {
            server.operatingSystem = operatingSystem;
            return this;
        }

        public VirtualPrivateServer build() {
            return server;
        }
    }
}
