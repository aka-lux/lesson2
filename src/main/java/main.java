import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class main {
//    public static void main(String[] args) throws IOException, InterruptedException {
//        //Вывод текста в консоль
//        System.out.println("Введите число");
//
//        //Буфер для чтения из консоли
//        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
//
//        //Само чтение
//        String name = reader.readLine();
//
//        //Вывод результата в консоль
////        System.out.println("1"+1*3);
////        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "Ваше число " + name + ConsoleColors.RESET);
////
//
//        if (name.equals("q")){
//            System.out.println("Вы ввели q");
//        }else {
//            System.out.println("Конец программы\n");
//        }
//
//        TimeUnit.SECONDS.sleep(3);
//
//        System.out.println();
//        System.out.println("Еще одно сообщение");
//
//    }

    public static void main(String[] args) throws IOException, InterruptedException {
    String name = "Вася зйщцушгкзйщцушктзйщцмушгйкщзцшмуикщзйцшумкщзйцшгумтзщшйгцутщзкмйтгцщзушкгйцмщзшугкймщцзшугкз";
    int age = 100;
    double length = 100;
    boolean isSingle = true;

    String[] strings = {"str1","str2",};
    int[] ints = {1,2};
    int i = 1;

        System.out.println(strings[i]);
        System.out.println(ints[i]);

        System.out.println("Его имя " + name);
        System.out.println("Его возвраст " + age);
        System.out.println("Его рост " + length);
        System.out.println("Его параметр " + isSingle);

    }





















//    public static void main(String[] args) throws IOException {
//        try (InputStream propFile = new FileInputStream("src/main/resources/app.properties")) {
//            Properties prop = new Properties();
//            prop.load(propFile);
//
//            System.out.println(prop.getProperty("prop1"));
//            System.out.println(prop.getProperty("prop2"));
//            System.out.println(prop.getProperty("user.name"));
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        String expected_value = "Hello, world!";
//        String file ="src/main/resources/text.txt";
//
//        try ( InputStream txtFile = new FileInputStream(file);
//               BufferedReader br = new BufferedReader(new InputStreamReader(txtFile)); ) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        }
//
//
//        String fileCSV ="src/main/resources/num.csv";
//
//        try ( InputStream txtFile = new FileInputStream(fileCSV);
//              BufferedReader br = new BufferedReader(new InputStreamReader(txtFile)); ) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line.split(",")[2]);
//            }
//        }
//
//    }

//    public static void main(String[] args) throws IOException {
//
//
//        String str = "Hello";
//        BufferedWriter writer1 = new BufferedWriter(new FileWriter("src/main/resources/1.txt"));
//        writer1.write(str);
//        writer1.close();
//
//
//        BufferedWriter writer2 = new BufferedWriter(new FileWriter("src/main/resources/2.txt", true));
//        writer2.append("# # # ");
//        writer2.append(str);
//        writer2.append(" # # #");
//
//        writer2.close();
//    }

}
