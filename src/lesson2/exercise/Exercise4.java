package lesson2.exercise;

import java.util.Scanner;

/*Nhập vào 2 số nguyên a, b.
In ra màn hình kết quả số lớn nhất, nhỏ nhất.
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("vui lòng nhập số a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Vui lòng nhập số b: ");
        int b = Integer.parseInt(scanner.nextLine());

        if (a > b) {
            System.out.println("Max là: " + a);
        } else {
            System.out.println("Max là: " + b);
        }
    }
}
