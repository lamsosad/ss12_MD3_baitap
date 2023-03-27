package bai1_Arraylist_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "iphone 5", 200));
        productList.add(new Product(2, "iphone 14", 999));
        productList.add(new Product(3, "iphone 12", 799));
        productList.add(new Product(4, "iphone X", 399));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(id);
            }
        }
    }

    @Override
    public Product searchByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                return productList.get(i);
            }
        }
        System.out.println("Không có sản phẩm!");
        return null;
    }
}
