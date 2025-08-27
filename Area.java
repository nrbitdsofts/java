package DataTypes;

class AreaCalculation {
    public static void main(String[] args) {
        double pi, radius, area;

        radius = 10.8; // radius of a circle
        pi = 22 / 7; // actual value of pi

        area = pi * radius * radius; // compute area

        System.out.println("Area of the circle with raidus " + radius + " is : " + area);

    }

}
