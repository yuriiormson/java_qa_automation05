package homework;

public class HW5 {

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

    /*
    Task 1
    Cоздать метод
    verifyEquals(expectedResult, actualResult) {}
    так, как мы делали на уроке. Попробуйте написать его самостоятельно, и потом свериться с кодом с урока.
     */
    public static String verifyEquals(int expectedResult, int actualResult){
        if (actualResult == expectedResult) {
            return ANSI_GREEN + "Pass" + ANSI_RESET;
        } else {
            return ANSI_RED + "Fail" + ANSI_RESET;
        }
    }
    public static String verifyEquals(String expectedResult, String actualResult){
        if (expectedResult.equals(actualResult)) {
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
        System.out.print(ANSI_PURPLE + "TC_" + tcNumber++  + "\t -- \t" + ANSI_RESET);
        return tcNumber;
    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }

    /*
    Task 2
    Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. Протестировать метод
     */
    public static String getWeekName (int weNa) {
        if (weNa > 0 && weNa < 8) {
            if (weNa == 1) {
                return "Monday";
            }
            if (weNa == 2) {
                return "Tuesday";
            }
            if (weNa == 3) {
                return "Wednesday";
            }
            if (weNa == 4) {
                return "Thursday";
            }
            if (weNa == 5) {
                return "Friday";
            }
            if (weNa == 6) {
                return "Saturnday";
            }
            if (weNa == 7) {
                return "Sunday";
            }
        }
        return "Enter valid week day";
    }
    /*
    Task 3
    Написать алгоритм вычисления среднего возраста в семье из 3х человек.
    Например,
    age1 = 20,
    age2 = 40,
    age3 = 60
    Average = 40.
    Протестируйте алгоритм на позитивные и негативные сценарии.
     */
    public static int countAverAge (int age1, int age2, int age3) {
        if (
                age1 > 0 && age1 <= 150
                && age2 > 0 && age2 <= 150
                && age3 > 0 && age3 <= 150
        ) {
            int average = (age1 + age2 + age3) / 3;
            return average;
        }
        return 0; // 0 = enter valid age
    }
    /*
    Task 4
    Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
    k и l
    k, l, m
    k, l, m, n
	Переменные должны быть типа int

	Happy path test data:
    if k = 3, l = 30, m = 300, n = 3000
    expected results:
    a) 3
    b) 3
    c) 3
    Написать тесты на каждый метод.
     */
    public static int getMinimalVal (int k, int l) {
        if (k < l) {
            return k;
        }
        return l;
    };
    public static int getMinimalVal (int k, int l, int m) {
        int min = 0;
        if (k <= l) {
            min = k;
        } else {
            min = l;
        }
        if (min > m) {
            min = m;
        }
        return min;
    };
    public static int getMinimalVal (int k, int l, int m, int n) {
        int min = 0;
        if (k <= l) {
            min = k;
        } else {
            min = l;
        }
        if (min > m) {
            min = m;
        }
        if (min > n) {
            min = n;
        }
        return min;
    };
    /*
    Task 5
    Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
    Например,
    t1 = 39
    t2 = 39
    t3 = 39
    t4 = 39
    t5 = 39
    TempAverage = 39
    Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы.
    Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку.
    Согласно документации клиента https://vetna.info/bolezni/koshki/ponizhennaya-temperatura-u-kota/
    https://junglevet.ru/stati/povyshenie-temperatury-tela-u-koshki/
    кот все еще жив при температурах от 28С до 41С.
    По статистике клиента, некоторые коты могут быть все еще живы при температурах от 25С до 45 С
    Протестируйте метод на позитивные и негативные сценарии.
     */
    public static int getAveTempCat (int temp1, int temp2, int temp3, int temp4, int temp5) {
        if (
                        temp1 >= 25 && temp1 <= 45
                        && temp2 >= 25 && temp2 <= 45
                        && temp3 >= 25 && temp3 <= 45
                        && temp4 >= 25 && temp4 <= 45
                        && temp5 >= 25 && temp5 <= 45
        ) {
            int averageCatTemp =  (temp1 + temp2 + temp3 + temp4 + temp5) / 5;
            return  averageCatTemp ;
        }
    return -1;
    }
    /*
    Task 6
    Написать метод, который принимает на вход количество часов (int) работы в день,
     стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
    При невалидных значениях метод возвращает -1.
    Уточнения:
    Стоимость одного часа для разных сотрудников может быть разная. Данные о зарплате сотрудников мы не разглашаем.
    НО наши сотрудники не работают бесплатно и не выплачивают компании долги за право работать.
    Зарплата сотрудников рассчитывается согласно законодательства штата.
    Страна = RedRover.school
    Штат = Java for beginers
    По законодательству нашего штата минимальная оплата рабочего часа - 12.
    В организации нет сотрудников у которых  сокращенная рабочая неделя
    ( несовершеннолетние, инвалиды, вредные условия труда  ) , но сотрудники могут выбирать,
    сколько часов в день они могут работать. Овертайм оплачивается по обычной ставке.
    ПО уточненным требованиям:
    Будем считать, что в нашей организации вот этот документ определяет      Среднемесячную норму рабочего времени
    https://clubtk.ru/srednee-kolichestvo-rabochikh-dney-v-mesyatse
    Но среднемесячная норма не означает, что нельзя работать больше 8 часов в день.
     */
    public static double countSalaryPerMonth (int hoursPerDay, double payPerHour) {
        double daysPerMonth = 21;
        if (payPerHour >= 12 && hoursPerDay <= 24) {
            double countSalary = (daysPerMonth * hoursPerDay) * payPerHour;
            return Math.round(countSalary);
        }
        return -1;
    }
    /*
    Task 7
    Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках).
    Алгоритм возвращает сумму покупки в виде десятичного числа.
    Например,
    price for 1 = 25 руб 50 коп (25.5)
    amount = 5
    expected total = 127 руб 50 коп (127.5)
    При невалидных значениях метод возвращает -1
    ПРоверьте метод на позитивный и негативный сценарий.
     */
    public static double countPurchaseAmount (int amountGoods, double priceGoods) {
        if (amountGoods > 0 && priceGoods > 0) {
            double amountOfGoods = amountGoods * priceGoods;
            return  amountOfGoods;
        }
        return -1;
    }
    /*
    Task 8
    Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи
    зарплаты сотрудникам.
    Например:
    “Смирнова Мария Ивановна 		70000 руб 00 коп”
    если имя сотрудника придет в виде пустой строки или в виде null
    (String -  это референсный тип данных и может принимать значение null),
    то в ведомости должна быть распечатана пустая строка "".
    Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0,
    то в ведомости тоже должна быть распечатана пустая строка ""
    Протестировать метод.
     */
    public static String getCompensationReport (String fio, double salary) {
        if (!fio.isEmpty() && salary >= 0) {
            int uah = (int) salary;
            int coin = (int) ((salary - uah) * 100);

            String result = fio + "\t\t\t" + uah + " UAH ";
            if (uah >= 9 && coin < 10) {
                return result = result + "0" + coin + " coin";
            } else {
                return result = result + coin + " coin";
            }

        }
        return "";
    }
    /*

     */
    /*
    Task 9
    Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:
    Смирнова Мария Ивановна 		70000 руб 00 коп
    Серебров Иван Петрович 		128059 руб 00 коп
    Метод в задании 9 может принимать разные параметры, в зависимости от того,
     что вам нужно для печати ведомости.
    Смысл этого метода - распечатать несколько строк ведомости одновременно.
     Каждая из строк должна формироваться с помощью метода, написанного в задании 8.
    На этот метод писать тесты не нужно, просто распечатать ведомость.
     */
    public static String getCompensationReport1 (String str) {
        return str;
    }
    /*
    Task 10
     */
    public static String getStatusOfX (int x) {
        if (x < 0) {
            return "x is negative";
        } else {
            if ( x > 0) {
                return "x is positive";
            } else {
                return "x is zero";
            }
        }
    }
    //PART 2
    /*
    Task 11
    Написать метод, который принимает на вход десятичное число (например, 10.75),
     и возвращает строку “10 руб 75 коп”.
     */
    public static String getPrice (double price) {
        if (price > 0) {

            double intNumber = Math.round(price);
            double subNumber = price % intNumber;
            subNumber = subNumber * 100;

            return (int) intNumber + " UAH " + (int) subNumber + " coin";
        }
        return "Enter number than bigger than 0";
    }
    /*
    Task 12
    Написать метод, который принимает на вход десятичное число (например, 10,075) и возвращает строку “10 кг 75 гр”.
     */
    public static String getPriceWithThreeDecimal (double price) {
        if (price > 0) {

        double intNumber = Math.round(price);
        double subNumber = price % intNumber;
        subNumber = subNumber * 1000;

        return (int)intNumber + " UAH " +  (int) subNumber + " coin";
        }
        return "Enter number than bigger than 0";
    }
    /*
    Task 13
    Написать метод, который принимает на вход необходимые параметры, и печатает чек.
    Этот метод тестировать не нужно, но необходимо использовать все раннее написанные методы
    (в задачах из Part 1 тоже могут пригодиться некоторые методы)

    Пример чека:

    Яблоки
    Цена за 1 кг			50 руб 13 коп
    Количество товара	         3 кг 400 гр
    _______________________________________
    Сумма к оплате		170 руб 44 коп

    или

    Хлеб
    Цена за 1 шт		30 руб 50 коп
    Количество товара	5 шт
    _______________________________________
    Сумма к оплате		152 руб 50 коп
     */
    public static String printInvoice (String nameGood, double amountGoods, double priceGoods ) {
        if (amountGoods > 0 && priceGoods > 0) {
        double amountOfGoods = amountGoods * priceGoods;

        double intNumber = Math.floor(priceGoods);
        double subNumber = priceGoods % intNumber;
        subNumber = subNumber * 100;

        double intNumber2 = Math.floor(amountGoods);
        double subNumber2 = amountGoods % intNumber2;
        double subNumberRound = subNumber2 * 1000;

        double intNumber3 = Math.floor(amountOfGoods);
        double subNumber3 = amountOfGoods % intNumber3;
        double subNumberRound1 = subNumber3 * 100;

        return nameGood + "\n"
                + "Price for 1kg\t\t" + (int)intNumber + " UAH " + (int)subNumber + " coins\n"
                + "Amount of goods\t\t" + (int)intNumber2 + " kg " + (int)subNumberRound + " gram\n"
                + "_______________________________________\n"
                + "Total amount to pay  " + (int)intNumber3 + " UAH " + (int)subNumberRound1 + " coins";
        }
        return "Enter number than bigger than 0";
    }
    /*
    Task 14
    Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
    Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
    снова считается сумма всех чисел.
    Например:
    год рождения 1999
    1 + 9 + 9 + 9 = 28
    2 + 8 = 10
    1 + 0 = 1
    Счастливое число - 1
     */
    public static String getLuckyNumber (int number) {
        int luckyNum;
        if ((number > 0) && (number <= 9999)) {
            int firstNumber = number / 1000;
            int secondNumber = number / 100 % 10;
            int thirdNumber = number / 10 % 10;
            int fourthNumber = number % 10;
            luckyNum = firstNumber + secondNumber + thirdNumber + fourthNumber;
            if (luckyNum > 9) {
                firstNumber = luckyNum / 10 % 10;
                secondNumber = luckyNum % 10;
                luckyNum = firstNumber + secondNumber;
            }
            if (luckyNum > 9) {
                firstNumber = luckyNum / 10 % 10;
                secondNumber = luckyNum % 10;
                luckyNum = firstNumber + secondNumber;
            }
            return "Lucky number - " + luckyNum;
        }
        return "Enter number bigger than 0";
    }
    /*
    Task 15
    а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
    b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
    *Медиана - это серединное число в отсортированном наборе чисел.
    1, 3, 9 → медиана 3
    12, 13, 101 → медиана 13
    14, 2, 12 → медиана 12
    ВСе параметры приходят в int, расчеты производим в int
    Протестировать оба метода - a) и b)
     */
    public static String getAverageMedian (int num1, int num2, int num3) {
        if ((num1 > 0) && (num2 > 0) && (num3 > 0)) {
            int average = (num1 + num2 + num3) / 3;
            int median = 0; //middleOfThree
            int diffAveMed = 0;
            if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {
                median = num2;
            } else if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) {
                median = num1;
            } else
                median = num3;

            if (average > median) {
                diffAveMed = average - median;
            } else
                diffAveMed = median - average;

            if (diffAveMed > 2) {
                return "Average value " + average + " different from median " + median + " on " + diffAveMed;
            } else
                return "Average value = " + average + ", " + "median = " + median;
        }
        return "Error";
    }
    /*
    Task 16
    Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки,
    например “10 руб 00 коп”
     */
    public static String getBestPrice (double price) {
        if (price > 0) {

            double intNumber = Math.floor(price);
            return (int) intNumber + " UAH " + "00 coin";
        }
        return "Enter number than bigger than 0";
    }
    /*
    Task 17
    Посчитать с помощью методов класса Math
    int a = 3
    int b = 4
    int c = 20
    Вернуть значение с округлением в бОльшую сторону.
     */
    public static double getResultFormula (double a, double b, double c) {
        if ((a > 0) && (b > 0) && (c > 0)) {
            double first = a * b + c;
            double second = first * Math.pow(a,b);
            double third = Math.sqrt(second);
            double fourth = third / Math.PI;

            return Math.ceil(fourth);
        }

        return -1;
    }

