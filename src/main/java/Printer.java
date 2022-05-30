public class Printer {
    /*
    * Функция должна вернуть квадрат заполненный по образцу
    * size = 1
    *   ---
    *   |*|
    *   ---
    * size = 2
    *   ----
    *   |**|
    *   |**|
    *   ----
    */
    public static String printer(int size){
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < size + 2; i++) {

            for (int j = 0; j < size + 2; j++) {

                if(i==0 || i == size + 1){
                    sb.append("-");
                }else if(j==0 || j == size + 1){
                    sb.append("|");
                }else{
                    sb.append("*");
                }

            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
