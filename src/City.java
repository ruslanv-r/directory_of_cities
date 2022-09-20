public class City {

    String number;
    String name;
    String region;
    String district;
    String population;
    String foundation;


    public City(String number, String name, String region, String district, String population, String foundation) {
        this.number = number;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population='" + population + '\'' +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}

