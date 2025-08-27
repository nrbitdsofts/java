package DataTypes;

public class DemoIntegerLiterals {
    public static void main(String[] args) {
        int paisoResult, binResult;
        int salary = 32_000;
        int binxexample = 0b1010_1010_1010;

        int totalKharcha = 2_200;
        paisoResult = salary - totalKharcha;
        binResult = binxexample + 1;

        System.out.println("SalaryResult and BinResult : " + paisoResult + "  and  " + binResult);
        System.out.println("Integer to binary conversion pachi : " + Integer.toBinaryString(binResult));
    }
}