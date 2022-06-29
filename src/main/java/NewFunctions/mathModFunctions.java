package NewFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mathModFunctions {
    public static void main(String[] args) throws IOException {
        //       task46();
//        task41();
//        task43();
//        task45();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            task42();
//        }
 //       task47();
        task411();
    }

    //    Задание 4.1
//    Напишите класс, который принимает с клавиатуры целое положительное двузначное число и выводит на экран его цифры, разделенные
//    знаком «пробел».
    public static void task41() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name.charAt(0) + " " + name.charAt(1));
    }

    //    Задание 4.2
//    Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит на экран его цифры, разделенные
//    знаком «пробел».
    public static void task42() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.length() > 2) {
            System.out.println(name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2));
        } else {
            System.out.println(
                    "Incorrect value"
            );
        }
    }

    //    Задание 4.3
//    Напишите класс, который принимает с клавиатуры целое положительное двузначное число и выводит на экран его цифры, разделенные
//    знаком «пробел», но в обратном порядке. То есть для числа 45 будет
//    выведено на экран 5 4.
    public static void task43() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name.charAt(1) + " " + name.charAt(0));
    }

    //    Задание 4.4
//    Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит на экран его цифры, разделенные
//    знаком «пробел», но в обратном порядке. То есть для числа 415 будет
//    выведено на экран 5 1 4.
    public static void task44() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.length() > 2) {
            System.out.println(name.charAt(2) + " " + name.charAt(1) + " " + name.charAt(0));
        } else {
            System.out.println(
                    "Incorrect value"
            );
        }
    }

    //    Задание 4.5
//    Напишите класс, который принимает с клавиатуры целое положительное двузначное число и выводит его на экран
//        в «полном виде»: например, для числа 34 это будет выглядеть как 30+4.
    public static void task45() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int digit1 = Integer.parseInt(
                String.valueOf(
                        name.charAt(0))) * 10;
        System.out.println(digit1 + " " + name.charAt(1));
    }

    //    Задание 4.6
//    Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит его на экран
//        в «полном виде»: например, для числа 364 это будет выглядеть как 300+60+4.
    public static void task46() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int digit1 = Integer.parseInt(
                String.valueOf(
                        name.charAt(0))) * 100;
        int digit2 = Integer.parseInt(
                String.valueOf(
                        name.charAt(1))) * 10;
        System.out.println(digit1 + " " + digit2 + " " + name.charAt(2));
    }
//    Задание 4.7
//    Напишите класс, который принимает с клавиатуры целое положительное двузначное число.
//    Затем следует построить новое значение, составленное из цифр числа, введенного с клавиатуры, но в обратном
//    порядке. После этого новое значение следует увеличить на 8, и окончательный результат вывести на экран.
//    То есть для числа 37 следует построить число 73 и вывести на экран 81.

    public static void task47() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int digit1 = Integer.parseInt(
                String.valueOf(
                        name.charAt(0)));
        int digit2 = Integer.parseInt(
                String.valueOf(
                        name.charAt(1)));
        System.out.println(digit2*10 + digit1 + 8);
    }
//
//    Задание 4.11
//    Назовем «длиной двузначного числа» разницу между числом десятков
//            (первая цифра) и числом единиц (вторая цифра).
//    Напишите класс, который принимает с клавиатуры двузначное число и
//    выводит на экран его «длину».

    public static void task411() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int digit1 = Integer.parseInt(
                String.valueOf(
                        name.charAt(0)));
        int digit2 = Integer.parseInt(
                String.valueOf(
                        name.charAt(1)));
        System.out.println(digit2 - digit1);
    }
//
//    Задание 4.12
//    Назовем «длиной трехзначного числа» разницу между его первой (число сотен) и последней (число единиц) цифрами, умноженную на его
//    среднюю (число десятков) цифру.
//    Напишите класс, который принимает с клавиатуры целое положительное трехзначное число, вычисляет его «длину» и выводит результат на
//    экран.
}
