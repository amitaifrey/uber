package zkconn;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class ZKManagerImpl implements ZKManager {
    private static ZooKeeper zkeeper;
    private static ZKConnection zkConnection;

    public ZKManagerImpl(String host) throws IOException, InterruptedException {
        initialize(host);
    }

    private void initialize(String host) throws IOException, InterruptedException {
        zkConnection = new ZKConnection();
        zkeeper = zkConnection.connect(host);
    }

    public void closeConnection() throws InterruptedException {
        zkConnection.close();
    }

    public void create(String path, byte[] data)
            throws KeeperException,
            InterruptedException {

        zkeeper.create(
                path,
                data,
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);
    }

    public void createEphemeral(String path, byte[] data)
            throws KeeperException,
            InterruptedException {

        zkeeper.create(
                path,
                data,
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.EPHEMERAL);
    }

    public void createSequential(String path, byte[] data)
            throws KeeperException,
            InterruptedException {

        zkeeper.create(
                path,
                data,
                ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT_SEQUENTIAL);
    }

    public List<String> getChildren(String path)
            throws KeeperException,
            InterruptedException {

        return zkeeper.getChildren(path, false);
    }

    public void addWatch(String path, Watcher watcher, AddWatchMode mode)
            throws KeeperException,
            InterruptedException {

        zkeeper.addWatch(path, watcher, mode);
    }

    public byte[] getZNodeData(String path, boolean watchFlag)
            throws KeeperException,
            InterruptedException {

        byte[] b = null;
        return zkeeper.getData(path, null, null);
    }

    public void update(String path, byte[] data) throws KeeperException,
            InterruptedException {
        int version = zkeeper.exists(path, true).getVersion();
        zkeeper.setData(path, data, version);
    }
}