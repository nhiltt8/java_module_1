package lesson1.exercise;

import java.time.Year;
import java.util.Scanner;

//Nhập năm sinh của một người. Tính tuổi người đó.

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập năm sinh của bạn: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Tuổi của bạn là:" + (Year.now().getValue() - year));
    }
}
