package microservice.ecommerce.dao;

import microservice.ecommerce.model.Product;

import java.util.List;

public interface ProductDAO {

    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product p);
}
