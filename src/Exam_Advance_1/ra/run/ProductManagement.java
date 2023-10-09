package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.*;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();
    public static List<Catalog> catalogs = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                    "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục [10 điểm]\n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm [20 điểm]\n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator) [10 điểm]\n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm [05 điểm]\n" +
                    "5. Thoát [05 điểm]");
            System.out.print("Chọn một chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    inputCatalogs();
                    break;
                case 2:
                    inputProducts();
                    break;
                case 3:
                    sortProductsByPrice();
                    displayProducts();
                    break;
                case 4:
                    searchProductsByCatalogName();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public static void inputCatalogs() {
        System.out.print("Nhập số danh mục sản phẩm: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Catalog catalog = new Catalog();
            catalog.inputData();
            catalogs.add(catalog);
            catalog.displayData();
        }
    }

    public static void inputProducts() {
        System.out.print("Nhập số sản phẩm: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.inputData();
            products.add(product);
            product.displayData();
        }
    }

    public static void sortProductsByPrice() {
        Collections.sort(products, (p1, p2) -> Float.compare(p1.getExportPrice(), p2.getExportPrice()));
    }

    public static void displayProducts() {
        for (Product product : products) {
            product.displayData();
            System.out.println("--------------------------");
        }
    }

    public static void searchProductsByCatalogName() {
        System.out.print("Nhập tên danh mục sản phẩm cần tìm: ");
        String catalogName = scanner.nextLine();

        boolean check = false;
        for (Product product : products) {
            if (product.getCatalog().getCatalogName().equalsIgnoreCase(catalogName)) {
                product.displayData();
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm trong danh mục này.");
        }
    }

}
