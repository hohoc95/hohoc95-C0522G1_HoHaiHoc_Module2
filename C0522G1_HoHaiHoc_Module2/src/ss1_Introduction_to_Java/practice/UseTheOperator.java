package ss1_Introduction_to_Java.practice;

import java.util.Scanner;

// [Thực hành] Sử dụng toán tử
public class UseTheOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is " + area);
    }
}
