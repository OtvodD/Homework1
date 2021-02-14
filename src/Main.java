public class Main {

//  Задание № 1+2

    public static void main(String[] args) {
        byte a = -15;
        short b = 25;
        int c = 5;
        long d = -45;

        float e = 12.3f;
        double f = 25.13;

        char g = '$';
        String name = "Илья";

        boolean isTrue = true;
        boolean isFalse = false;


        task3(a, b, c, d);

        task4(a, b);

        task5(d);

        task6(c);

        task7(name);

        task8();
    }

//  Задание № 3

    static void  task3 (byte a, short b, int c, long d)
    {
        long x = a * (b + (c / d));
        System.out.println("Ответ на задание 3: " + x);
    }

//  Задание № 4

    static void task4 (byte a, short b)
    {
        int y;
        y = a + b;
        boolean s = (y >= 10 && y <= 20);
        System.out.println("Ответ на задание 4: " + s);
    }

//  Задание № 5

    static void task5 (long d)
    {
        if (d >= 0){
            System.out.println("Ответ на задание 5: Число " + d + " положительное");
        }
        else {
            System.out.println("Ответ на задание 5: Число " + d + " отрицателное");
        }

    }

//  Задание № 6

    static void task6(int c)
    {
        boolean y = (c < 0);
        System.out.println("Ответ на задание 6: " + y);
    }

//  Задание № 7

    static void task7(String name)
    {
        System.out.println("Привет, " + name + "!");
    }

//  Задание № 8

    static void task8() {
        int year;
        year = 1200;
        if (year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не високосный");
        } else if (year % 4 == 0) {
            System.out.println(year + " год високосный");
        }
        else{
            System.out.println(year + " год не високосный");
        }
    }

}
