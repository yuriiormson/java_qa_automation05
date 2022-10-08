package lessons;

public class Lesson5_Part_2 {
    static int tcNumber = 1;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++  + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }

    //Методы, которые сравнивают expectedResult с actualResult
    public static String verifyEquals(int expectedResult, int actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    //Задачи и методы к ним

    //Найти максимальное значение между
    //a и b
    //Протестировать работу методов

    public static int findMaxOutOfTwo(int a, int b) {
        int max;

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public static int findMaxOutOfTwo1(int a, int b) {

        return Math.max(a, b);
    }

    public static int findMaxOutOfTwo2(int a, int b) {
        if (a >= b) {

            return a;
        } else {

            return b;
        }
    }

    //Найти максимальное значение, если заданы переменные
    // a, b, c, d
    public static int findMaxOutOfFour(int a, int b, int c,  int d) {
        int max;
        int max1;

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }

        if (c >= d) {
            max1 = c;
        } else {
            max1 = d;
        }

        if (max >= max1) {

            return max;
        } else {

            return max1;
        }
    }

    public static int findMaxOutOfFour1(int a, int b, int c,  int d) {
        int max;

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        if (max < d) {
            max = d;
        }

        return max;
    }

    public static int findMaxOutOfFour2(int a, int b, int c,  int d) {

        return Math.max(a, Math.max(b,  Math.max(c, d)));
    }

    public static int findMaxOutOfFour4(int a, int b, int c,  int d) {

        return findMaxOutOfTwo(a, findMaxOutOfTwo(b, findMaxOutOfTwo(c, d)));
    }

    //Написать метод, который принимает на вход число от 1 до 12  и возвращает название месяца.
    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            if (number == 1) {

                return "January";
            }
            if (number == 2) {

                return "February";
            }
            if (number == 3) {

                return "March";
            }
            if (number == 4) {

                return "April";
            }
            if (number == 5) {

                return "May";
            }
            if (number == 6) {

                return "June";
            }
            if (number == 7) {

                return "July";
            }
            if (number == 8) {

                return "August";
            }
            if (number == 9) {

                return "September";
            }
            if (number == 10) {

                return "October";
            }
            if (number == 11) {

                return "November";
            }
            if (number == 12) {

                return "December";
            }
        }

        return "Error";
    }

    // Написать метод, который получает на вход расстояние (десятичное число) и возвращает расстояние в
// километрах и метрах в виде текста "... км ... м"
    public static String evaluateDistance(double distance) {
        int km = (int) distance;
        int m = (int) ((distance - km) * 1000);

        return "" + km + " км " + m + " м";
    }


    public static void main(String[] args) {
//        System.out.println(findMaxOutOfTwo(5, 9));
//        System.out.println(findMaxOutOfTwo(3, 3));
//        System.out.println(findMaxOutOfTwo(9, 5));
//
//        System.out.println(findMaxOutOfTwo1(5, 9));
//        System.out.println(findMaxOutOfTwo1(3, 3));

        //______________________________________________________
        //Auto Tests

        //TC_1
        //AAA - triple "A" правило для создания автоматизированного тест кейса

        //A - arrange (объявить все данные, которые нам известны)
        int a = 5;
        int b = 9;
        int expectedResult = 9;

        //Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        int actualResult = findMaxOutOfTwo(a, b);

        //A = assert  - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(expectedResult, actualResult);


        //отчет (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));

        //_________________________________________________________________________

        //TC_2
        a = 3;
        b = 3;
        expectedResult = 3;

        actualResult = findMaxOutOfTwo(a, b);

        verifyEquals(expectedResult, actualResult);

        //отчет (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));

        //_________________________________________________________________________

        //TC_3
        a = 10;
        b = 5;
        expectedResult = 10;

        actualResult = findMaxOutOfTwo(a, b);

        verifyEquals(expectedResult, actualResult);


        //отчет (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));

//        verifyEquals("Hi", "Hi"); //Pass
//        verifyEquals(3.3, 3.3);//Pass
//        verifyEquals(4, 5);//Fail

        //TC_4
        int number = 5;
        String expectedResultString = "May";

        String actualResultString = returnMonth(number);

        verifyEquals(expectedResultString, actualResultString);


        //отчет (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultString, actualResultString));


        //TC_5
        number = 13;
        expectedResultString = "Error";

        actualResultString = returnMonth(number);

        verifyEquals(expectedResultString, actualResultString);


        //отчет (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultString, actualResultString));
//


        //TC_6
        double distance = 6.004;
        expectedResultString = "6 км 4 м";

        actualResultString = evaluateDistance(distance);

        verifyEquals(expectedResultString, actualResultString);


        //отчет (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        System.out.println(evaluateDistance(distance));

    }
}
