package lesson2.exercise;

import java.util.Scanner;

//Giải phương trình bậc 1 có dạng: ax + b = 0.

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập số a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Hãy nhập số b: ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("x =" + (-b / a));
        }
    }
}

