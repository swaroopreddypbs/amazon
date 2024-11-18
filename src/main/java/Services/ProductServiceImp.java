package Services;

import Models.Customer;
import Models.Product;
import Repository.ProductReppo;

import java.util.List;

public class ProductServiceImp implements Productservice{
    ProductReppo productReppo=new ProductReppo();
    @Override
    public void createDetails(Product product) {
        productReppo.CreateDetails(product);

    }

    @Override
    public List<Customer> getcustomers(Long id) {
        List<Customer> getcustomers = productReppo.getcustomers(id);
        return getcustomers;
    }
}
