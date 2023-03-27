package bai1_Arraylist_linkedlist;


import java.util.Scanner;

public class Bai1 {


    public static Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public Bai1() {
        int choseMenu;
        while (true) {
            System.out.println("***********************************************{Product}************************************************");
            System.out.print("1. Hiển thị   ");
            System.out.print("2. Thêm sản phẩm   ");
            System.out.print("3. Xoá sản phẩm   ");
            System.out.print("4. Sửa sản phẩm   ");
            System.out.print("5. Tìm kiếm   ");
            System.out.print("6. Sắp xếp   ");
            System.out.print("7. Thoát\n");
            System.out.println("********************************************************************************************************");
            choseMenu = scanner().nextInt();


            switch (choseMenu) {
                case 1:
                    new ProductView().showListProduct();
                    break;
                case 2:
                    new ProductView().createProduct();
                    break;
                case 3:
                    new ProductView().deleteProduct();
                    break;
                case 4:
                    new ProductView().editProduct();
                    break;
                case 5:
                    new ProductView().searchProduct();
                    break;
                case 6:
                    new ProductView().sortProductByPrice();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("no choice");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Bai1();
    }
}
