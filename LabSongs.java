package mlc.objectandclasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabSongs {
    private String typeList;
    private String name;
    private String time;

    public LabSongs(String input) {
        String[] inputArray = input.split("_");
        this.typeList = inputArray[0];
        this.name = inputArray[1];
        this.time = inputArray[2];
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSongs = Integer.parseInt(scanner.nextLine());
        List<LabSongs> songsList = new ArrayList<>();
        for (int i = 0; i < countSongs; i++) {
            String input = scanner.nextLine();
            LabSongs song = new LabSongs(input);
            songsList.add(song);
        }
        String command = scanner.nextLine();
        if("all".equals(command)) {
            for (LabSongs labSong: songsList) {
                System.out.println(labSong.getName());
            }
        } else {
            for (LabSongs labSong: songsList) {
                if(labSong.getTypeList().equals(command))
                    System.out.println(labSong.getName());
            }
        }
    }
}
