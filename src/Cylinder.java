public class Cylinder extends Circle{
    private Double height;

    //CONSTRUCTORS
    //region
    public Cylinder() {
        height = 1.0D;
    }

    public Cylinder(Double radius, String colour, Double height) {
        super(radius, colour);
        this.height = height;
    }
    //endregion
    //G&S
    //region
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    //endregion
    //METHODS
    //region
    public Double calculateVolume() {
        return super.calculateArea() * height;
    }

    @Override
    public Double calculateArea() {
        return 2 * super.calculateArea() + 2 * Math.PI * height * super.getRadius();
    }

    @Override
    public String toString() {
        return "Radio: " + super.getRadius() +
                "\nAltura: " + height +
                "\nÁrea de la base: " + super.calculateArea() +
                "\nÁrea del cilindro: " + calculateArea() +
                "\nColor: " + super.getColour();
    }
    //endregion
}
