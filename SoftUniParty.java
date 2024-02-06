package mlc.advanced.setsandmaps.lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vips = new TreeSet<>();
        Set<String> regulars = new TreeSet<>();
        String command = scanner.nextLine();
        while (!"PARTY".equals(command)) {
            if(Character.isDigit(command.charAt(0)))
                vips.add(command);
            else
                regulars.add(command);
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!"END".equals(command)) {
            if(Character.isDigit(command.charAt(0)))
                vips.remove(command);
            else
                regulars.remove(command);
            command = scanner.nextLine();
        }
        System.out.println(vips.size() + regulars.size());
        for(String vip : vips)
            System.out.println(vip);
        for(String regular : regulars)
            System.out.println(regular);
    }
}
