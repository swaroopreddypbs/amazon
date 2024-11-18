package Services;

import Models.Customer;
import Models.Product;
import Repository.CustomerReppo;
import Exception.PhoneNoExcep;

import javax.naming.LinkLoopException;
import java.util.List;

public class CustomerServiceImp implements CustomerService{
    CustomerReppo customerReppo=new CustomerReppo();
    @Override
    public void createDetails(Customer customer ) throws PhoneNoExcep {
        String phone=customer.getPhoneNo();

        if(phone.length()==10) {
            customerReppo.CreateDetails(customer);
        }
        else {
            throw new PhoneNoExcep("phone no is not valid");


        }
    }

    @Override
    public Customer getDetailsById(Long id) {
        Customer detailsById = customerReppo.getDetailsById(id);
        return detailsById;
    }

    @Override
    public void updateById(Long id, String state) {
        customerReppo.updateById(id,state);

    }

    @Override
    public void deleteById(Long id) {
        customerReppo.deleteById(id);
    }

    @Override
    public void deleteByHql(Long id) {
        customerReppo.deleteByHql(id);
    }

    @Override
    public void setproduct(Long cuid, Long id) {
        customerReppo.setProduct(cuid,id);
    }

    @Override
    public List<Product> getproducts(Long id) {
        List<Product> product = customerReppo.getProduct(id);
        return product;
    }
}
