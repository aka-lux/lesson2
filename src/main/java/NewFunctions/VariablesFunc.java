package NewFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VariablesFunc {
    /**
     * метод для запуска нашего кода
     */
    public static void main(String[] args) throws IOException {
        task21();
        task22();
        task23();
        task24();
        task28();
        task29();
        task210();
        task211();
        task212();
        task234();
    }

    /**
     * Задание 2.1 Напишите класс, который выводит на экран надпись "Hello, world!"
     */
    public static void task21() {
        System.out.println("Hello World!");
    }

    /**
     * Задание 2.2 Напишите класс, который выводит на экран надпись "H-e-1-1-o-,-f-r-i-e-n-d!"
     */
    public static void task22() {
        System.out.println("H-e-1-1-o-,-f-r-i-e-n-d!");
    }

    /**
     * Задание 2.3  Напишите класс, который выводит на экран в первой строке три знака «+»,
     * во второй - четыре знака«!», в третьей - два знака«?».
     */
    public static void task23() {
        System.out.println("+++");
        System.out.println("!!!!");
        System.out.println("??");
    }

    /**
     * Задание 2.4 Напишите класс, который выводит на экран тем же количеством команд знаки,
     * которые выводились в задании № 3, но все знаки должны выводиться в одной строке.
     */
    public static void task24() {
        System.out.println("+++\n!!!!\n??");
    }

    /**
     * Задание 2.8 Напишите класс, который присваивает переменной х значение 6, а затем выводит на экран:
     * в первой строке - это значение, во второй - квадрат этого значения, в третьей - куб этого значения.
     */
    public static void task28() {
        int i =6;
        System.out.println(i);
        System.out.println(i*i);
        System.out.println(i*i*i);
    }

    /**
     * Задание 2.9 Напишите класс, который присваивает переменной х значение 9, а затем выводит на экран:
     * в первой строке - это значение с поясняющей надписью (например, «значение х равно 9»), а во второй - квадрат
     * этого значения (тоже с поясняющей надписью).
     */
    public static void task29() {
        int x = 9;
        System.out.println("значение х равно 9");
        System.out.println("квадрат х равен 9");
    }

    /**
     * Задание 2.10 Напишите класс, который присваивает двум переменным значения, а затем выводит на экран:в первой
     * строке значения обеих переменных, во второй - произведение этих переменных, в третьей - сумму этих переменных.
     */
    public static void task210() {
        int var1 = 10;
        int var2 = 25;
        System.out.println("var1 = "+ var1 + " var2 = "+ var2 );
    }

    /**
     * Задание 2.11 Напишите класс, который выводит на экран в одной строке ваше имя и фамилию, в друтой - телефон,
     * все это - в рамке из «звездочек» ().
     */
    public static void task211() {
        System.out.println("*************");
        System.out.println("*Ivan Ivanov*");
        System.out.println("*12345678910*");
        System.out.println("*************");
    }

    /**
     * Задание 2.12  Напишите класс, который выводит на экран «песочные часы», составленные из какого-либо символа.
     */
    public static void task212() {
        System.out.println(
                "#####" +
                " # #" +
                "  #" +
                " # #" +
                "#####" );
    }

    /**
     * Задание 2.34 Напишите класс, который сначала заносит в переменную строковое значение Привет,
     * а затем принимает с клавиатуры ваше имя. Класс должен вывести на экран в одной строке сообщение,
     * составленное из строкового значения Привет, знака «запятая» и вашего имени.
     */
    public static void task234() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Привет, " + name);
    }
}
