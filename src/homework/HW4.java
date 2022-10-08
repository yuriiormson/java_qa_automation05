package homework;

public class HW4 {

    static int taskNumber = 3;
    static String taskName = "Task ~ ";
    static String taskFooter = "# ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ # ~ #\n";

    public static void printTaskNumber() {
        System.out.println(taskName + taskNumber);
        System.out.println(taskFooter);
        taskNumber++;
    }

    public static void converterCelsFaren(float cels) {
        float Fahrenheit;
        Fahrenheit = ((cels * 9) / 5) + 32;
        System.out.println("Weather in Celsium = " + cels + " == " + "Weather in Fahrenheit = " + Fahrenheit);
    }

    public static void executeSomeCalc(int k, int l, int m) {
        int res1 = k / l;
        int res1Rem = k % l;
        int res2 = k / m;
        int res2Rem = k % m;
        int res3 = l / m;
        int res3Rem = l % m;
        int res4 = m / k;
        int res4Rem = m % k;
        System.out.println("Result of divide k on l = " + res1 + ", and remainder of dividing is = " + res1Rem);
        System.out.println("Result of divide k on m = " + res2 + ", and remainder of dividing is = " + res2Rem);
        System.out.println("Result of divide l on m = " + res3 + ", and remainder of dividing is = " + res3Rem);
        System.out.println("Result of divide m on k = " + res4 + ", and remainder of dividing is = " + res4Rem);
    }

    public static void calcAverageSpeed(float distance, float time) {
        float avg = distance / time;
        System.out.println("Average speed is " + avg + " for distance " + distance + " and time " + time);
    }

    public static void calcApples(float apple, int student) {
        String appleStr = "";
        String studentStr = "";
        if (apple == 1) {
            appleStr = "apple";
        } else {
            appleStr = "apples";
        }
        if (student == 1) {
            studentStr = "student";
        } else {
            studentStr = "students";
        }
        System.out.println("If " + apple + " " + appleStr + " divide on " + student + " "
                + studentStr + " , then every " + studentStr + " gets "
                + (apple / student) + " " + appleStr + " , and " + (apple % student) + " "
                + appleStr + " lefts for teacher\n");
    }

    public static void printTable(double d, double dd, float f, float ff) {
        String line1 = "+---------------------------+---------------------------+";
        char pipe = '|';
        float floatSum = f + ff;
        float floatSub = f - ff;
        float floatProduct = f * ff;
        float floatQuotient = f / ff;
        float floatRemainder = f % ff;
        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;
        System.out.println(line1 + line1);
        System.out.println(pipe + "\t" + "f = " + f + "\t\t" + pipe + "\t\t" + "ff = " + ff + "\t\t\t"
                + pipe + pipe + "\t\t" + "d = " + d + "\t " + pipe + "\t\t\t" + "dd = " + dd + "\t\t " + pipe);
        System.out.println(line1 + line1);
        System.out.println(pipe + "\t\t\t\t" + "floatSum = " + floatSum + "\t\t\t\t\t" + pipe + pipe
                + "\t\t\t\t " + "doubleSum = " + doubleSum + "\t\t\t\t " + pipe);
        System.out.println(pipe + "\t\t\t\t" + "floatSub = " + floatSub + "\t\t\t\t\t" + pipe + pipe
                + "\t\t\t\t " + "doubleSub = " + doubleSub + "\t\t\t\t " + pipe);
        System.out.println(pipe + "\t\t\t\t" + "floatProduct = " + floatProduct + "\t\t\t\t" + pipe + pipe
                + "\t\t\t\t " + "doubleProduct = " + doubleProduct + "\t\t\t " + pipe);
        System.out.println(pipe + "\t\t\t\t" + "floatQuotient = " + floatQuotient + "\t\t\t\t" + pipe + pipe
                + "\t\t\t\t " + "doubleQoutient = " + doubleQuotient + "\t " + pipe);
        System.out.println(pipe + "\t\t\t\t" + "floatRemainder = " + floatRemainder + "\t\t\t\t\t" + pipe + pipe
                + "\t\t\t\t " + "doubleRemainder = " + doubleRemainder + "\t\t\t\t\t " + pipe);
        System.out.println(line1 + line1 + "\n");
    }

