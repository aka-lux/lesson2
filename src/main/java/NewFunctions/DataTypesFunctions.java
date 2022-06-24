package NewFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypesFunctions {
    public static void main(String[] args) throws IOException {
        task1 ();
        task2();
    }
//    Задание 3.1
//    Связь между температурой по шкале Цельсия и температурой по шкале Фаренгейта выражается формулой: C=S(F-32)/9, где С - температура
//    по шкале Цельсия, F - температура по шкале Фаренгейта.
//    Напишите класс, который принимает с клавиатуры температуру по
//    шкале Фаренгейта, а затем выводит на экран эту же температуру, но по
//    шкале Цельсия.
public static void task1 () throws IOException {
    System.out.println("Введите число:");
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    String temp = reader.readLine();
    double dtemp = Integer.parseInt(temp);
    double far = (dtemp -32)/9;
    System.out.println(far);
}
//
//    Задание 3.2
//    Во многих странах для измерения небольших размеров используется
//    не только единица длины «сантиметр», но и такая единица, как «дюйм>> (1дюйм=2.54 сантиметра).
//    Напишите класс, который принимает с клавиатуры значение, равное
//    размеру в сантиметрах, и затем подсчитывает и выводит на экран это
//    же значение, но в дюймах.
public static void task2 () throws IOException {
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    String temp = reader.readLine();
    double dtemp = Integer.parseInt(temp);
    double far = dtemp * 2.54;
    System.out.println(far);
}
//    Задание 3.4
//    Для пересчета суммы в одной валюте - в сумму в другой валюте (например, между суммой в рублях и этой же суммой, но в евро) используется так называемый «банковский курс»: числовой коэффициент,
//    показывающий, чему равна единица одной валюты в единицах другой.
//    Напишите класс, который принимает с клавиатуры два числа: первое -
//    сумму в одной валюте (например, в долларах), и второе - «банковский
//    курс». Класс должен подсчитать и вывести на экран сумму во второй
//    валюте.
//
//    Задание 3.6
//    Напишите класс, который принимает с клавиатуры целое число и выводит на экран (в одной строке) три следующих за ним целых числа так,
//    чтобы разница между каждым числом и следующим за ним составляла 2.
//    Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 8, 10, 12.
//
//    Задание 3.7
//    Напишите класс, который принимает с клавиатуры целое число и выводит на экран три предыдущих ему целых числа, причем каждое - в
//    отдельной строке.

}
