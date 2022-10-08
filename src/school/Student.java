package school;

public class Student extends Person {
    public static void main(String[] args) {
        int ageOfStudent1 = 10;
        String firstNameOfStudent1 = "Vova";
        String lastNameOfStudent1 = "Sidorov";
        String subjectOfStudent1 = "5-class";
        System.out.println(
                "* * * * * * * * * * * * * * * * * * * * *\n" +
                        "* First name: \t\t\t"
                        + firstNameOfStudent1
                        + " \t\t\t*\n"
                        + "* Last name: \t\t\t"
                        + lastNameOfStudent1
                        + "\t\t\t*\n"
                        + "* Age: \t\t\t\t\t"
                        + ageOfStudent1
                        + " y.o. \t\t*\n"
                        + "* Class: \t\t\t\t"
                        + subjectOfStudent1
                        + "\t\t\t*\n"
                        + "* * * * * * * * * * * * * * * * * * * * *"

        );
        int ageOfMath = 14;
        String firstNameOfStudent2 = "Masha";
        String lastNameOfStudent2 = "Semenova";
        String subjectOfStudent2 = "9-class";
        System.out.println(
                "* * * * * * * * * * * * * * * * * * * * *\n" +
                        "* First name: \t\t\t"
                        + firstNameOfStudent2
                        + " \t\t\t*\n"
                        + "* Last name: \t\t\t"
                        + lastNameOfStudent2
                        + "\t\t*\n"
                        + "* Age: \t\t\t\t\t"
                        + ageOfMath
                        + " y.o. \t\t*\n"
                        + "* Class: \t\t\t\t"
                        + subjectOfStudent2
                        + "\t\t\t*\n"
                        + "* * * * * * * * * * * * * * * * * * * * *"

        );
    }
}
