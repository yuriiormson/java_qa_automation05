package homework;

public class HW2 {
    public static void main(String[] args) {

        int number = 3;
        String task = "Task";
        char subTask = 'a';
        double x = 3;
        double y = 8;
        int z = 11;

        System.out.println(task + " " + ++number + subTask + "\n");
        System.out.println(" " + x + '\n' + " " + y + '\n' + " " + z + '\n');

        subTask = 'b';

        System.out.println(task + " " + number + subTask + "\n");
        System.out.println(" " + x + " " + y + " " + z + "\n");

        subTask = 'c';

        System.out.println(task + " " + number + subTask + "\n");
        System.out.println("x = " + x + '\n' + "y = " + y + '\n' + "z = " + z + '\n');
        //Task 5
        System.out.println(task + " " + ++number + "\n");
        System.out.println(" " + x + ", " + y + ", " + z + "\n");
        //Task 6
        System.out.println(task + " " + ++number + "\n");
        System.out.println("Sum of x and y = " + x + y);
        System.out.println("x * z = " + x * z);
        System.out.println("Difference in variable y and z = " + (y - z) + "\n");
        //Task 7
        int apple = 40;
        int student = 6;

        System.out.println(task + " " + ++number + "\n");
        System.out.println("If " + apple + " apples divide on " + student + " students, then every student gets "
                        + (apple / student) + " apples, and " + (apple % student) + " apples lefts for teacher\n");
        //Task 8
        apple = 100;
        student = 21;

        System.out.println(task + " " + ++number + "\n");
        System.out.println("If " + apple + " apples divide on " + student + " students, then every student gets "
                        + (apple / student) + " apples, and " + (apple % student) + " apples lefts for teacher\n");
        //Task 9
        int lemons = 6;
        int apples = lemons + 24;
        int pear = apples - 12;
        int totalFruit = lemons + apples + pear;

        System.out.println(task + " " + ++number + "\n");
        System.out.println("Lemons = " + lemons);
        System.out.println("Apples = " + apples);
        System.out.println("Pear = " + pear);
        System.out.println("Total amount of fruits is = " + totalFruit + "\n");
        //Task 10
        int allLegs = 40;
        int nuyut = 8;
        int gudiat = 5;
        int hromaiut = 7;
        int pain = 2;
        int healthyLeggs = allLegs - nuyut - gudiat - hromaiut - pain;

        System.out.println(task + " " + ++number + "\n");
        System.out.println(
                "У сороконожки заболели ножки:\n" + "8 ноют, 5 гудят,\n" + "7 хромают, 2 болят.\n"
                        + "Помоги сороконожке\n" + "Посчитать здоровые ножки.\n" + "Ответ: " + healthyLeggs + "\n"
        );

        // PART 2
        // Task 11
        int biggerThanSeven = 35 / 7;
        int smallerThanEight = 48 / 8;
        int fiftyFourBigger = 54 - 6;

        System.out.println(task + " " + ++number + "\n");
        System.out.println("How many times is 35 more than 7 ? Answer: " + biggerThanSeven);
        System.out.println("How many times is 8 less than 48 ? Answer: " + smallerThanEight);
        System.out.println("By how much is 54 more than 6 ? Answer: " + fiftyFourBigger + "\n");

        //Task 12
        subTask = 'a';
        int sorokVisim = 48 / 8;

        System.out.println(task + " " + ++number + subTask + "\n");
        System.out.println(
                "Почему число 48 кратно 8: Oтвет: Потому чтт его множители"
                + ", равны 1, 2, 3, 4, 6, 8, 12, 16, 24 и 48."
                + " Если вы проверите, то увидите, что число 48 делится на все эти числа.\n"
                + "48/8 = " + sorokVisim + "\n"
        );

        subTask = 'b';
        int countNum = 6 % 2;

        System.out.println(task + " " + number + subTask + " and c" + "\n");
        System.out.println("Что оба числа - четные.: При делениии на 2 остаток 0. \n"
                + " Остаток от деления 6 % 2 = " + countNum + "\n");

        subTask = 'с';
        int unmatched = 47 % 2;

        System.out.println(task + " " + number + subTask + " and c" + "\n");
        System.out.println(
                "Что оба числа - не четные.: "
                        + "При делениии на 2  есть остаток. \n"
                        + " Остаток от деления 47 % 2 = " + unmatched + "\n");
        unmatched = 49 % 2;
        System.out.println(
                "Что оба числа - не четные.: "
                        + "При делениии на 2  есть остаток. \n"
                        + " Остаток от деления 49 % 2 = " + unmatched + "\n");

        subTask = 'd';
        System.out.println(task + " " + number + subTask + " and c" + "\n");
        System.out.println("Что оба числа - четные.: " + "\n");

        //Task 13
        int k = 5;
        int kPlusTen = k + 10;
        int kMinusFive = kPlusTen - 5;
        int kMultiHund = k * 100;
        int kDivideTwo = k / 2;
        int kRemainderTwo = k % 2;
        int kRootFive = k * k * k;
        int kPlusPlus = ++k; // k = k + 1
        int kMinusMinus = k - 2;
        String firstLine = "+-------+-------+-------+--------+------+------+------+------+------+\n";

        System.out.println(task + " " + ++number + "\n");
        System.out.println(firstLine);
        System.out.println("|       |   +10 |   -5  |  *100  |  /2  |   2  |  ^2  |  ++  |  --  |\n");
        System.out.println("+-------+-------+-------+--------+------+------+------+------+------+\n");
        System.out.println(
                "+ k = 5 +   " + kPlusTen + "  +   " + kMinusFive + "  +  " + kMultiHund + "   +   "
                        + kDivideTwo + "  +   "
                        + kRemainderTwo + "  +  " + kRootFive + "  +  " + kPlusPlus + "  +  " + kMinusMinus
                        + "   +  \n");
        System.out.println("+-------+-------+-------+--------+------+------+------+------+------+\n");

        int l = 8;
        kPlusTen = l + 10;
        kMinusFive = kMinusFive - 5;
        kMultiHund = l * 100;
        kDivideTwo = l / 2;
        kRemainderTwo = l % 2;
        kRootFive = l * l * l;
        kPlusPlus = l++;
        kMinusMinus = l - 2;
        System.out.println(
                "+ l = 8 +   " + kPlusTen + "  +   " + kMinusFive + "  +  " + kMultiHund + "   +   "
                        + kDivideTwo + "  +   "
                        + kRemainderTwo + "  +  " + kRootFive + "  +  " + kPlusPlus + "  +  " + kMinusMinus
                        + "   +  \n");
        System.out.format("+-------+-------+-------+--------+------+------+------+------+------+\n");

        int m = 3;
        kPlusTen = m + 10;
        kMinusFive = kPlusPlus - 5;
        kMultiHund = m * 100;
        kDivideTwo = m / 2;
        kRemainderTwo = m % 2;
        kRootFive = m * m * m;
        kPlusPlus = m++;
        kMinusMinus = m - 2;
        System.out.format(
                "+ m = e +   " + kPlusTen + "  +   " + kMinusFive + "  +  " + kMultiHund + "   +   "
                        + kDivideTwo + "  +   "
                        + kRemainderTwo + "  +  " + kRootFive + "  +  " + kPlusPlus + "  +  " + kMinusMinus
                        + "   +  \n");
        System.out.format("+-------+-------+-------+--------+------+------+------+------+------+\n" + "\n");

        //Task 14

        System.out.println(task + " " + ++number + "\n");

        x = 7;
        y = 18;
        int n = 3;
        double res = (int)((x * x * x) * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y)));
        System.out.println("If \n" + "x = 7\n" + "y = 18\n" + "n = 3\n" + "then\n"
                        + "xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = " + res + "\n");

        //Task 15

        System.out.println(task + " " + ++number + "\n");

        int p = 15; //suits for five days
        int o = 5;   //days during one suits was made
        int oneDay = p / o; // suits per day
        int u = 69; //Goal is 69 suits
        int countDays = u / oneDay; //days that we need for 69 suits

        System.out.println("We will produce " + u + " suits for the " + countDays + " days.\n");

        //Task 16

        System.out.println(task + " " + ++number + "\n");

        int a = 33;
        int b = 11;
        int c = 8;
        c++;
        int abcPlusPlus = a + b + c;

        System.out.println("a, b, c++ = " + abcPlusPlus);

        abcPlusPlus--;

        System.out.println("sumABC-- = " + abcPlusPlus);

        b++;
        int remSum = b % abcPlusPlus;
        System.out.println("Remainder of b++ and sumCBA = " + remSum + "\n");

        //Task 17

        System.out.println(task + " " + ++number + "\n");

        x = 2;
        int remSum1 = (int) (x * x * x);

        System.out.println("Result of task 17 : " + remSum1 + "\n");

        //Task 18

        System.out.println(task + " " + ++number + "\n");

        x = 7;
        y = 18;
        a = 33;
        b = 44;
        c = 55;
        int remSum2 = (int) (((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) / 9 * ((4 / x) / ((9 / x) / y)));

        System.out.println("Result of formula = " + remSum2 + "\n");

        //Task 19

        System.out.println(task + " " + ++number + "\n");

        int d = 4;
        int remSum19a = (int) (((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y)));
        int remSum19b = a + b + (c / d) + ((a + b) / (c + d)) + a * b;
        int remSum19 = remSum19a / remSum19b;
        System.out.println("Result of formula = " + remSum19 + "\n");

        //Task 20

        System.out.println(task + " " + ++number + "\n");
        int Fahrenheit = 80;
        int Celsius;
        Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("Weather in Fahrenheit = " + Fahrenheit + " == " + "Weather in Celsium = " + Celsius);

        Celsius = 25;
        Fahrenheit = ((Celsius * 9) / 5) + 32;
        System.out.println("Weather in Celsium = " + Celsius + " == " + "Weather in Fahrenheit = " + Fahrenheit);

    }
}
