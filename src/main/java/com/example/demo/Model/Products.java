package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private long productPrice;
    public Products(){

    }
    public Products(int productId, String productName, long productPrice) {
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }
    public Products( String productName, long productPrice) {
        this.productName=productName;
        this.productPrice=productPrice;
    }

    public void setProductId(int productId){
        this.productId=productId;

    }
    public int getProductId(){
        return productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductPrice(long productPrice){
        this.productPrice=productPrice;
    }
    public long getProductPrice(){
        return productPrice;
    }

}
