package mlc.objectandclasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    private  String testStr = "11";

    public String getTestStr() {
        return  testStr;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getTestStr());

        StudentMain.Student s = new StudentMain.Student();
    }
}
