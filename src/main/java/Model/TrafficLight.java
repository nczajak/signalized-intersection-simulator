package Model;
import Enum.Colour;

public class TrafficLight {
    private Colour colour = Colour.RED;

    public TrafficLight(){
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

}
