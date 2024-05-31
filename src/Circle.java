public class Circle {
    private double radius;

    //  Constructor with no arguments
    public Circle() {
        this.radius = 0;
    }

    // Constructor with two arguments
    public Circle(double radius) {
        this.radius = radius;
    }

    // To Calculate circumferencesss
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // creating circle objects using both constructors
        Circle c1 = new Circle(); // using no argument constructor
        Circle c2 = new Circle(4.0); // using two arguments constructor

        System.out.println("Circum of C1 :" + c1.calculateCircumference());
        System.out.println("Circum of C2 :" + c2.calculateCircumference());
    }
}
