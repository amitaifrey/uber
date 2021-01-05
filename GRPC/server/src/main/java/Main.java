public class Main {
    public static void main(String[] args) throws Exception {
        UberRPCServer server = new UberRPCServer(8980);
        server.start();
        System.out.println("Server started");
        server.blockUntilShutdown();
    }
}
