package Model;
import java.util.List;
import java.util.ArrayList;

public class VehicleQueue {
    List<Vehicle> queue;

    public VehicleQueue(){
        this.queue = new ArrayList<>();
    }

    public int getSize(){
        return queue.size();
    }
}
