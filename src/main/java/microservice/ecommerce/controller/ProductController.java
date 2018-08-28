package microservice.ecommerce.controller;

import microservice.ecommerce.dao.ProductDAO;
import microservice.ecommerce.dao.ProductDaoImpl;
import microservice.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductDAO productDao;


    @GetMapping(value = "Produits")
    public List<Product> listeProduit(){
        return productDao.findAll();
    }

    @GetMapping(value = "Produits/{id}")
    public Product afficherProduit(@PathVariable int id){

        return  null;
    }

    @PostMapping(value = "/Produit")
    public void ajouterProduit (@RequestBody Product p){
        productDao.save(p);
    }
}
