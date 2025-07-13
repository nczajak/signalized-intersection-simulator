package Model;
import Enum.Colour;

public class TrafficLight {
    private Colour colour;

    public TrafficLight(){
        this.colour = Colour.RED;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

}
