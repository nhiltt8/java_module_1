package lesson1.exercise;

import java.util.Scanner;

/* Viết một chương trình Java để nhập vào hai số nguyên a và b từ người dùng.
Sau đó, tính và hiển thị tổng, hiệu, tích và thương của hai số đó.
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Hãy nhập b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Tổng là: " + (a + b));
        System.out.println("Hiệu là: " + (a - b));
        System.out.println("Tích là: " + (a * b));
        System.out.printf("Thương là: %.2f\n" + (double) a / b);
    }
}
