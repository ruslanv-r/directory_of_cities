import java.io.File;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // Хрвнит города
        List<City> cityInfo = new ArrayList<>();

        // Путь до файла
        //String file = "D:\\Pogramming_java\\Sber_Stajirovka\\ВС_Java.csv";
        String file = "ВС_Java.csv";

        String line;
        try (Scanner s = new Scanner(new File(file))) {
            // читать по строкам
            s.useDelimiter("^");
            // проход по всем строкам
            while (s.hasNext()) {
                // записываем строку в переменную
                line = s.nextLine();

                // Делит одну строку в несколько по разделителям
                String[] split = line.split(";");

                // т.к. в 242 строке не полные данные:
                String number = split.length > 0 ? split[0] : null;
                String name = split.length > 1 ? split[1] : null;
                String region = split.length > 2 ? split[2] : null;
                String district = split.length > 3 ? split[3] : null;
                String population = split.length > 4 ? split[4] : null;
                String foundation = split.length > 5 ? split[5] : null;
                cityInfo.add(new City(number, name, region, district, population, foundation));
            }
            Collections.sort(cityInfo, new CityNameComparator());
            System.out.println();
            cityInfo.forEach(city -> System.out.println(city.toString()));


            Collections.sort(cityInfo, new DistrictAndNameComparator());
            System.out.println();
            cityInfo.forEach(System.out::println);


        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
