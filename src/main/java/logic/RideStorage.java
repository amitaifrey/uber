package logic;
import generated.CommitInfo;
import java.time.LocalDateTime;
import java.util.LinkedList;
import generated.RideOffer;

public class RideStorage implements java.io.Serializable {
    public RideOffer offer;
    public LinkedList<CommitInfo> infos;
    public LocalDateTime Locked;

    public RideStorage(RideOffer offer) {
        this.offer = offer;
        this.infos = new LinkedList<CommitInfo>();
        this.Locked = null;
    }
}