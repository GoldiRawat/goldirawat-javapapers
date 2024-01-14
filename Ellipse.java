public class Ellipse {
    // Two private instance variables
    private double radius;
    private String color;

    // Default constructor with default values
    public Ellipse() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Overloaded constructor with a double argument for radius
    public Ellipse(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Getter method for area
    public double getArea() {
        // Assuming area = π * radius * radius for an ellipse
        return Math.PI * radius * radius;
    }
}

class TestEllipse {
    public static void main(String[] args) {
        // Create an Ellipse object using default constructor
        Ellipse ellipse1 = new Ellipse();

        // Create an Ellipse object using overloaded constructor with a radius argument
        Ellipse ellipse2 = new Ellipse(2.5);

        // Display details of the first ellipse
        System.out.println("Ellipse 1 Details:");
        System.out.println("Radius: " + ellipse1.getRadius());
        System.out.println("Area: " + ellipse1.getArea());
        System.out.println();

        // Display details of the second ellipse
        System.out.println("Ellipse 2 Details:");
        System.out.println("Radius: " + ellipse2.getRadius());
        System.out.println("Area: " + ellipse2.getArea());
    }
}
