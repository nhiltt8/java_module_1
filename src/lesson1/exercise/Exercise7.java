package lesson1.exercise;

import java.util.Scanner;

 /* Tìm a, i, j biết:
a.    int i = 1, j = 1;
int a = i++ + j++;
  */

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập i: ");
        int i = scanner.nextInt();

        System.out.print("Vui lòng nhập j: ");
        int j = Integer.parseInt(scanner.nextLine());

        int a = i++ + j++;
        System.out.println("Vậy số a =" + a);
    }
}
