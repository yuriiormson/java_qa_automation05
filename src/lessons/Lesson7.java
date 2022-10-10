package lessons;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {

        //объект типа String catName со значением "Рыжик"
        String catName = new String("Рыжик");

        //Распечатать объект типа String со значением "Рыжик"
        System.out.println(catName);


        //Резервирование ячейки памяти типа String-массив (catsNames),
        // в которой будет содержаться ссылка на массив
        String[] catsNames;

        // System.out.println(catsNames);


        //Создание объекта типа String-массив (catsNames),  состоящий из 8 ячеек

        catsNames = new String[8];

        //Распечатать массив catsNames
        System.out.println(catsNames);

        //Распечатать массив catsNames с помощью класса Arrays
        System.out.println(Arrays.toString(catsNames));

        //объект типа int-массив (catsAges),  состоящий из 8 ячеек
        int[] catsAges = new int[8];
        Integer[] catsAges1 = new Integer[8];

        //Распечатать массив catsAges
        System.out.println(catsAges);
        System.out.println(catsAges1);


        // Распечатать массив catsAges с помощью класса Arrays
        System.out.println(Arrays.toString(catsAges));
        System.out.println(Arrays.toString(catsAges1));


        //Заполнить массив catsNames значениями
        catsNames = new String[]{"Дымка", "Черныш", "Кокос", "Васька", "Рыжик", "Снежок", "Братиш", "Матроскин"};


        //Распечатать массив catsNames
        System.out.println(Arrays.toString(catsNames));

        //Заполнить массив catsAges значениями
        catsAges[0] = 2;
        catsAges[1] = 3;
        catsAges[2] = 16;
        catsAges[3] = 3;
        catsAges[4] = 1;
        catsAges[5] = 5;
        catsAges[6] = 10;
        catsAges[7] = 0;


        //Распечатать массив catsAges
        System.out.println(Arrays.toString(catsAges));

        // Распечатать значения, лежащие в ячейках 0, 7 массива catsNames
        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);
        System.out.println(catsNames[7] + ", " + catsNames[0]);
//        System.out.println(catsNames[7], catsNames[0]);
//        System.out.println(5, 7);

        // Распечатать значение, лежащее в ячейках 2, 4 массива catsAges
        System.out.println(catsAges[2] + " " + catsAges[4]);


        //Распечатать значения массива catsNames циклом for
        for(int i = 0; i <= 7; i ++) {
            System.out.print(catsNames[i] + " ");
        }

        System.out.println();
        System.out.println(catsNames.length);
        System.out.println(catsAges.length);


        for(int i = 0; i < catsNames.length; i ++) {
            System.out.print(catsNames[i] + " ");
        }

        System.out.println();
        //System.out.println(catsNames[8]);


        //Распечатать "Погладь кота!", если имя кота == "Рыжик"
        for (int i = 0; i < catsNames.length; i++) {
            if(catsNames[i].equals("Рыжик")) {
                System.out.println("Погладь кота!");
                break;
            }
        }


        //Распечатать "Погладь кота!" для кота в коробке с номером 4
        for (int i = 4; i < catsNames.length - 3; i++) {
            System.out.println("Погладь кота!");
        }



        //Распечатать номер коробки/ячейки массива catsNames, в которой сидит кот Рыжик
        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Рыжик")) {
                System.out.println(i);
            }
        }

        //Сколько всего Рыжиков в массиве
        int counter = 0;
        for (int i = 0; i < catsNames.length; i++) {
            if (!catsNames[i].equals("Рыжик")) {//!=
                continue;
            }
            counter++;
        }

        System.out.println(counter);


    }

}
