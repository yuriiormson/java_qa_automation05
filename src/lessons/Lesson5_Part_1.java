package lessons;

public class Lesson5_Part_1 {
    //    Распечатать следующие выражения, используя метод и параметры k, l, m:
//    Результат деления k на l = …, а остаток от деления  = …
//    Результат деления k на m = …, а остаток от деления  = …
//    Результат деления l на m = …, а остаток от деления  = …
//    Результат деления m на k = …, а остаток от деления  = …

    public static void printKLMActions(int parameter1, int parameter2,  String varName1, String varName2) {
        int quotient = parameter1 / parameter2;
        int remainder = parameter1 % parameter2;

        String result = "Результат деления " + varName1 + " на " + varName2 + " = " + quotient
                + ", а остаток от деления  = " + remainder;
    }

    public static String returnKLMActions(int parameter1, int parameter2,  String varName1, String varName2) {
        int quotient = parameter1 / parameter2;
        int remainder = parameter1 % parameter2;

        String result = "Результат деления " + varName1 + " на " + varName2 + " = " + quotient
                + ", а остаток от деления  = " + remainder;

        return result;
    }

    public static int doubleTheValue (int a) {
        int result = a * 2;

        return result;
    }

    public static int tripleTheValue (int a) {
        int result = a * 3;

        return result;
    }


    public static int countAveSpeed(double distance, double time) {
        int result = (int) (distance / time);

        return result;
    }

    public static void main(String[] args) {
        int k = 20;
        int l = 10;
        int m = 5;

        printKLMActions(k, l, "k", "l");
        printKLMActions(k, m, "k", "m");
        printKLMActions(l, m, "l", "m");

        //System.out.println(printKLMActions(k, l, "k", "l")); -- Нельзя распечатать результат void
        System.out.println(returnKLMActions(k, l, "k", "l"));

        String text = returnKLMActions(k, l, "k", "l") + returnKLMActions(k, m, "k", "m");

        System.out.println(doubleTheValue(6));

        int b = doubleTheValue(6);
        System.out.println(b);

        System.out.println(tripleTheValue(5));

        int sum = doubleTheValue(6) + tripleTheValue(5);

        System.out.println(sum);

        System.out.println(text);

        System.out.println("text" + 6);

        String text1 = returnKLMActions(k, l, "k", "l") + doubleTheValue(6);
        System.out.println(text1);


        //Это не будет работать, тк метод printKLMActions - void
//        System.out.println(printKLMActions(k, l, "k", "l"));
//        String text2 = printKLMActions(k, l, "k", "l");

        int total = countAveSpeed(200.45, 1.5) + countAveSpeed(12.5, 2.75);
        System.out.println(total);
    }

}
