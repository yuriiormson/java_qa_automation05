package school;

public class Person {
    public static void main(String[] args) {
    int yob = 1989;
        System.out.println("If man born in " + yob + " year, then his age is a difference between 2022 and " + yob );
        int twoYearsAgo = 2020;
        int age = twoYearsAgo - yob;
        System.out.println("If man born in " + yob + " year, then his age was "
                + age + " two years ago and it is a difference between 2020 and " + yob);
    }
}
