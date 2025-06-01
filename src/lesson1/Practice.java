package lesson1;

import java.time.Year;
import java.util.Scanner;


public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập năm sinh của bạn");
        int year = scanner.nextInt();
        System.out.println("Tuổi của bạn là:" + (Year.now().getValue()-year));
    }

}
