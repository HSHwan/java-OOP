package oop.course2.part2.ch01;

public class IntegerStringTest {

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 + str2); // "123123"
        // "123" + "123" => 246 (정수)
        int num = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(num); // 246

        int su1 = 123;
        int su2 = 123;
        System.out.println(su1 + su2);
        // 123 + 123 => "123123"
        String str = String.valueOf(su1) + String.valueOf(su2);
        System.out.println(str); // "123123"
        str = su1 + "" + su2;
        System.out.println(str); // "123123"
    }
}
