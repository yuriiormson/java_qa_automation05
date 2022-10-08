package lessons;

public class Lessons3 {
    public static void main(String[] args) {

        Object obj = new Object();

        Integer i = new Integer(8);
        Integer i1 = 8;
//        Integer i2 = new Integer("a");
        Integer i3 = new Integer("12");
//        Integer sum = i2 + i1;
        Integer sum1 = i + i3;

        System.out.println(sum1);

        Object i5 = new Integer(5);

        System.out.println(i1.MAX_VALUE);
        System.out.println(i1.MIN_VALUE);
        System.out.println(i1.compareTo(i3));
        System.out.println(Integer.bitCount(i3));
        System.out.println(Integer.compare(i1,i3));
        System.out.println(Integer.max(i3,i1));
        System.out.println(Integer.min(i3,i1));

    }
}
