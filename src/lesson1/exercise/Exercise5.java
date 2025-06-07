package lesson1.exercise;
import java.util.Scanner;

/* Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
Công thức
Chu vi: C = 2 * π * r
Diện tích: A = π * r²
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập bán kính đường tròn: ");
        double radius = Double.parseDouble(scanner.nextLine());

        double perimeter = (double) 2 * Math.PI * radius;
        double area = (double) Math.PI * Math.pow(radius,2);

        System.out.printf("Vậy chu vi là: %.2f\n", perimeter);
        System.out.printf("Vậy diện tích là: %.2f\n", area);
    }
}
