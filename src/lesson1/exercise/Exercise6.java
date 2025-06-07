package lesson1.exercise;

import java.util.Scanner;

/* Nhập vào số xe của bạn (Gồm tối đa 5 chữ số). Cho biết số xe của bạn được mấy nút?

Ví dụ: Biển số xe bạn là: 12345 thì số nút là 5, do 1 + 2+ 3 + 4 + 5 = 15,
nhưng số nút chỉ lấy hàng đơn vị nên sẽ là 5 nút (điểm).
 */

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập biển số xe: ");
        int number = scanner.nextInt();

        int number1 = number % 10; // Để lấy ra 5
        int number11 = number / 10; //để lấy ra 1234

        int number2 = number11 % 10; //để lấy ra 4
        int number22 = number11 / 10; //để lấy ra 123

        int number3 = number22 % 10; //để lấy ra 3
        int number33 = number22 / 10; //để lấy ra 12

        int number4 = number33 % 10; // để lấy ra 2
        int number44 = number33 / 10; //để lấy ra 1

        int number5 = number44 % 10; // để lấy ra 1
        int number55 = number44 / 10; //để lấy ra 1

        int sum = (number1 + number2 + number3 + number4 + number5);
        int bienSo = sum % 10;

        System.out.println("Vậy số là " + bienSo);
    }

}
