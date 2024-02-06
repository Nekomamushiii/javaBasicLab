package mlc.objectandclasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Students2> studentList = new ArrayList<>();
        while (!"end".equals(input)) {
            Students2 student = new Students2(input);
            if(!checkExists(studentList, student))
                studentList.add(student);
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for(Students2 student : studentList) {
            if(city.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }

    public static boolean checkExists(List<Students2> list, Students2 checkStudent) {
        for(Students2 students: list) {
            if(students.getFirstName().equals(checkStudent.getFirstName())
            && students.getLastName().equals(checkStudent.getLastName())) {
                students.setAge(checkStudent.getAge());
                students.setHomeTown(checkStudent.getHomeTown());
                return true;
            }
        }
        return false;
    }


    private String firstName;
    private String lastName;
    private String homeTown;
    private int age;

    public Students2(String input) {
        String[] arrays = input.split(" ");
        this.firstName = arrays[0];
        this.lastName = arrays[1];
        this.age = Integer.parseInt(arrays[2]);
        this.homeTown = arrays[3];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
