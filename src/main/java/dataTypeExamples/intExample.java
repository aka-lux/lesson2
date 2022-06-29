package dataTypeExamples;

public class intExample {
   /**
    * Запуск данного примера
    */
   public static void main(String[] args) {
      soutInt();
      summInt();
      uniteInt();
      summCustomInt(22,44);
      minMaxInt();
   }

   /**
    * Метод печатает в консоль число 38
    */
   public static void soutInt(){
      int i = 38;
      System.out.println(38);
   }

   /**
    * Метод печатает в консоль сумму чисел 22 и 37
    */
   public static void summInt(){
      int i = 22;
      int j = 37;
      System.out.println(i+j);
   }

   /**
    * Метод печатает в консоль обьединение чисел 22 и 37
    */
   public static void uniteInt(){
      int i = 22;
      int j = 37;
      System.out.println(""+i+j);
   }

   /**
    * Метод печатает в консоль сумму переданных ему чисел
    */
   public static void summCustomInt(int i, int j){
      System.out.println(i+j);
   }

   /**
    * Метод печатает в консоль максимальное и минимальное значение типа int
    */
   public static void minMaxInt(){
      int max = Integer.MAX_VALUE;
      int min = Integer.MIN_VALUE;
      System.out.println("Максимальнное значение Int: " + max);
      System.out.println("Минимальное значение Int: " + min);
   }

}
