package lesson2.exercise;

//Tính giá trị của biến c và biến d:

public class Exercise1 {
    public static void main(String[] args) {

        boolean a = true && false; // Biểu tượng && là và; Không hiểu logic của bài này
        boolean b = (3 > 10) || (25 % 5 == 0); // Btuong || là OR – chỉ cần 1 cái đúng → kết quả đúng
        boolean c = a && b;
        boolean d = !a || b; //

        System.out.print("c: " + c);
        System.out.print("d: " + d);
    }
}
