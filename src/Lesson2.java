import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        /*консольный ввод*/
        Scanner in = new Scanner(System.in);
        System.out.println("введите номер");
        int userNum = in.nextInt();
        System.out.println(userNum);
        /*if*/
        int state = 0;
        if (state == 0) {
            System.out.println("Закрытие приложения");
        } else if (state ==1) {
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка статуса");
        }
            /* Даны переменные age и exp
             * если  значение age больше 100,
             * вывести "Мы вам перезвоним"
             * В противном случае перейти к проверке exp:
             * если exp меньше 5, вывести "Вы подходите на должность стажера"
             * в противном случа вывести "Вы подходите надолжность разработчика"*/

            int age = 12, exp = 90;
            if (age > 100) {
                System.out.println(" Мы вам перезвоним");
            } else if (exp < 5) {
                System.out.println("Вы походите на должность стажера");
            } else {
                System.out.println("Вы подходите на должность разработчика");
            }

            int sum = 1000, code = 5984;
            /*tckb yjvth regjyf nfrjq crblrf ,eltn 20%*/

            switch (code) {
                case 4692:
                    System.out.println(sum - sum * 0.3);
                    break;
                case 7024:
                case 5984:
                    System.out.println(sum - sum * 0.2);
                    break;
                case 1235:
                case 7351:
                case 9835:
                    System.out.println(sum - sum * 0.1);
                    break;
                default:
                    System.out.println(sum);
            }

            int mounth = 3;
            switch (mounth) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
            }

        while(true) {
            System.out.println("Введите число");
            int num = in.nextInt();
            System.out.println(num + 2);
            if (num == 0) break;
        }
        int start=1, end=14;
        while (start<end) {
            if (start%2==0) System.out.println(start);
            start++;
        }
        for(int num = 95;num>0;num-=5 ){
            System.out.println(num);
        }
        for(int num = 2,i = 1; i <= 21 ;num+=2, i++ ){
            System.out.println(num);

        }
        /*for(инициализация счетчика;условие;инктемент)*/



    }

}
