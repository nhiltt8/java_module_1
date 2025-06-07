package lesson1.exercise;

import java.util.Scanner;

/* Nhập tên sản phẩm, số lượng và đơn giá.
Tính tiền và thuế giá trị gia tăng phải trả, biết:
a. tiền = số lượng * đơn giá
b. thuế giá trị gia tăng = 10% */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên sản phẩm: ");
        String produce = scanner.nextLine();

        System.out.print("Số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Đơn giá: ");
        int cost = Integer.parseInt(scanner.nextLine());

        double price = (double) quantity * cost;
        double vat = (double) price * 0.1;

        System.out.println("Số tiền của món hàng là: " + (double) quantity * cost);
        System.out.println("Giá tiền cộng thuế VAT là: " + (double) (price + (price * 0.1)));
    }
}
