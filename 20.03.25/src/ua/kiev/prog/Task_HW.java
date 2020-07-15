package ua.kiev.prog;

import java.util.Scanner;

public class Task_HW {

    public static void main(String[] args) {
        // Задание 1. Значение x и a запрашиваем у юзера при помощи сканера.
        float x, a, y, r, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения Х и А : ");
        x = sc.nextFloat();
        a = sc.nextFloat();
        System.out.printf("Вы ввели следующие значения : Х = %.2f ; А = %.2f\n", x, a);
        System.out.printf("Y = 7*X2 - 3*X + 6 = %.2f\n", 7*Math.pow(x,2) - 3*x + 6 );
        System.out.printf("X = 12*A2 + 7*A - 16 = %.2f\n", 12*Math.pow(a,2) + 7*a - 16 );

        //Задание 2. Дана сторона квадрата. Найти его периметр.
        System.out.println("\nВведине значение стороны квадрата :");
        p = sc.nextFloat();
        System.out.printf("Периметр квадрата равен : Р = %.2f\n" , 4*p);

        //Задание 3. Дан радиус окружности найти его диаметр.
        System.out.println("Укажите радиус окружности R.");
        r = sc.nextFloat();
        System.out.printf("Дан радиус окружности : R = %.2f\n" , r);
        System.out.printf("Диаметр окружности c заданным радиусом R есть D= %.2f\n",2*r);

        /*Задание 4. Дано двухзначное число. Найти:
        А) число десятков в нем;
        Б) число единиц в нём;
        В) сумму его цифр;
        Г) произведение его цифр.
         */
        int s;
        System.out.println("\nВведите двухзначное число :");
        s = sc.nextInt();
        System.out.println("Вы ввели следующее число :" + s);
        System.out.printf("В вашем числе:\na) число десятков = %d\nб) число единиц в нём = %d\nв) сумму его цифр = %d\n" +
                "г) произведение его цифр = %d\n", s/10, s%10, s/10+s%10,s/10 *(s%10));


        /*Задание 5*. Из трёхзначного числа x вычли его последнюю цифру. Когда результат разделили на 10,
        а к частному слева приписали последнюю цифру числа x то получили 237. Найти число x и вывести на экран.
         */
        System.out.println("Из трёхзначного числа x вычли его последнюю цифру. Когда результат разделили на 10,\n" +
                "а к частному слева приписали последнюю цифру числа x то получили 237. Найти число x и вывести на экран.");
        int q = 237;
        System.out.printf("x = %d", (237%100) * 10 + 2);

        sc.close();
    }
}