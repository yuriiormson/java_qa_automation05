package school;

public class Teacher extends Person {
    public static void main(String[] args) {

//        Teacher teacher1 = new Teacher() ;

        System.out.println();
        int ageOfMath = 55;
        String firstNameOfMath = "Ivan";
        String middleNameOfMath = "Petrovich";
        String lastNameOfMath = "Serebriakov";
        String subjectOfMath = "Math";
        System.out.println(
                "* * * * * * * * * * * * * * * * * * * * *\n" +
                "* First name: \t\t\t"
                        + firstNameOfMath
                        + " \t\t\t*\n"
                        + "* Middle name: \t\t\t"
                        + middleNameOfMath
                        + " \t\t*\n"
                        + "* Last name: \t\t\t"
                        + lastNameOfMath
                        + "\t\t*\n"
                        + "* Age: \t\t\t\t\t"
                        + ageOfMath
                        + " y.o. \t\t*\n"
                        + "* Subject: \t\t\t\t"
                        + subjectOfMath
                        + "\t\t\t*\n"
                        + "* * * * * * * * * * * * * * * * * * * * *"

        );
    }
}

//        System.out.println("First name: Maria, " +
//                "Middle name: Ivanova, " +
//                "Last name: Petrova");

//        System.out.println("First name: Maria, ");
//        System.out.println("Middle name: Ivanova, ");
//        System.out.println("Last name: Petrova");
//        System.out.println();
//        int age = 35;
//        String firstName = "Maria";
//        String middleName = "Ivanova";
//        String lastName = "Petrova";
//        String subject = "Russian Literature";
//        System.out.println(
//                        "First name: \t"
//                                + firstName
//                                + ", \n"
//                                + "Middle name: \t"
//                                + middleName
//                                + ", \n"
//                                + "Last name: \t\t"
//                                + lastName
//                                + "\n"
//                                + "Age: \t\t\t"
//                                + age + " y.o. \n"
//                                + "Subject: \t\t"
//                                + subject
//
//        );