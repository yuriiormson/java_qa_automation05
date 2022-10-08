package homework;

public class HW6 {
    static String taskName = "Task ~ ";
    static String taskFooter = "# ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ #\n";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static double printTaskNumber(double taskNumber) {
        System.out.println();
        System.out.println(taskName + taskNumber);
        System.out.println(taskFooter);
        return taskNumber;
    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (actualResult == expectedResult) {
            return ANSI_GREEN + "Pass" + ANSI_RESET;
        } else {
            return ANSI_RED + "Fail" + ANSI_RESET;
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return ANSI_GREEN + "Pass" + ANSI_RESET;
        } else {
            return ANSI_RED + "Fail" + ANSI_RESET;
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
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

    /*
    Task 1
    Распечатать последовательность чисел от 0 до 9 включительно.
     */
    public static void fromOnetoNine() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    Task 2
    Распечатать последовательность чисел от 10 исключительно до 0 включительно.
     */
    public static void getNumberFrom10To0() {
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    Task 3
    Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
     */
    public static void getNumberFrom50To55() {
        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + "");
        }
        System.out.println();
    }

    /*
    Task 4
    Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
     */
    public static void getSubsequenceMultiplesOnSeven() {
        for (int i = 328; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
    Task 5
    Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
     */
    public static void getSubquencesWithStepZeroDotNull() {
        for (double i = 12; i <= 13; i += 0.1) {
            System.out.println(i);
        }
    }

    /*
    Task 6
    Распечатать последовательность четных чисел от 215 до 237 включительно
     */
    public static void getSubEven() {
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
    Task 7
    Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
     */
    public static void getSubMultiplesOnSeven() {
        for (int i = 8; i > 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    /*
    Task 8
    Распечатать последовательность которая начинается с минимального значения типа данных short
    и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
     */
    public static void getSubShort() {
        for (int i = -32768; i <= 32767; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
    Task 9
    Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
    должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
    А ноль необходимо распечатать словом ZERO.
     */
    public static void getSub11_12_0() {
        for (int i = -10; i <= 34; i++) {
            if (i == 0) {
                System.out.println("ZERO");
            } else if (i % 11 == 0) {
                System.out.println(ANSI_BLUE + i + ANSI_RESET);
            } else if (i % 12 == 0) {
                System.out.println(ANSI_RED + i + ANSI_RESET);
            }
        }
    }

    /*
    Task 10
    Написать метод, который принимает на вход параметры start,  end, step,
    и печатает последовательность десятичных  чисел, начиная с числа start,
    с шагом step. Точка выхода из цикла - число end.
     */
    public static void getSubWithParams(int start, int step, int end) {
        int i;
        for (i = start; i <= end; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    Task 11
    Написать метод, который принимает на вход параметры n и m типа char,
    и выводит на печать последовательность букв английского алфавита в промежутке между значениями n и m включительно.
     */
    public static void getSubWithChar(char n, char m) {
        for (char i = n; i <= m; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    PART 2

    Task 12
    Написать метод, который принимает параметр l
    и печатает  последовательность четных чисел от нуля. Длина последовательности = l.
     */
    public static void getEveNumbers(int l) {
        int i;
        for (i = 0; i < 2 * l; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
    Task 13
    Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
     */
    public static void getSubMathPow(int n) {
        int exponent = 2;
        double pow;
        for (int i = 1; i <= n; i++) {
            pow = Math.pow(i, exponent);
            System.out.print(pow + " ");
        }
        System.out.println();
    }

    /*
    Task 14
    Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
     */
    public static void getSubquencesDouble() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i);
            if (i == 9) {
                for (int i1 = 0; i1 <= 9; i1++) {
                    System.out.print(i1 + "" + i1);
                    if (i1 == 9) {
                        for (int i2 = 0; i2 <= 9; i2++) {
                            System.out.print(i2 + "" + i2 + "" + i2);
                            if (i2 == 9) {
                                for (int i3 = 0; i3 <= 9; i3++) {
                                    System.out.print(i3 + "" + i3 + "" + i3 + "" + i3);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
    }
    /*
    Task 15
    Написать метод, который генерирует  последовательность чисел:
    0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
    Метод формирует строку из сгенерированных значений,
    и выводит результат единожды на печать. ПРотестировать этот метод.
     */
    public static String getSubquencesPlusMinus() {
        String result = "0";

        for (int i = 1; i < 6; i++) {
            result += ", " + i + ", " + i * -1;
        }
        return result;
    }
    /*
    Task 16
    Распечатать последовательность чисел:
    0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
     */
    public static void getSubquencesUnStep () {
        for (int i = 0; i <= 25; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    /*
    Task 17
    Написать метод, который принимает параметры n, m, l,
    и печатает последовательность нечетных чисел начиная с числа n, с шагом m, длина последовательности l.
     */
    public static void getSubUnmatched (int n, int m, int l) {
        for (int i = n; i < l; i += m) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printTaskNumber(1);

        fromOnetoNine();

        printTaskNumber(2);

        getNumberFrom10To0();

        printTaskNumber(3);

        getNumberFrom50To55();

        printTaskNumber(4);

        getSubsequenceMultiplesOnSeven();

        printTaskNumber(5);

        getSubquencesWithStepZeroDotNull();

        printTaskNumber(6);

        getSubEven();

        printTaskNumber(7);

        getSubMultiplesOnSeven();

        printTaskNumber(8);

        getSubShort();

        printTaskNumber(9);

        getSub11_12_0();

        printTaskNumber(10);

        getSubWithParams(2, 2, 44);

        printTaskNumber(11);

        getSubWithChar('a', 'z');

        printTaskNumber(12);

        getEveNumbers(20);

        printTaskNumber(13);

        getSubMathPow(8);

        printTaskNumber(14);

        getSubquencesDouble();

        printTaskNumber(15);

        String test15 = "0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5";

        String expectedResultString = test15;

        String actualResultString = getSubquencesPlusMinus();
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(1);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        System.out.println(getSubquencesPlusMinus());

        printTaskNumber(16);

        getSubquencesUnStep();

        printTaskNumber(17);

        getSubUnmatched(2,3,60);

    }
}
