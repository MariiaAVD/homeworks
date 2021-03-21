import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int count= 45;
        if (count<40) {
            count = 0;
            System.out.println("Попробуйте в следующий раз");
        } else if (count<60) {
            count = 40;
            System.out.println("удовлетворительно");
        } else if (count<89) {
            count =60;
            System.out.println("хорошо");
        } else if (count<=90) {
            count =90;
            System.out.println("отлично");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое число");
        int x = in.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("введите второе число");
        int y  = in.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("введите третее число");
        int z = in.nextInt();
        switch (z) {
            case 3:
                System.out.println(x+y);
                break;
            case 5:
                System.out.println(x-y);
                break;
            case 7:
                System.out.println(x*y);
                break;
            case 9:
                System.out.println(x/y);
                break;
        }



        Scanner in = new Scanner(System.in);
        System.out.println("введите первое число");
        int plate = in.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое число");
        int soap = in.nextInt();/*double*/
        while(soap>0.5) {
            soap = soap - 0.5*plate;
            plate --;
            System.out.println(soap);
        }
        System.out.println(plate);
        System.out.println(soap);


        int a=1;
        int b=9;
        int i=a +(int)(Math.random()*((b-a)+1));
        Scanner in = new Scanner(System.in);
        System.out.println("введите номер");
        int k = in.nextInt();
        if (k==i) {
            System.out.println("Вы угадали");
        } else if (k>i) {
            System.out.println("Загаданное число больше");
        } else if (k<i) {
            System.out.println("Загаданное число меньше");
        }

        int a=100;
        int b=500;
        int count=a +(int)(Math.random()*((b-a)+1));
                if(25<count<200) {
                    System.out.println("Число count содержится в интервале (25;200)");
                }else if (count<=25, count>=200) {
            System.out.println("Число count не содержится в интервале (25;200)");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Загадайте число от 1 до 100");
        int arg = in.nextInt();
        System.out.println("Загаданное число больше 50?");
        Scanner in = new Scanner(System.in);
        int var = in.nextInt();
        if (var==1){
            System.out.println("Загаданное число больше 75?");
            Scanner in = new Scanner(System.in);
            int var2 = in.nextInt();
            if (var2==1){
                   for (i=75; i<arg; i++);
                System.out.println(i);
                       }
            else if (var2==0){
                for (i=50; i<arg; i++);
                System.out.println(i);
            }
        } else if (var==0) {
            System.out.println("Загаданное число меньше 25?");
            Scanner in = new Scanner(System.in);
            int var3 = in.nextInt();
            if (var3 == 1) {
                for (i = 25; i > arg; i--) ;
                System.out.println(i);
            } else if (var3 == 0) {
                for (i = 50; i > arg; i--) ;
                System.out.println(i);
            }
        }
    }
}
