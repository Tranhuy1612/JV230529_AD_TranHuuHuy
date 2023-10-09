package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Scanner;


public class Product implements IShop {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm ");
        this.productId = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên sản phẩm ");
        this.productName = sc.nextLine();

        System.out.println("Nhập tiêu đề sản phẩm ");
        this.title = sc.nextLine();

        System.out.println("Nhập mô tả sản phẩm ");
        this.descriptions = sc.nextLine();


        System.out.println("Nhập giá nhập sản phẩm ");
        this.importPrice = Float.parseFloat(sc.nextLine());

        System.out.println("Nhập trạng thái sản phẩm ");
        this.productStatus = Boolean.parseBoolean(sc.nextLine());

        exportPrice = importPrice * RATE;

    }

    @Override
    public void displayData() {
        System.out.println("Mã sản phâm :" + productId + " | Tên sản phẩm :" + productName + "| Tiêu đề :" + title
                + "| Mô tả :" + descriptions
                + "| Giá bán sản phẩm :" + exportPrice + " | Trạng thái :" + (productStatus ? " Còn hàng " : " Hết hàng ")
        );
    }
}
