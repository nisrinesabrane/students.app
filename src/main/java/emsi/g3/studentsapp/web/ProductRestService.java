package emsi.g3.studentsapp.web;

import emsi.g3.studentsapp.entities.Product;
import emsi.g3.studentsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductRestService {
    @Autowired //pour l'injenction
    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product>products(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id){
        return productRepository.findById(id).get();
    }
}
