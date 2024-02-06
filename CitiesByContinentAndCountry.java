package mlc.advanced.setsandmaps.lab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(; n > 0; n --) {
            String[] array = scanner.nextLine().split(" ");
            if (!continents.containsKey(array[0])) {
                Map<String, List<String>> countries = new LinkedHashMap<>();
                List<String> cities = new ArrayList<>();
                cities.add(array[2]);
                countries.put(array[1], cities);
                continents.put(array[0], countries);
            } else {
                Map<String, List<String>> countries = continents.get(array[0]);
                if(!countries.containsKey(array[1])) {
                    List<String> cities = new ArrayList<>();
                    cities.add(array[2]);
                    countries.put(array[1], cities);
                } else {
                    countries.get(array[1]).add(array[2]);
                }
            }
        }
        continents.forEach((continent, countries) -> {
            System.out.println(continent + ":");
            countries.forEach((country, cities) -> System.out.printf("  %s -> %s%n", country, String.join(", ", cities)));
        });
    }
}
