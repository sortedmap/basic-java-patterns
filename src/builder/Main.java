package builder;

public class Main {
    public static void main(String[] args) {
        VPSCreator creator = new VPSCreator();
        VirtualPrivateServer server = creator.create20GbVps();
    }
}
