package lesson1;

import java.util.Scanner;

public class Main2 {
    // main
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");// Command D
        System.out.println(3 / 2);
        int a = 2;
        int b = 3;
        System.out.println(a + " + " + b + " = " + (a + b)); // Mỗi ký tự như vậy muốn liên kết lại với nhau thì cần phải +
        System.out.printf("%d + %d = %d", a, b, a + b); // phần màu xanh là phần format mình muốn nó làm, tuy nhiên chưa hiểu đoạn sao cho nó có thêm phần trăm
        Scanner scanner = new Scanner(System.in); // tạo đối tượng Scanner
        //System.out.print("\nVui lòng nhập giá trị x:"); // thêm /n để xuống dòng, không liền với dòng ở trên
        //int x = scanner.nextInt();
        //System.out.println("a=" + x);
        //System.out.println("\nVui lòng nhập tên của bạn");
        //String name = scanner.nextLine();
        //System.out.println("Vui lòng nhập tuổi của bạn");
        //int age = scanner.nextInt();
        // đổi thành int age = Integer.parseInt(scanner.nextLine()); để fix lỗi ????
        //System.out.println("Tên của bạn là:" + name);
        //System.out.println("Tuổi của bạn là:" + age);
        //scanner.nextline(); // xoá dấu enter
        System.out.println("Vui lòng nhập tuổi của bạn");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("\nVui lòng nhập tên của bạn");
        String name = scanner.nextLine();
System.out.println("Tên của bạn là:" + name);
System.out.println("Tuổi của bạn là:" + age);
    }
}
