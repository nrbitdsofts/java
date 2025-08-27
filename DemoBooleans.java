package DataTypes;

public class DemoBooleans {
    public static void main(String[] args) {
        boolean booleanExampleVariable;
        booleanExampleVariable = false;
        System.out.println("BooleanExampleVariable is : " + booleanExampleVariable);

        booleanExampleVariable = true;
        System.out.println("BooleanExampleVariable is : " + booleanExampleVariable);

        // a boolean variable can control the if statement
        if (booleanExampleVariable)
            System.out.println(" This is executed");

        booleanExampleVariable = false;
        if (booleanExampleVariable)
            System.out.print("This is not executed");

        // outcome of a relational operator is a booleam value
        System.out.println("10>9 is " + (10 > 9));
    }

}
