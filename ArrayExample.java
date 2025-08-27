package DataTypes;

public class ArrayExample {
    public static void main(String[] args) {
        // int month_days[] = new int[12];
        int i = 0;

        // month_days[0] = 31;
        // month_days[1] = 29;
        // month_days[2] = 30;
        // month_days[3] = 31;
        // month_days[4] = 32;
        // month_days[5] = 30;
        // month_days[6] = 31;
        // month_days[7] = 30;
        // month_days[8] = 29;
        // month_days[9] = 30;
        // month_days[10] = 31;
        // month_days[11] = 30;
        int month_days[] = { 31, 29, 30, 31, 32, 30, 31, 30, 29, 30, 31, 30 };

        for (i = 0; i < 12; i++) {
            System.out.println("Month : " + (i + 1) + " = " + month_days[i]);
        }
        System.out.println("April has " + month_days[3] + " days.");
    }
}
