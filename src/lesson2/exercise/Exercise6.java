package lesson2.exercise;

import java.util.Scanner;

//Giải phương trình bậc 2 có dạng: a𝑥2 + bx + c = 0.

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập số a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Hãy nhập số b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Hãy nhập số c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / a;
                System.out.println("Phương trình có 1 nghiệm x =" + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");

            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("x= " + x);

            } else {
                double x1 = ((-b + Math.sqrt(delta)) / 2 * a);
                double x2 = ((-b - Math.sqrt(delta)) / 2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
