package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên phụ huynh nộp hồ sơ\n" +
                    "2. Phụ huynh tiếp theo\n" +
                    "3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    inVaXoaPhuHuynhVuaIn();
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
        System.out.print("Nhập tên phụ huynh: ");
        String name = scanner.nextLine();
        queue.offer(name);
        System.out.println("Tên phụ huynh đã được thêm !");
    }

    public static void inVaXoaPhuHuynhVuaIn() {
        if (!queue.isEmpty()) {
            String inVaXoaPhuHuynhVuaIn = queue.poll();
            System.out.println("Phụ huynh đầu tiên trong danh sách ( " + inVaXoaPhuHuynhVuaIn + " ) Đã xóa");
        } else {
            System.out.println("Danh sách phụ huynh rỗng.");
        }
    }
}
