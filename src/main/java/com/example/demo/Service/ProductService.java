package com.example.demo.Service;
import com.example.demo.Model.Products;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {
    //List<Products> products = new ArrayList<>();
    @Autowired
    ProductRepository products;
    public List<Products> getAllProducts(){
        Iterator<Products> it = products.findAll().iterator();
        List<Products> list = new ArrayList<>();
        while(it.hasNext()){
            list.add(it.next());
        }
        return list;
    }

    public Products addProduct(Products prod) {
        products.save(prod);
        return prod;
    }

    public Products deleteProduct(int proId){
        products.deleteById(proId);
//        for(Products product : products){
//            if(product.getProductId() == proId){
//                products.delete(product);
//                return product;
//            }
//        }
            return null;
    }

    public Products getProductById(int id) {
        return products.findById(id).orElse(null);
//        for(Products product : products){
//            if(product.getProductId() == id){
//                return product;
//            }
//        }
//        return null;
    }
}
