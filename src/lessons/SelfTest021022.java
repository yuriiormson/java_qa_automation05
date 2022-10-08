package lessons;

public class SelfTest021022 {
    public static double tse (double a, double b, double c) {
        double res = a * b - c;
        if (res > 0) {
            return res;
        }
        if (res <= 0)
            res = 0;
        return res;
    }
    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }
    public static String verifyEquals(double expectedResult, double actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        if (a >= b) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println(tse(-2,3,4));

        double expectedResult = 2;
        double actualResult = tse(2,3,4);
        verifyEquals(expectedResult,actualResult);

        printTestResult(verifyEquals(expectedResult,actualResult));
    }
}
