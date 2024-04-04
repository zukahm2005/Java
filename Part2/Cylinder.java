package Lab4.Part2;

public class Cylinder extends Cirle {
    private  double height;

    public Cylinder(double radius, String color, double height ) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return 3.14 * getRadius() * height;
    }
    @Override
    public  double getArea(){
        return  3.14 * getRadius() * getRadius() * height;
    }
    @Override
    public String toString(){
        return  "Volume Cylinder is: " + getVolume() + "\n" +
                "Area Cylinder is: " + getArea() + "\n" +"Color Cylinder is: " + getColor();
    }
}
