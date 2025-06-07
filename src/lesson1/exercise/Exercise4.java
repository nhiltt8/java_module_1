package lesson1.exercise;

import java.util.Scanner;

/* Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh.
Tính điểm trung bình của học sinh đó.
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập điểm môn Toán: ");
        double mathScore = Double.parseDouble(scanner.nextLine());

        System.out.print("Vui lòng nhập điểm môn Lý: ");
        double physicalScore = Double.parseDouble(scanner.nextLine());

        System.out.print("Vui lòng nhập điểm môn Hoá: ");
        double chemicalScore = Double.parseDouble(scanner.nextLine());

        double average = (double) ((mathScore + physicalScore + chemicalScore) / 3.0);
        System.out.printf("Vậy điểm trung bình 3 môn của bạn là: %.2f\n", average);
    }
}
