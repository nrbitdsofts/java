package DataTypes;

public class BankAmountNumberToWords {
    public static void main(String[] args) {
        double[] balances = { 1234.00, 7890.12, 123456 };

        for (double balance : balances) {
            System.out.println("Balance: " + balance + " -> " + convertDoubleToWords(balance));
        }
    }

    // Helper method to convert double to words
    public static String convertDoubleToWords(double number) {
        long wholePart = (long) number;
        int decimalPart = (int) Math.round((number - wholePart) * 100);

        return numberToWords(wholePart) + " Rupees and " + numberToWords(decimalPart) + " Paisa";
    }

    // Helper method to convert numbers to words (supports up to 9999)
    public static String numberToWords(long num) {
        String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        if (num < 20)
            return units[(int) num];
        else if (num < 100)
            return tens[(int) num / 10] + (num % 10 != 0 ? " " + units[(int) num % 10] : "");
        else if (num < 1000)
            return units[(int) num / 100] + " hundred" + (num % 100 != 0 ? " and " + numberToWords(num % 100) : "");
        else if (num < 10000)
            return units[(int) num / 1000] + " thousand" + (num % 1000 != 0 ? " " + numberToWords(num % 1000) : "");
        else
            return String.valueOf(num);
    }
}
