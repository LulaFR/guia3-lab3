import java.awt.*;

public class Circle {
    private Double radius;
    private String colour;

    //CONSTRUCTORS-----------------------------------------------
    //region
    public Circle() {
        radius = 1.0D;
        colour = "Red";
    }

    public Circle(Double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }
    //endregion
    //G&S--------------------------------------------------------
    //region
    public Double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    //endregion
    //METHODS
    //region
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Radio: " + radius +
                "\nColor: " + colour +
                "\nÁrea: " + calculateArea();
    }
    //endregion
}
