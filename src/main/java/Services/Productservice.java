package Services;

import Models.Customer;
import Models.Product;

import java.util.List;

public interface Productservice {
    void createDetails(Product product);
    List<Customer> getcustomers(Long id);
}
