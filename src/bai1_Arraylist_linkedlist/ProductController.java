package bai1_Arraylist_linkedlist;

import java.util.List;

public class ProductController {
    IProductService productService = new ProductServiceIMPL();

    public List<Product> showListProduct() {
        return productService.findAll();
    }

    public void creatProduct(Product product) {
        productService.save(product);
    }

    public void deleteProduct(int id) {
        productService.deleteById(id);
    }


}
