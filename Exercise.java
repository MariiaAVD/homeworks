public class Exercise {
    public static void main(String[] args) {

        long start=10, end=25;
        long between = start < end ? end - start : -1;
        System.out.println(between);

        int ab = 25;
        int a = ab/10;
        int b = ab%10;
        int s = a+b;
        System.out.println(s);

        int xyz = 125;
        int x = xyz/100;
        int y = xyz/10%10;
        int z = xyz%10;
        int sum = x+y+z;
        System.out.println(sum);
    }
}
