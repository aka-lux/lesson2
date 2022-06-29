package oopExamples;

public class oopExample {

    public static void main(String[] args) {
        //создаем экземплар класса машина
        Car bmw = new Car("BMW");

        //читаем и выводим в консоль свойство имя
        System.out.println(bmw.getCarName());

        //читаем и выводим в консоль свойство макс скорость
        // оно не установлено видим 0
        System.out.println(bmw.getMaxSpeed());

        //устанавливаем свойство скорость в 500
        bmw.setMaxSpeed(500);

        //эти строчки работать не будут т.к. скорость типа int
        //bmw.setMaxSpeed("text");
        //bmw.setMaxSpeed(300.25);

        //читаем и выводим в консоль свойство макс скорость
        //теперь оно равно 500
        System.out.println(bmw.getMaxSpeed());

        //Напачатаем машину в консоль (это возможно только если у класа определен метод toString())
        System.out.println(bmw);
    }

}
