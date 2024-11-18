package Services;

import Models.Customer;
import Models.Product;
import Exception.PhoneNoExcep;

import java.util.List;

public interface CustomerService {
    void createDetails(Customer customer ) throws PhoneNoExcep;
    Customer getDetailsById(Long id);
    void updateById(Long id,String state);
    void deleteById(Long id);
    void deleteByHql(Long id);
    void setproduct(Long cuid,Long id);
    List<Product> getproducts(Long id);
}
