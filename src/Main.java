import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

ArrayList<City> cityInfo= new ArrayList<>();
               String file = "D:\\Pogramming_java\\Sber_Stajirovka\\ВС_Java.csv";

        String line;
        ArrayList cities = new ArrayList<City>();
        try (Scanner s = new Scanner(new File(file))) {
            s.useDelimiter("^");
            while(s.hasNext()){
                line = s.nextLine();
                //dataCity.add(line.split(";"));
               List values = Arrays.asList(line.split("^"));
                cities.add( values); } cities.forEach(l -> System.out.println(l));


cityInfo.add((ArrayList(City)) cities)
//for (Object city: cities){
//cityInfo.add((City) city);
//}






        } catch (Exception e){ System.out.println(e);
        }
        System.out.println("##########");
        for (int i = 0; i < cities.size(); i++) {

            System.out.println(cities.get(i).toString());
        }
        System.out.println("!!!!!!!!!!");
        for (int i = 0; i < cityInfo.size(); i++) {


    System.out.println(cityInfo.get(i));
}

//        String fileInfoCity = "D:\\Pogramming_java\\Sber_Stajirovka\\ВС_Java.csv";
//        File file = new File(fileInfoCity);
//
//        try{
//            // -read from filePooped with Scanner class
//            Scanner inputStream = new Scanner(file);
//            // hashNext() loops line-by-line
//            while(inputStream.hasNext()){
//                //read single line, put in string
//                String data = inputStream.next(" ");
//                dataCity.add(inputStream.next(""));
//                System.out.println(data + "***");
//
//            }
//            // after loop, close scanner
//            inputStream.close();
//
//
//        }catch (FileNotFoundException e){
//
//            e.printStackTrace();
//        }




//        for (int i = 0; i < ; i++) {
//
//        }
//
//        try {
//            dataCity.add(new Scanner(new File("D:\\Pogramming_java\\Sber_Stajirovka",ВС_Java.csv)).useDelimiter(";").next().split("\n"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
