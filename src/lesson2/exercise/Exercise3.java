package lesson2.exercise;

import java.util.Scanner;

/* Nhập vào 2 số nguyên, lưu vào 2 biến a và b.
Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập số b: ");
        int b = Integer.parseInt(scanner.nextLine());

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Vậy số a là: " + a);
        System.out.println("Số b là: " + b);
    }
}
