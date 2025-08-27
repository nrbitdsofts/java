package DataTypes;

public class ScopeExample {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 20;

            // x and y both known here
            System.out.println("x and y are : " + x + " " + y);

        }

        int y = 100;
        System.out.println("x and y are : " + x + " " + y);
    }
}
