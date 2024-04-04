package Lab4.Part2;

public class Cirle {
    private double radius;
    private String color;

    public Cirle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString(){
        return "Area Circle is: " + getArea() + "\n" +"Color circle is: " + getColor() + "\n" ;
    }

}
