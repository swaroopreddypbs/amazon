package Services;

import Models.Customer;
import Models.Payment;

import java.util.List;

public interface PaymentService {
    void createDetails(Payment payment,Long id);
    Payment getDetailsById(Long id);
    void deleteById(Long id);
    List<Payment> getDetailsByForiegn(Long id);
   Integer getNoOfTrancEach(Long id);
    List<Payment> getByName(String name);


}
