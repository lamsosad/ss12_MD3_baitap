package bai1_Arraylist_linkedlist;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void deleteById(int id);

    Product searchByName(String name);
}
