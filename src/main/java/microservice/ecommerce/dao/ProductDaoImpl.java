package microservice.ecommerce.dao;

import microservice.ecommerce.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDAO {

    public static List<Product> produits = new ArrayList<>();

    static{
        produits.add(new Product(1,"ordinateur", 1000));
        produits.add(new Product(2,"Machine à café", 50));
        produits.add(new Product(3,"Lave-vaisselle", 300));
        produits.add(new Product(4,"Télévision", 850));
    }

    @Override
    public List<Product> findAll() {
        return produits;
    }

    @Override
    public Product findById(int id) {
        for (Product produit : produits) {
            if(produit.getId()==id){
                return produit;
            }
        }
        return null;
    }

    @Override
    public Product save(Product p) {

        produits.add(p);

        return p;
    }
}
