package lessons;

public class Tests {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static double averageTemBodyCat;
    public static String verifyEquals(int expectedResult, int actualResult){
        if (actualResult == expectedResult) {
            return ANSI_GREEN + "Pass" + ANSI_RESET;
        } else {
            return ANSI_RED + "Fail" + ANSI_RESET;
        }
    }
    public static String verifyEquals(String expectedResult, String actualResult){
        if (actualResult == expectedResult) {
            return ANSI_GREEN + "Pass" + ANSI_RESET;
        } else {
            return ANSI_RED + "Fail" + ANSI_RESET;
        }
    }
    public static String verifyEquals(double expectedResult, double actualResult){
        if (actualResult == expectedResult) {
            return ANSI_GREEN + "Pass" + ANSI_RESET;
        } else {
            return ANSI_RED + "Fail" + ANSI_RESET;
        }
    }
    public static int printTCNumber(int tcNumber) {
        System.out.print(ANSI_PURPLE + "TC_" + tcNumber++ + "\t -- \t" + ANSI_RESET);
        return tcNumber;
    }
    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }


    public static double tempBodyCat (double extremeMin, double low, double normal, double max, double extremeMax) {

        if ((extremeMin < 25 || extremeMax > 45 || extremeMax < 39.5) || (low < 32.0 || low > 37.0) || (normal < 38.0
                || normal > 39.4) || (max < 39.5 || max > 45)) {
            return -1;
        } else {
            return averageTemBodyCat = (extremeMin + low + normal + max + extremeMax) / 5;
        }
    }

    public static void main (String [] args) {


        double expectedResultEX5 = 230.3;

        double actualResultEX5 = tempBodyCat(999,33,38,39.5,42);

        verifyEquals(expectedResultEX5,actualResultEX5);


        printTCNumber(5);
        printTestResult(verifyEquals(expectedResultEX5,actualResultEX5));

        System.out.println(tempBodyCat(999,33,38,39.5,42));

    }

}
