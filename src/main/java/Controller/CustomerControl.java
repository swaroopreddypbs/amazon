package Controller;

import Models.Address;
import Models.Customer;
import Models.Product;
import Services.CustomerService;
import Services.CustomerServiceImp;
import Exception.PhoneNoExcep;
import java.util.ArrayList;
import java.util.List;

public class CustomerControl {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerServiceImp();
        Customer customer=new Customer("swaroopreddy","swaroopreddy@gmail.com","9133003310");
        Customer customer1=new Customer("jaswanth","jaswanth@gmail.com","99636353");
        Customer customer2=new Customer("surya","rajusurya@gmail.com","76720876");

//        customerService.createDetails(customer2);


//        customerService.createDetails(customer1);
        Long id=1L;
        Long cuid=2L;

//        String state="tg";
//        Customer detailsById = customerService.getDetailsById(id);
//        System.out.println(detailsById);
//        Address address = detailsById.getAddress();
//        System.out.println(address);
//        customerService.updateById(id,state);
//        customerService.deleteById(id);
//        customerService.deleteByHql(id);
//        customerService.deleteById(id);
//        customerService.setproduct(cuid,id);
//        List<Product> getproducts = customerService.getproducts(id);
//        System.out.println(getproducts);
        try {
            customerService.createDetails(customer2);
        }
        catch (PhoneNoExcep e){
            System.out.println(e);
        }



    }




}
