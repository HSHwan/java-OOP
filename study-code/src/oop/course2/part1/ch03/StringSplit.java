package oop.course2.part1.ch03;

import java.util.Scanner;

public class StringSplit {

    public static void main(String[] args) {
//        String str = "Hello,World,Java";
//        String str = "Hello World  Java";
//        String[] strArray = str.split(",");
//        String[] strArray = str.split("\\s+");
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String str = scanner.nextLine();
        String[] strArray = str.split("\\s+");
        for (String string : strArray) {
            System.out.println(string);
        }
    }
}
