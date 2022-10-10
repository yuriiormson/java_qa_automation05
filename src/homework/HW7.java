package homework;

public class HW7 {
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
    Прочитать ссылку про оператор switch в документации Oracle, посмотреть видео (ссылки в презентации),
    и переписать  методы returnMonth(), returnDayOfTheWeek() с помощью оператора switch.
    (Эти методы нужно найти в Слаке в коде, который выставляла Гаяна в субботу, 8 октября).
    */
    public static String returnMonth(int number) {
        int minNumber = 0;
        int maxNumber = 13;
        String monthString = "";
        if (number > minNumber && number < maxNumber) {
            switch (number) {
                case 1:
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
            }
        } else {
            return "Error";
        }
        return monthString;
    }

    public static String returnDayOfWeek(int number) {
        int minNumber = 0;
        int maxNumber = 8;
        String weekString = "";
        if (number > minNumber && number < maxNumber) {
            switch (number) {
                case 1:
                    weekString = "Monday";
                    break;
                case 2:
                    weekString = "Tuesday";
                    break;
                case 3:
                    weekString = "Wednesday";
                    break;
                case 4:
                    weekString = "Thursday";
                    break;
                case 5:
                    weekString = "Friday";
                    break;
                case 6:
                    weekString = "Saturday";
                    break;
                case 7:
                    weekString = "Sunday";
                    break;
            }
        } else {
            return "Error";
        }
        return weekString;
    }

    /*
    Task 2
    Написать универсальный метод для построения последовательности, которая начинается с числа start,
    заканчивается числом end (оба включительно). Все числа в этой последовательности должны быть кратны числу step.
    Этот метод должен высчитывать первое кратное число в диапазоне [start, end]
    и строить последовательность (возрастающую или убывающую) от вычисленного первого кратного числа с шагом step.
    (Эта задача по мотивам разбора HW6,  Part 1  в воскресенье 9 октября)
     */
    public static void returnUniversalSubquences(int start, int step, int end) {
        if (step > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (i % step == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (step < 0 && end < 0){
            for (int i = start; i >= end; i--) {
                if (i % step == 0) {
                    System.out.println(i + " ");
                }
            }
        } else
            System.out.println("Error");
        System.out.println();
    }

    public static void main(String[] args) {

        printTaskNumber(1);

        System.out.println(returnMonth(11));
        System.out.println();

        int monthTC = 7;
        String expectedResultString = "July";
        String actualResultString = returnMonth(monthTC);
        verifyEquals(expectedResultString, actualResultString);
        printTCNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        monthTC = 13;
        expectedResultString = "Error";
        actualResultString = returnMonth(monthTC);
        verifyEquals(expectedResultString, actualResultString);
        printTCNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        printTaskNumber(1.1);

        System.out.println(returnDayOfWeek(3));
        System.out.println();

        int weekTC = 3;
        expectedResultString = "Wednesday";
        actualResultString = returnDayOfWeek(weekTC);
        verifyEquals(expectedResultString, actualResultString);
        printTCNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        weekTC = 8;
        expectedResultString = "Error";
        actualResultString = returnDayOfWeek(weekTC);
        verifyEquals(expectedResultString, actualResultString);
        printTCNumber(4);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        printTaskNumber(2);

        returnUniversalSubquences(8, -3, -30);

    }
}
