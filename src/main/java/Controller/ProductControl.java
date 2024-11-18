package Controller;

import Models.Customer;
import Models.Product;
import Services.ProductServiceImp;
import Services.Productservice;

import java.util.List;

public class ProductControl {


    public static void main(String[] args) {
        Productservice productservice=new ProductServiceImp();
        Product product=new Product("iphone",50000D);
        Product product1=new Product("moto",25000D);
        Product product2=new Product("mi",5000D);
        Product product3=new Product("dell",90000D);
        Product product4=new Product("pen",90D);
        Long id=1L;
//        productservice.createDetails(product);
//        productservice.createDetails(product1);
//        productservice.createDetails(product2);
//        productservice.createDetails(product3);
//        productservice.createDetails(product4);
        List<Customer> getcustomers = productservice.getcustomers(id);
        System.out.println(getcustomers);
    }
}
