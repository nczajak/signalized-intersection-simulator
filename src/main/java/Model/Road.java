package Model;

public abstract class Road {
    private RoadQueue vehicles;

    public Road(){
        this.vehicles = new RoadQueue();
    }

    public int getVehiclesAmount(){
        return this.vehicles.getSize();
    }
}