    public static void main(String[] args) {

        printTaskNumber(2);

        int weNaTC = 0;

        String expectedResultString = "Enter valid week day";
        String actualResultString = getWeekName(weNaTC);
        verifyEquals(expectedResultString, actualResultString);
        printTCNumber(1);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        weNaTC = 5;

        expectedResultString = "Friday";
        actualResultString = getWeekName(weNaTC);
        verifyEquals(expectedResultString, actualResultString);
        printTCNumber(2);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        weNaTC = 8;

        expectedResultString = "Enter valid week day";
        actualResultString = getWeekName(weNaTC);
        verifyEquals(expectedResultString, actualResultString);
        printTCNumber(3);
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        printTaskNumber(3);

        int aveAgeTC1 = 20;
        int aveAgeTC2 = 40;
        int aveAgeTC3 = 151;
        int expectedResult = 0;

        int actualResult = countAverAge(aveAgeTC1,aveAgeTC2,aveAgeTC3);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(4);
        printTestResult(verifyEquals(expectedResult,actualResult));

        aveAgeTC1 = 20;
        aveAgeTC2 = 40;
        aveAgeTC3 = 60;
        expectedResult = 40;

        actualResult = countAverAge(aveAgeTC1,aveAgeTC2,aveAgeTC3);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(5);
        printTestResult(verifyEquals(expectedResult,actualResult));

        aveAgeTC1 = 0;
        aveAgeTC2 = 40;
        aveAgeTC3 = 60;
        expectedResult = 0;

        actualResult = countAverAge(aveAgeTC1,aveAgeTC2,aveAgeTC3);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(6);
        printTestResult(verifyEquals(expectedResult,actualResult));

        printTaskNumber(4);

        int ageMinTC = 3;
        int ageMinTC1 = 30;
        expectedResult = 3;

        actualResult = getMinimalVal(ageMinTC,ageMinTC1);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(7);
        printTestResult(verifyEquals(expectedResult,actualResult));

        ageMinTC = 3;
        ageMinTC1 = 30;
        int ageMinTC2 = 300;
        expectedResult = 3;

        actualResult = getMinimalVal(ageMinTC,ageMinTC1,ageMinTC2);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(8);
        printTestResult(verifyEquals(expectedResult,actualResult));

        ageMinTC = 3;
        ageMinTC1 = 30;
        ageMinTC2 = 300;
        int ageMinTC3 = 3000;
        expectedResult = 3;

        actualResult = getMinimalVal(ageMinTC,ageMinTC1,ageMinTC2,ageMinTC3);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(9);
        printTestResult(verifyEquals(expectedResult,actualResult));

        ageMinTC = 3;
        ageMinTC1 = 30;
        ageMinTC2 = 300;
        ageMinTC3 = -3000;
        expectedResult = -3000;

        actualResult = getMinimalVal(ageMinTC,ageMinTC1,ageMinTC2,ageMinTC3);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(10);
        printTestResult(verifyEquals(expectedResult,actualResult));

        printTaskNumber(5);

        int catAveTC1 = 26;
        int catAveTC2 = 27;
        int catAveTC3 = 28;
        int catAveTC4 = 29;
        int catAveTC5 = 44;

        expectedResult = 30;
        actualResult = getAveTempCat(catAveTC1,catAveTC2,catAveTC3,catAveTC4,catAveTC5);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(11);
        printTestResult(verifyEquals(expectedResult, actualResult));


        catAveTC1 = 26;
        catAveTC2 = 27;
        catAveTC3 = 28;
        catAveTC4 = 29;
        catAveTC5 = -44;

        expectedResult = -1;
        actualResult = getAveTempCat(catAveTC1,catAveTC2,catAveTC3,catAveTC4,catAveTC5);
        verifyEquals(expectedResult,actualResult);
        printTCNumber(12);
        printTestResult(verifyEquals(expectedResult, actualResult));

        printTaskNumber(6);

        int hoursPerDayTC = 8;
        double payPerHourTC = 420.64;

        expectedResult = 70668;
        double actualResultDouble = countSalaryPerMonth(hoursPerDayTC, payPerHourTC);
        verifyEquals(expectedResult,actualResultDouble);
        printTCNumber(13);
        printTestResult(verifyEquals(expectedResult,actualResultDouble));

        hoursPerDayTC = 24;
        payPerHourTC = 1000.11;
        expectedResult = 504055;
        actualResultDouble = countSalaryPerMonth(hoursPerDayTC, payPerHourTC);
        verifyEquals(expectedResult,actualResultDouble);
        printTCNumber(14);
        printTestResult(verifyEquals(expectedResult,actualResultDouble));

        hoursPerDayTC = 25;
        payPerHourTC = 1000.11;
        expectedResult = -1;
        actualResultDouble = countSalaryPerMonth(hoursPerDayTC, payPerHourTC);
        verifyEquals(expectedResult,actualResultDouble);
        printTCNumber(15);
        printTestResult(verifyEquals(expectedResult,actualResultDouble));

        hoursPerDayTC = 8;
        payPerHourTC = 11.91;
        expectedResult = -1;
        actualResultDouble = countSalaryPerMonth(hoursPerDayTC, payPerHourTC);
        verifyEquals(expectedResult,actualResultDouble);
        printTCNumber(16);
        printTestResult(verifyEquals(expectedResult,actualResultDouble));

        printTaskNumber(7);
        System.out.println(countPurchaseAmount(7,14));

        int amGoTC = 1;
        double prGoTC = 99.99;
        double expectedResultDouble = 99.99;
        actualResultDouble = countPurchaseAmount(amGoTC,prGoTC);
        verifyEquals(expectedResultDouble,actualResultDouble);
        printTCNumber(17);
        printTestResult(verifyEquals(expectedResultDouble,actualResultDouble));

        amGoTC = 0;
        prGoTC = 99.99;
        expectedResultDouble = -1;
        actualResultDouble = countPurchaseAmount(amGoTC,prGoTC);
        verifyEquals(expectedResultDouble,actualResultDouble);
        printTCNumber(18);
        printTestResult(verifyEquals(expectedResultDouble,actualResultDouble));

        amGoTC = 5;
        prGoTC = 0;
        expectedResultDouble = -1;

        actualResultDouble = countPurchaseAmount(amGoTC,prGoTC);
        verifyEquals(expectedResultDouble,actualResultDouble);
        printTCNumber(19);
        printTestResult(verifyEquals(expectedResultDouble,actualResultDouble));

        printTaskNumber(8);

        System.out.println(getCompensationReport("Jason Momoa",12805.80));

        String nameTC = "Zelenskyy Volodymyr";
        double paPeHoTC = 11111;

        expectedResultString = "Zelenskyy Volodymyr\t\t3033303 UAH";

        actualResultString = getCompensationReport(nameTC,paPeHoTC);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(20);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        printTaskNumber(9);

        nameTC = "Steve Jobs";
        paPeHoTC = 50000;
        System.out.println(getCompensationReport1(getCompensationReport(nameTC,paPeHoTC)));
        nameTC = "Elon Mask";
        paPeHoTC = 919191;
        System.out.println(getCompensationReport1(getCompensationReport(nameTC,paPeHoTC)));

        printTaskNumber(10);

        System.out.println(getStatusOfX(-1));
        System.out.println(getStatusOfX(1));
        System.out.println(getStatusOfX(0));

        printTaskNumber(11);

        System.out.println(getPrice(10.05));
        System.out.println();

        String erroTC = "Enter number than bigger than 0";
        double priceTC = -54.32;

        expectedResultString = erroTC;
        actualResultString = getPrice(priceTC);

        verifyEquals(expectedResultString,actualResultString);

        printTCNumber(21);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        priceTC = 10.99;
        String priceStringTC = "10 UAH 99 coin";

        expectedResultString = priceStringTC;
        actualResultString = getPrice(priceTC);

        verifyEquals(expectedResultString,actualResultString);

        printTCNumber(22);

        printTestResult(verifyEquals(expectedResultString,actualResultString));

        printTaskNumber(12);
        System.out.println(getPriceWithThreeDecimal(10.074));
        System.out.println();

        priceTC = -10.075;

        expectedResultString = erroTC;
        actualResultString = getPriceWithThreeDecimal(priceTC);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(23);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        priceTC = 10.075;

        priceStringTC = "10 UAH 74 coin";
        expectedResultString = priceStringTC;
        actualResultString = getPriceWithThreeDecimal(priceTC);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(24);
        printTestResult(verifyEquals(expectedResultString,actualResultString));




        printTaskNumber(13);

        System.out.println(printInvoice("Apples",1.500, 50.50));
        System.out.println();

        double ammGooTC = -1.500;
        double priGooTC = 50.50;

        expectedResultString = "Enter number than bigger than 0";
        actualResultString = printInvoice("Apples", -1.500,50.50);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(25);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        printTaskNumber(14);

        System.out.println(getLuckyNumber(1989));
        System.out.println();

        int luNuTC = 1999;

        expectedResultString = "Lucky number - 1";
        actualResultString = getLuckyNumber(luNuTC);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(26);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        luNuTC = -1999;

        expectedResultString = "Enter number bigger than 0";
        actualResultString = getLuckyNumber(luNuTC);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(27);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        printTaskNumber(15);

        System.out.println(getAverageMedian(1,3,9));
        System.out.println(getAverageMedian(12,13,101));
        System.out.println(getAverageMedian(14,2,12));
        System.out.println();

        int geAvMeTC = 1;
        int geAvMeTC1 = 3;
        int geAvMeTC2 = 9;

        expectedResultString = "Average value = 4, median = 3";
        actualResultString = getAverageMedian(geAvMeTC,geAvMeTC1,geAvMeTC2);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(28);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        geAvMeTC = 1;
        geAvMeTC1 = 3;
        geAvMeTC2 = -9;

        expectedResultString = "Error";
        actualResultString = getAverageMedian(geAvMeTC,geAvMeTC1,geAvMeTC2);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(29);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        printTaskNumber(16);

        System.out.println(getBestPrice(10.75) + "\n");

        double bePrTC = 10.75;

        expectedResultString = "10 UAH 00 coin";

        actualResultString = getBestPrice(bePrTC);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(30);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        bePrTC = -10.75;

        expectedResultString = "Enter number than bigger than 0";

        actualResultString = getBestPrice(bePrTC);
        verifyEquals(expectedResultString,actualResultString);
        printTCNumber(30);
        printTestResult(verifyEquals(expectedResultString,actualResultString));

        printTaskNumber(17);

        System.out.println(getResultFormula(3,4,20));









    }
}