    public static void countRadixShort(short val) {
        short lenght = (short) String.valueOf(val).length();
        if (lenght == 1) {
            System.out.println("It’s a one digit number.");
        } else if (lenght == 2) {
            System.out.println("It’s a two-digit number.");
        } else if (lenght == 3) {
            System.out.println("It’s a three-digit number.");
        } else if (lenght == 4) {
            System.out.println("It’s a four-digit number.");
        } else if (lenght == 5) {
            System.out.println("It’s a five-digit number.");
        }
    }

    public static void main(String[] args) {
        //Part 1

        //Task 3
        /*
        Записать в виде кода следующие логические выражения:
	    1) (2 = 2) И (7 = 7);
        2) Не(15 < 3);
        3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        4) Не("Сосна" = "Дуб");
        5) (Не(15 < 3)) И (10 > 20);
        6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        7) (6/2 = 3) ИЛИ (7*5 = 20)
         */
        printTaskNumber();

        System.out.println("1) (2 == 2) || (7 == 7)");
        System.out.println("2) !(15 < 3)");
        System.out.println("3) ('Sosna' == 'Dub') || ('Cherry' == 'Klen')");
        System.out.println("4) !('Sosna' == 'Dub')");
        System.out.println("5) (!(15 < 3)) && (10 > 20");
        System.out.println("6) (Глаза даны, чтобы видеть) && (Под третьим этажом находится второй этаж)");
        System.out.println("7) (6/2 = 3) && (7*5 = 20)\n");

        /*
        Task 4
        Записать в виде кода следующие выражения:
        а) Света младше Андрея и Наташи
        б) На полке стоят учебники, а на столе лежат справочники.
        в) БОльшая часть детей — девочки. Остальные - мальчики.
         */
        printTaskNumber();

        System.out.println("Natali > Sveta < Andrew");
        System.out.println("На полке стоят учебники || а на столе лежат справочники.");
        System.out.println("БОльшая часть детей — девочки. || Остальные - мальчики.\n");

        /*
        Task 5
        Записать в виде кода следующие выражения:
        “Водительские права можно получить, только когда исполнится 16 лет.”
         */
        printTaskNumber();

        System.out.println("IF age >= 16 {"
                + " Receive Driver License }\n");

        /*
        Task 6
        Записать в виде кода следующие выражения:
        ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
         */
        printTaskNumber();
        System.out.println("IF Petia != rideBus {"
                + "read book" + " && " + "watch to the window}\n");

        /*
        Task 7
        Записать выражения в виде условий if-else:
        “Если с другом ты, это хорошо, а когда наоборот - плохо”
         */
        printTaskNumber();
        boolean haveFriend = true;
        if (haveFriend == true) {
            System.out.println("You have a friend! Good!");
        } else {
            System.out.println("You have not a friend. Sad.");
        }
        System.out.println('\n');
        /*
        Task 8
        Записать выражения в виде условий if-else:
        Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
        Если x больше 10, то вывести на печать “x больше 10”.
        Если x меньше нуля, то вывести на печать “x - отрицательное число”
        Если x = 5, то вывести на печать “Разность x и 5 равна 0”
        Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
        Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.
         */
        printTaskNumber();
        int x = 5;
        if (x > 10) {
            System.out.println("x is bigger than 10");
        } else if (x < 0) {
            System.out.println("x is negative number");
        } else if (x == 5) {
            System.out.println("Difference x and 5 is equal 0");
        } else {
            System.out.println("Number x is smaller then 11, bigger or equal 0, but not equal 5");
        }
        System.out.println('\n');

        /*
        Task 9
        Записать выражения в виде условий if-else:
        Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        Выведите результат работы алгоритма на печать.Найдите в презентации,
        какой блок схеме соответствует ваш алгоритм.
         */
        printTaskNumber();

        int task8 = 3;
        if (task8 % 2 == 0) {
            task8 = task8 * 2;
            System.out.println("Result of multiply on 2 = " + task8);
        } else {
            task8 = task8 * task8;
            System.out.println("Square number = " + task8);
        }
        System.out.println('\n');

        /*
        Task 10
        Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        Голосовать можно с 18 лет
        Машину можно водить с 16 лет
        В школу можно идти с 5 лет
        Выведите результат работы алгоритма на печать.
         */
        printTaskNumber();
        int ageTask10 = 14;
        if (ageTask10 >= 0 && ageTask10 <= 150) {
            if (ageTask10 >= 18) {
                System.out.println("Can Vote");
            } else if (ageTask10 >= 16) {
                System.out.println("Can drive the Car");
            } else if (ageTask10 >= 5) {
                System.out.println("Can go to QA School and Learn JAVA");
            } else {
                System.out.println("Relax");
            }
            System.out.println('\n');
        } else {
            System.out.println("Not valid age");
        }
        /*
        Task 11
        Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        5 - выдать похвальную грамоту и перевести в следующий класс
        4 - перевести в следующий класс
        3 - дать задание на лето и перевести в следующий класс
        2 - вызвать родителей и оставить в текущем классе на второй год
        Выведите результат работы алгоритма на печать.
         */
        printTaskNumber();
        int grade = 5;
        if (grade >= 2 || grade < 6) {
            if (grade == 5) {
                System.out.println("Issue a certificate of merit and transfer to the next class");
            } else if (grade == 4) {
                System.out.println("Transfer to the next class");
            } else if (grade == 3) {
                System.out.println("Give a task for the summer and transfer to the next class");
            } else if (grade == 2) {
                System.out.println("Call parents and leave in the current class for the second year");
            }
        } else {
            System.out.println("Not valid age");
        }
        System.out.println();
        //PART 2
        /*
        Task 12
        Напишите метод, который примет на вход температуру в Цельсиях,
         и распечатает результат температуры в Цельсиях и в Фаренгейтах.
         */
        printTaskNumber();
        converterCelsFaren(25);
        System.out.println();
        /*
        Task 13
        Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа,
        которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
        ПРограмма выводит на печать результат вычислений.Программа умножает числа, которые делятся на 2 без остатка,
        но если хотя бы одно число отрицательное, программа умножает результат действия на (-1).
        ПРограмма выводит на печать результат вычислений. Если числа не прошли ни одну проверку,
        программа выводит на печать ошибку о невозможности произвести действия.
         */
        printTaskNumber();
        int firstNum = 15;
        int secondNum = 30;
        int sum = 0;
        if (firstNum % 3 == 0 && secondNum % 3 == 0 || firstNum % 5 == 0 && secondNum % 5 == 0 ||
                firstNum % 2 == 0 && secondNum % 2 == 0) {
            if (firstNum % 3 == 0 && secondNum % 3 == 0) {
                sum = firstNum + secondNum;
                System.out.println("Sum of first value and second value = " + sum);
            }
            if (firstNum % 5 == 0 && secondNum % 5 == 0) {
                sum = firstNum - secondNum;
                System.out.println("Subraction of first value and second value = " + sum);
            }
            if (firstNum % 2 == 0 && secondNum % 2 == 0) {
                sum = firstNum * secondNum;
                System.out.println("Multiply of first value and second value = " + sum);
            } else if (firstNum < 0 || secondNum < 0) {
                    sum = (firstNum * secondNum) * -1;
                    System.out.println("One of the value is -1 then Multiply on -1 = " + sum);
                }
        } else {
            System.out.println("Impossible to calculate");
        }
        System.out.println();
        /*
        Task 14
        Распечатать следующие выражения, используя метод и параметры k, l, m:
        Результат деления k на l = …, а остаток от деления  = …
        Результат деления k на m = …, а остаток от деления  = …
        Результат деления l на m = …, а остаток от деления  = …
        Результат деления m на k = …, а остаток от деления  = …
         */
        printTaskNumber();
        executeSomeCalc(100, 30, 88);
        System.out.println();
        /*
        PART 3
        Task 15
        Решить задачу
        В клетке находятся фазаны и кролики. Известно, что у них 35 голов и 94 ноги.
         Узнайте число фазанов и число кроликов.
        Проверить работу вашего алгоритма тестом.

        Х фазанов, у них 2 ноги
         (35-х) кроликов, у них 4 ноги
        2х + 4(35-х)=94
        Х+70-2х=47
        Х=23 фазана
        35-23=12 кроликов
        Фазанов больше на 23-12=11
        Ответ: на 11 фазанов больше
         */
        printTaskNumber();
        int rabbits, fazans;
        int headsTotal = 35;
        int legsTotal = 94;
        int twoLegs = headsTotal * 2; //two legsTotal for everyone
        int rabbitsLegs = legsTotal - twoLegs; //half of rabbits legsTotal
        rabbits = rabbitsLegs / 2;
        fazans = headsTotal - rabbits;
        System.out.println("Rabbits = " + rabbits + " Fazans = " + fazans);
        System.out.println("\nUnit Test");
        //Test
        int expectedRabbits = 12;
        int expectedFazans = 23;
        int actualRabbits = rabbits;
        int actualFazans = fazans;

        if (actualRabbits == expectedRabbits && actualFazans == expectedFazans) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println();
        /*
        Task 16
        Написать метод, который рассчитывает среднюю скорость движения (speedAverage) транспортного средства или
        живого существа с разными параметрами distance и  time.
        Протестировать метод.
        Тестовые данные:
        distance		time
        12			    20 min
        150		        2,5 hours
        300		        1¾ hours
         */
        printTaskNumber();
        calcAverageSpeed(12, 0.33F);
        calcAverageSpeed(150, 2.5F);
        calcAverageSpeed(300, 1.45F);
        System.out.println();
        /*
        Task 17
        Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:
        Написать метод так, чтобы правильные склонения слов (н-р, яблок, яблоко или яблока; ученики - учеников…)
        печатались автоматически в зависимости от значений параметров.
        Распечатать выражение с параметрами:
        apple = 42, 55, 1
        student = 42, 5, 2
         */
        printTaskNumber();
        calcApples(-5, 42);
        calcApples(55, 5);
        calcApples(1, 2);
        System.out.println();
        /*
        Task 18
        Распечатать таблицу из HW3,  задание 11 с помощью методов и параметров
        (значения f, ff, d, dd могут быть любыми). Обратите внимание на то,
         что левая часть таблицы у вас почти такая же, как правая часть таблицы.
         */
        printTaskNumber();
        printTable(1001001, 6732732, 100101101, 447836F);
        System.out.println();
        /*
        Task 19
        Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
        и выводит результат проверки.
        ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
        Выведите результат проверки на печать.
         */
        printTaskNumber();
        countRadixShort((short) 4);
        countRadixShort((short) 14);
        countRadixShort((short) 543);
        countRadixShort((short) 5443);
        countRadixShort((short) 30196);
        System.out.println();
        /*
        Task 20
        На сайте https://openweathermap.org/ зарегистрироваться и получить ключ (key).
        Найти в документации пример запроса с параметрами “Название города” (а не с географическими координатами).
        Сформировать и отправить запрос на сервер (manually).
        В полученном ответе найти географические координаты для следующих городов
        London
        Paris
         */
        printTaskNumber();
        //LONDON
//        https://api.openweathermap.org/data/2.5/weather?appid=816dd17796ecade8610a7daa44a4e634&q=London
//        {
//            "coord": {
//            "lon": -0.1257,
//                    "lat": 51.5085
//        },
        float londonLon = -0.1257F;
        float londonLat = 51.5085F;
        System.out.println("London coordinates is lon = " + londonLon + ", lat = " + londonLat);
        //PARIS
//        https://api.openweathermap.org/data/2.5/weather?appid=816dd17796ecade8610a7daa44a4e634&q=Paris
//        {
//            "coord": {
//            "lon": 2.3488,
//                    "lat": 48.8534
//        },
        float parisLon = 2.3488F;
        float parisLat = 48.8534F;
        System.out.println("Paris coordinates is lon = " + parisLon + ", lat = " + parisLat);

    }
}
