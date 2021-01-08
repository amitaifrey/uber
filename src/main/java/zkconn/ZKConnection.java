package zkconn;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

public class ZKConnection {
    private ZooKeeper zoo;
    private CountDownLatch connSignal = new CountDownLatch(0);


    public ZooKeeper connect(String host)
            throws IOException,
            InterruptedException {

        zoo = new ZooKeeper(host, 3000, event -> {
            if (event.getState() == KeeperState.SyncConnected) {
                connSignal.countDown();
            }
        });

        connSignal.await();
        return zoo;
    }

    public void close() throws InterruptedException {
        zoo.close();
    }
}