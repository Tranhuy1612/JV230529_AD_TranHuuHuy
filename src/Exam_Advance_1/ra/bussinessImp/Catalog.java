package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã danh mục sản phẩm ");
        this.catalogId = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên danh mục sản phẩm ");
        this.catalogName = sc.nextLine();


        System.out.println("Nhập độ ưu tiên ");
        this.priority = Integer.parseInt(sc.nextLine());


        System.out.println("Nhập mô tả danh mục sản phẩm ");
        this.descriptions = sc.nextLine();


        System.out.println("Nhập trạng thái danh mục sản phẩm ");
        this.catalogStatus = Boolean.parseBoolean(sc.nextLine());

    }

    @Override
    public void displayData() {
        System.out.println("Mã danh mục : " + catalogId + " | Tên danh mục :" + catalogName
                + "| Độ ưu tiên :" + priority + "| Mô tả : " + descriptions + " | Trạng thái :"
                + (catalogStatus ? "Mở" : "Đóng"));
    }
}
