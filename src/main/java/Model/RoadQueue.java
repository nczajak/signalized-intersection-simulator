package Model;
import java.util.List;
import java.util.ArrayList;

public class RoadQueue {
    List<Vehicle> queue;

    public RoadQueue(){
        this.queue = new ArrayList<>();
    }

    public int getSize(){
        return queue.size();
    }



}
