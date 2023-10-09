package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    reverse();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void input() {
        System.out.print("Nhập câu bất kỳ : ");
        String n = scanner.nextLine();
        String[] words = n.split(" ");
        for (String str : words) {
            stack.push(str);
        }
    }

    public static void reverse() {
        System.out.print("Câu đảo ngược: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

}
