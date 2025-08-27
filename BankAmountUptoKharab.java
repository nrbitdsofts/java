package DataTypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAmountUptoKharab {
    public static void main(String[] args) {
        BigDecimal[] balances = {
                new BigDecimal("1234.56"),
                new BigDecimal("789012345.67"),
                new BigDecimal("9876543210123.45")
        };

        for (BigDecimal balance : balances) {
            System.out.println("Balance: " + balance + " -> " + convertBigDecimalToWords(balance));
        }
    }

    // Convert BigDecimal to words with rupees and paise
    public static String convertBigDecimalToWords(BigDecimal number) {
        number = number.setScale(2, RoundingMode.HALF_UP); // always 2 decimal places
        BigDecimal[] parts = number.divideAndRemainder(BigDecimal.ONE);

        long wholePart = parts[0].longValueExact();
        int decimalPart = parts[1].movePointRight(2).intValueExact(); // convert 0.xx to paise

        StringBuilder result = new StringBuilder();
        if (wholePart > 0) {
            result.append(numberToWords(wholePart)).append(" rupees");
        }
        if (decimalPart > 0) {
            if (result.length() > 0)
                result.append(" and ");
            result.append(numberToWords(decimalPart)).append(" paise");
        }
        if (result.length() == 0) {
            result.append("zero rupees");
        }

        return result.toString().trim();
    }

    // Convert number to words using Nepali numbering system up to Kharab
    public static String numberToWords(long num) {
        if (num == 0)
            return "zero";

        String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        // Nepali place values
        String[] places = { "kharab", "arab", "crore", "lakh", "thousand", "hundred", "" };
        long[] divisors = { 1000000000000L, 10000000000L, 10000000L, 100000L, 1000L, 100L, 1L };

        StringBuilder words = new StringBuilder();

        for (int i = 0; i < divisors.length; i++) {
            long divisor = divisors[i];
            if (num >= divisor) {
                long part = num / divisor;
                num = num % divisor;

                if (part > 0) {
                    words.append(convertBelowThousand(part, units, tens)).append(" ");
                    if (!places[i].isEmpty()) {
                        words.append(places[i]).append(" ");
                    }
                }
            }
        }

        return words.toString().trim();
    }

    // Handle numbers below 1000
    private static String convertBelowThousand(long num, String[] units, String[] tens) {
        StringBuilder word = new StringBuilder();

        if (num >= 100) {
            word.append(units[(int) (num / 100)]).append(" hundred ");
            num %= 100;
        }

        if (num >= 20) {
            word.append(tens[(int) (num / 10)]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            word.append(units[(int) num]).append(" ");
        }

        return word.toString().trim();
    }
}
