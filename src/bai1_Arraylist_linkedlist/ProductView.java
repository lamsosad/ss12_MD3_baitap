package bai1_Arraylist_linkedlist;

import java.util.*;

public class ProductView {
    ProductController productController = new ProductController();
    List<Product> productsList = productController.showListProduct();

    public void showListProduct() {
        System.out.println("----ID----NAME----PRICE----");
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println("    " + productsList.get(i).getId() + "   " + productsList.get(i).getName() + "   " + productsList.get(i).getPrice() + "$");
        }
        System.out.println("---------------------------");


    }

    public void createProduct() {
        int id = productsList.get(productsList.size() - 1).getId() + 1;
        System.out.print("Nhâp tên sản phẩm mới: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Nhâp giá sản phẩm mới: ");
        int price = new Scanner(System.in).nextInt();
        Product product = new Product(id, name, price);
        productController.creatProduct(product);


    }

    public void deleteProduct() {
        System.out.println("Nhập id sản phẩm muốn xóa: ");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                productController.deleteProduct(i);
            }
        }
    }

    public void editProduct() {
        System.out.println("Nhập id sản phẩm muốn sửa: ");
        int id = new Scanner(System.in).nextInt();

        for (int i = 0; i < productsList.size(); i++) {
            if (id == productsList.get(i).getId()) {
                System.out.println("Tên cũ: (" + productsList.get(i).getName() + ")  |Nhập tên mơi");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Giá cũ: (" + productsList.get(i).getPrice() + ")  |Nhập giá mới");
                int price = new Scanner(System.in).nextInt();
                productsList.get(i).setId(id);
                productsList.get(i).setName(name);
                productsList.get(i).setPrice(price);
                break;
            }
        }
    }

    public void searchProduct() {
        ArrayList<Product> listSearch = new ArrayList<>();
        System.out.println("Nhập tên sản phẩm muốn tim kiếm: ");
        String name = new Scanner(System.in).nextLine();
        for (Product product : productsList) {
            if (product.getName().contains(name)) {
                listSearch.add(product);
            }
        }
        System.out.println(listSearch);
    }
    public void sortProductByPrice(){
        ArrayList<Product> products = new ArrayList<>(productsList);
        Collections.sort(products);
        System.out.println("*******************Sắp xếp theo giá tăng dần********************");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        System.out.println("****************************************************************\n");

    }
}
