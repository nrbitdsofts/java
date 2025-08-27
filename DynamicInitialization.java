package DataTypes;

public class DynamicInitialization {
    public static void main(String[] args) {
        // Demonstrate dynamic initialization
        double a = 3.0, b = 4.0;
        // c is dynamically initiated
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse is " + c);
    }
}
