package com.example.demo.Contoller;

import com.example.demo.Model.Products;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Products>> getAllProducts(){
        List<Products> product=productService.getAllProducts();
        if (product==null){
            return new ResponseEntity<>(product,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable int id){
        Products product=productService.getProductById(id);
        if (product==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(product);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Products> addProduct(@RequestBody Products prod) {
        Products product = productService.addProduct(prod);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }


    // localhost:8080/deleteProduct/1
    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<Products> deleteProduct(@PathVariable int id){
        Products product = productService.deleteProduct(id);
        if(product != null){
            return new ResponseEntity<>(product,HttpStatus.GONE);
        }
        return new ResponseEntity<>(product,HttpStatus.NOT_FOUND);
    }

}
