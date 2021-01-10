package rpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import logic.Logic;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class UberRPCServer {
    private static final Logger logger = Logger.getLogger(UberRPCServer.class.getName());

    private final int port;
    private final Server server;

    public UberRPCServer(int port, HashMap<String, Logic> logics) throws IOException {
        this(ServerBuilder.forPort(port), logics, port);
    }

    /**
     * Create a RouteGuide server using serverBuilder as a base and features as data.
     */
    public UberRPCServer(ServerBuilder<?> serverBuilder, HashMap<String, Logic> logics, int port) {
        this.port = port;
        server = serverBuilder.addService(new UberService(logics)).build();
    }

    /**
     * Start serving requests.
     */
    public void start() throws IOException {
        try {
            server.start();
        }catch (Exception e){
            e.printStackTrace();
        }
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    UberRPCServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }

    /**
     * Stop serving requests and shutdown resources.
     */
    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    /**
     * Await termination on the java.host.main thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}