package builder;

public class VPSCreator {
    public VirtualPrivateServer create20GbVps() {
        VPSBuilder builder = new VPSBuilderImpl();
        builder.setSsdVolume(20_000_000_000L);
        builder.setRamVolume(2_000_000_000L);
        builder.setOperatingSystem(new OperatingSystem(
                OperatingSystemType.LINUX, "Ubuntu 20.04"
        ));
        return builder.build();
    }

    public VirtualPrivateServer create80GbVps() {
        VPSBuilder builder = new VPSBuilderImpl();
        builder.setSsdVolume(80_000_000_000L);
        builder.setRamVolume(8_000_000_000L);
        builder.setOperatingSystem(new OperatingSystem(
                OperatingSystemType.LINUX, "Ubuntu 22.04"
        ));
        return builder.build();
    }

    public VirtualPrivateServer create64GbVps() {
        VPSBuilder builder = new VPSBuilderImpl();
        builder.setSsdVolume(64_000_000_000L);
        builder.setRamVolume(8_000_000_000L);
        builder.setOperatingSystem(new OperatingSystem(
                OperatingSystemType.WINDOWS, "Windows Server 2019"
        ));
        return builder.build();
    }

    public VirtualPrivateServer create256GbVps() {
        VPSBuilder builder = new VPSBuilderImpl();
        builder.setSsdVolume(256_000_000_000L);
        builder.setRamVolume(16_000_000_000L);
        builder.setOperatingSystem(new OperatingSystem(
                OperatingSystemType.WINDOWS, "Windows Server 2022"
        ));
        return builder.build();
    }
}