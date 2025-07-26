package org.example.Model;
import org.example.Enum.Colour;

public class TrafficLight {
    private Colour colour = Colour.RED;

    public Colour getColour(){
        return this.colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

}
