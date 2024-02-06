package mlc.advanced.setsandmaps.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String input = scanner.nextLine();
        while(!"Revision".equals(input)) {
            String [] array = input.split(", ");
            if(!shops.containsKey(array[0])) {
                Map<String, Double> products = new LinkedHashMap<>();
                products.put(array[1], Double.parseDouble(array[2]));
                shops.put(array[0], products );
            } else  {
                Map<String, Double> products = shops.get(array[0]);
                products.put(array[1], Double.parseDouble(array[2]));
            }
            input = scanner.nextLine();
        }

        shops.forEach((shop, products) -> {
            System.out.println(shop + "->");
            products.forEach((product, price) -> {
                System.out.printf("Product: %s, Price: %.1f%n", product, price);
            });
        });
    }
}
