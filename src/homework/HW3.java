package homework;

public class HW3 {
    public static void main(String[] args) {
        //Part 1
        Integer taskNumber = new Integer(2);
        String taskName = "Task";
        Character taskLetter = new Character('a');

        System.out.println(taskName + ". " + taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        //Task 2
        //Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
        byte a = 127;
        byte b = -128;

        System.out.println("Max value of byte type = " + b);
        System.out.println("Min value of byte type = " + a + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        //Task 3
        // Создать переменные s и t типа short, присвоить им значения с разницей 60000.
        short s = 32767;
        short t = -27233;

        System.out.println("Variable s = " + s + " and Variable t " + t + " with difference in "
                + Short.compare(s,t) + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 4
        Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:
            int min       значение i
            int max       значение i
         */
        int min = -2147483648;
        int max = 2147483647;
        char pipe = '|';
        String line = "+-------------------+-----------------------+";

        System.out.println(line);
        System.out.println(pipe + "\t\t" + "int min" + "\t\t" + pipe + "\t\t" + min + "\t\t" + pipe);
        System.out.println(line);
        System.out.println(pipe + "\t\t" + "int max" + "\t\t" + pipe + "\t\t" + max + "\t\t" + pipe);
        System.out.println(line + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 5
        Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
         (можно ненастоящий номер телефона, например, 18009998877)
         */
        long phoneNumber = 380673337711L;

        System.out.println("Phone number is use long data type = " + phoneNumber + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 6
        Создать переменную f типа float и присвоить ей значение 100.101101.
        Создать переменную d типа double и присвоить ей значение 100.101101.
        Распечатать результат в виде таблицы:
        float f = 100.101101            значение f
        double d = 100.101101           значение d
         */
        float f = 100101101F;
        double d = 100101101;
        String line1 = "+---------------------------+---------------------------+";
        System.out.println(line1);
        System.out.println(pipe + "\t" + "float f = 100.101101" + "\t" + pipe + "\t\t" + f + "\t\t" + pipe);
        System.out.println(line1);
        System.out.println(pipe + "\t" + "double d = 100.101101" + "\t" + pipe + "\t\t" + d + "\t\t" + pipe);
        System.out.println(line1 + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 7
        a) Создать переменную типа Double с именем dd
        и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        b) Создать переменную типа Float с именем ff
        и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        Распечатать результаты.
         */
        Double dd = new Double(1009999 + 20099999);
        Float ff = new Float(1009999 + 20099999F);

        System.out.println("Double dd = " + dd);
        System.out.println("Float ff = " + ff + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 8
        Создать переменную float ff и присвоить ей значение выражения 10 / 3.
        Создать переменную double dd и присвоить ей значение выражения 10 / 3.
        Добиться максимальной точности значений вычислений и распечатать результаты.
         */
        ff = Float.valueOf(10 / 3);
        dd = Double.valueOf(10 / 3);

        System.out.println("New value of the variable float ff = " + ff);
        System.out.println("New value ot the variable double dd = " + dd + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 9
        Создать переменные типа Float:
        floatSum
        floatSub (substraction)
        floatProduct
        floatQuotient
        floatRemainder
        и  присвоить им значения, вычисленные с помощью переменных f и ff.
         */
        Float floatSum = new Float(f + ff);
        Float floatSub = new Float(f - ff);
        Float floatProduct = new Float(f * ff);
        Float floatQuotient = new Float(f / ff);
        Float floatRemainder = new Float (f % ff);

        System.out.println("floatSum = " + floatSum);
        System.out.println("floatSub = " + floatSub);
        System.out.println("floatProduct = " + floatProduct);
        System.out.println("floatQuotient =" + floatQuotient);
        System.out.println("floatRemainder = " + floatRemainder + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 10
        Создать переменные типа double:
        doubleSum
        doubleSub
        doubleProduct
        doubleQuotient
        doubleRemainder
        и  присвоить им значения, вычисленные с помощью переменных d и dd.
         */
        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;

        System.out.println("doubleSum = " + doubleSum);
        System.out.println("doubleSub = " + doubleSub);
        System.out.println("doubleProduct = " + doubleProduct);
        System.out.println("doubleQuotient = " + doubleQuotient);
        System.out.println("doubleRemainder = " + doubleRemainder + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        //Task 11
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
        System.out.println(line1 + line1 +  "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 12
        Распечатать слова HELLO JAVA точками (чтобы получился рисунок точками)
         */
        String quadroDot = "::";
        String quadroFourDot = "::::";
        String quadroSixDot = "::::::";
        String oneBackspace = " ";
        String twoBackspace = "  ";
        String threeBackspace = "   ";
        String fourBackspace = "    ";
        String fifthSpaces = "     ";
        String sevenBackspace = "       ";
        String eightBackspace = "        ";
        //First line
        System.out.println(quadroDot + twoBackspace + quadroDot + oneBackspace + quadroSixDot + oneBackspace + quadroDot
        + fifthSpaces + quadroDot + sevenBackspace + quadroDot + eightBackspace + quadroFourDot + threeBackspace
        + quadroDot + threeBackspace + quadroDot + twoBackspace + quadroDot + fourBackspace + quadroDot);
        //Second line
        System.out.println(quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot + fifthSpaces + quadroDot
        + fifthSpaces + quadroDot + fifthSpaces + quadroDot + twoBackspace + quadroDot + eightBackspace + quadroDot
        + oneBackspace + quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot + twoBackspace + quadroDot
        + twoBackspace + quadroDot + twoBackspace + quadroDot);
        //Third line
        System.out.println(quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot + fifthSpaces + quadroDot
        + fifthSpaces + quadroDot + fifthSpaces + quadroDot + twoBackspace + quadroDot + eightBackspace + quadroDot
        + oneBackspace + quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot + twoBackspace + quadroDot
        + twoBackspace + quadroDot + twoBackspace + quadroDot);
        //Fourth line
        System.out.println(quadroSixDot + oneBackspace + quadroSixDot + oneBackspace + quadroDot
        + fifthSpaces + quadroDot + fifthSpaces + quadroDot + twoBackspace + quadroDot + eightBackspace + quadroDot
        + oneBackspace + quadroSixDot + oneBackspace + quadroDot + twoBackspace + quadroDot + twoBackspace
        + quadroSixDot);
        //Fifth line
        System.out.println(quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot + fifthSpaces + quadroDot
        + fifthSpaces + quadroDot + fifthSpaces + quadroDot + twoBackspace + quadroDot + eightBackspace + quadroDot
        + oneBackspace + quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot + twoBackspace + quadroDot
        + twoBackspace + quadroDot + twoBackspace + quadroDot);
        //Sixth line
        System.out.println(quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot + fifthSpaces + quadroDot
        + fifthSpaces + quadroDot + fifthSpaces + quadroDot + twoBackspace + quadroDot + fourBackspace + quadroDot
        + twoBackspace + quadroDot + oneBackspace + quadroDot + twoBackspace + quadroDot + oneBackspace + quadroDot
        + twoBackspace + quadroDot + twoBackspace + quadroDot + twoBackspace + quadroDot);
        //Seventh line
        System.out.println(quadroDot + twoBackspace + quadroDot + oneBackspace + quadroSixDot + oneBackspace
                + quadroSixDot + oneBackspace + quadroSixDot + threeBackspace + quadroDot + eightBackspace + quadroDot
        + threeBackspace + quadroDot + twoBackspace + quadroDot + threeBackspace + quadroDot + fourBackspace
        + quadroDot + twoBackspace + quadroDot + "\n");

        // PART 3
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 13
        Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
        t1 = 0;
        t2 = 150;
        t3 = -120;
        t4 = - 505.505;
        t5 = 100100;
        t6 = 100010001000;
        t7 = 2.66666666666666;
        t8 = - 1000000.001;
        t9 = 1010;
        Распечатать значения всех переменных.
         */
        Byte t1 = new Byte(t1 = 0);
        Short t2 = new Short(t2 = 150);
        Byte t3 = new Byte(t3 = -120);
        Float t4 = new Float(-505.505);
        Integer t5 = new Integer(100100);
        Long t6 = new Long(100010001000L);
        Float t7 = new Float(2.66666666666666);
        Float t8 = new Float(-1000000.001);
        Short t9 = new Short(t9 = 1010);

        System.out.println("t1 is Byte = " + t1);
        System.out.println("t2 is Short = " + t2);
        System.out.println("t3 is Byte = " + t3);
        System.out.println("t4 is Float = " + t4);
        System.out.println("t5 is Integer = " + t5);
        System.out.println("t6 is Long = " + t6);
        System.out.println("t7 is Float = " + t7);
        System.out.println("t8 is Float = " + t8);
        System.out.println("t9 is Short = " + t9 + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 14
        С помощью полей классов ссылочного типа распечатать таблицу:
        Type    Size in bits    min     max
        byte       8           -128    127
        short
        int
        long
        float
        double
         */
        String lineStart = "+-----------------------+";
        String lineEnd = "-----------------------+";

        System.out.println(lineStart + lineEnd + lineEnd + lineEnd);
        System.out.println(pipe + "\t\t\t" + "Type" + "\t\t" + pipe + "\t\t" + "Size in bits" + "\t" + pipe
        + "\t\t\t" +  "min" + "\t\t\t" + pipe + "\t\t\t" + "max" + "\t\t\t" + pipe );
        System.out.println(lineStart + lineEnd + lineEnd + lineEnd);
        System.out.println(pipe + "\t\t\t" + "byte" + "\t\t" + pipe + "\t\t\t" + Byte.SIZE + "\t\t\t" + pipe
        + "  " + Byte.MIN_VALUE + "\t\t\t\t\t" + pipe + " " + Byte.MAX_VALUE + "\t\t\t\t\t" + pipe );
        System.out.println(lineStart + lineEnd + lineEnd + lineEnd);
        System.out.println(pipe + "\t\t\t" + "short" + "\t\t" + pipe + "\t\t\t" + Short.SIZE + "\t\t\t" + pipe
                + "  " + Short.MIN_VALUE + "\t\t\t\t" + pipe + " " + Short.MAX_VALUE + "\t\t\t\t\t" + pipe );
        System.out.println(lineStart + lineEnd + lineEnd + lineEnd);
        System.out.println(pipe + "\t\t\t" + "int" + "\t\t\t" + pipe + "\t\t\t" + Integer.SIZE + "\t\t\t" + pipe
                + "  " + Integer.MIN_VALUE + "\t\t\t" + pipe + " " + Integer.MAX_VALUE + "\t\t\t" + pipe );
        System.out.println(lineStart + lineEnd + lineEnd + lineEnd);
        System.out.println(pipe + "\t\t\t" + "long" + "\t\t" + pipe + "\t\t\t" + Long.SIZE + "\t\t\t" + pipe
                + "  " + Long.MIN_VALUE + " " + pipe + " " + Long.MAX_VALUE + "   " + pipe );
        System.out.println(lineStart + lineEnd + lineEnd + lineEnd);
        System.out.println(pipe + "\t\t\t" + "float" + "\t\t" + pipe + "\t\t\t" + Float.SIZE + "\t\t\t" + pipe
                + "  " + Float.MIN_VALUE + "\t\t\t\t" + pipe + " " + Float.MAX_VALUE + "\t\t\t" + pipe );
        System.out.println(lineStart + lineEnd + lineEnd + lineEnd);
        System.out.println(pipe + "\t\t\t" + "double" + "\t\t" + pipe + "\t\t\t" + Double.SIZE + "\t\t\t" + pipe
                + "  " + Double.MIN_VALUE + "\t\t\t\t" + pipe + " " + Double.MAX_VALUE  + pipe );
        System.out.println(lineStart + lineEnd + lineEnd + lineEnd + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 15
        Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
        сравнить 2 переменные друг с другом с помощью метода .equals().
        Вывести результат сравнения на печать в виде выражения:
        “Если num1 равно  num2, то результат сравнения методом .equals() = …”

        Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */
        Integer num1 = new Integer(11);
        Integer num2 = new Integer(11);

        System.out.println("If num1 is equal to num2, then the result of comparison by the .equals() method = "
        + num1.equals(num2));

        num2 = 12;

        System.out.println("If num1 is not equal to num2, then the result of the comparison by the .equal = "
        + num1.equals(num2) + "\n");

        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 16
        Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        а) одинаковыми значениями
        b) number1 < number2
        c) number1 > number2
        сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет - не equals() !),
        и вывести результаты сравнения на печать в виде выражений:
        “Если number1 = number2, то результат сравнения методом … = …”
        “Если number1 < number2, то результат сравнения методом … = …”
        “Если number1 > number2, то результат сравнения методом … = …”
         */
        Integer number1 = new Integer(3);
        Integer number2 = new Integer(3);

        System.out.println("If number1 = number2, then the result of the comparison by the method compareTo = "
        + number1.compareTo(number2));

        number1 = 2;
        number2 = 3;

        System.out.println("If number1 < number2, then the result of the comparison by the method compareTo = "
                + number1.compareTo(number2));

        number1 = 3;
        number2 = 2;

        System.out.println("If number1 > number2, then the result of the comparison by the method compareTo = "
                + number1.compareTo(number2) + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 17
        Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int
         */
        Float task17 = new Float(234.9999F);
        System.out.println("Casting Float to int with .intValue() method = " + task17.intValue() + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 18
        С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */
        double forSumOne = 23.21;
        double forSumTwo = 56.17;

        System.out.println("Sum of two double values will be calculated with method sum() = "
                + Double.sum(forSumOne,forSumTwo) + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 19
        С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
         */
        System.out.println("Calculation of two Float values with method sum() class Integer = "
                + Integer.sum(t7.intValue(),t8.intValue()) + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 20
        Создать 2 переменные типа Short:
        short1 = 12000
        short2 = 12300
        Распечатать фразу:
        “12000 - 12300 = -300”
        где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
        Присвоить переменной short1 значение 12500, вывести фразу:
        “12500 - 12300 = 200”
        где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */
        Short short1 = new Short(short1 = 12000);
        Short short2 = new Short(short2 = 12300);

        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));

        short1 = 12500;

        System.out.println("12500 - 12300 = " + Short.compare(short1, short2) + "\n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 21
        Создать переменные:
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Распечатать результат doub1 - doub2
        Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
        Сравнить полученные результаты doub1 - doub2 и str1 - str2
         */
        String str1 = new String("123.56");
        String str2 = new String("123.55");
        Double doub1 = new Double(123.56);
        Double doub2 = new Double(123.55);
        Double substractDoub = doub1 - doub2;
        Double str1Doub = Double.valueOf(str1) - Double.valueOf(str2);
        System.out.println("123.56 - 123.55 = " + substractDoub);
        System.out.println("'123.56' - '123.55' = " + str1Doub);
        System.out.println("Difference between Double and String = " + substractDoub.compareTo(str1Doub));
        System.out.println();
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 22
        Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
        (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение,
        затем минимальное значение. Посчитать и распечатать среднее значение.
        Распечатать результат среднего значения температуры тела кота.
         */
        Float cat = new Float(40.0);
        Float catMaxTemp = cat;
        cat = 30.0F;
        Float catMinTemp = cat;
        System.out.println("Average value " + (catMaxTemp - catMinTemp) / 2);

        cat = 37.7F;

        System.out.println("Average temperature of cat is = " + cat + " C" + "\n");

        //PART 3

        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Создать переменную n типа Number, присвоить ей максимально возможное значение.
        Присвоить n значение 10,
        затем присвоить n значение 10.999999999

        Распечатать результаты в виде выражения:
        “Переменная n может принимать значения:
        n =  …
        n =  …
        n =  …
        Это возможно, потому что …”
         */
        Number n = Double.MAX_VALUE;

        System.out.println("Variable n type Number can have value = " + n);
        n = 10;
        System.out.println("Variable n type Number can have value = " + n);
        n = 10.999999999;
        System.out.println("Variable n type Number can have value = " + n);
        System.out.println("It is posible because: The abstract class Number is the superclass of" +
                " platform classes representing numeric values that are convertible to the primitive" +
                " types byte, double, float, int, long, and short.\n The specific semantics of the conversion" +
                " from the numeric value of a particular Number implementation to a given primitive type" +
                " is defined by the Number implementation in question.\n For platform classes, the conversion" +
                " is often analogous to a narrowing primitive conversion or a widening primitive conversion" +
                " as defining in The Java™ Language Specification for converting between primitive types.\n" +
                " Therefore, conversions may lose information about the overall magnitude of a numeric value," +
                " may lose precision, and may even return a result of a different sign than the input." +
                " See the documentation of a given Number implementation for conversion details. \n");
        System.out.println(taskName + ". " + ++taskNumber);
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # #");
        /*
        Task 24
        Создать переменную Integer numberInteger = 100.
        Доказать, что numberInteger имеет тип Integer,
        а numberInteger.toString() имеет тип String.
         */
        Integer numberInteger = new Integer(100);

        System.out.println("numberInteger has type = " + numberInteger.getClass());

        Object toString = numberInteger.toString(numberInteger);

        System.out.println("numberInteger has type = " + toString.getClass());

    }

}
