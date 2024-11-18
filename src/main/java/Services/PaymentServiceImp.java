package Services;

import Models.Customer;
import Models.Payment;
import Repository.PaymentReppo;

import java.util.List;

public class PaymentServiceImp implements PaymentService{
    PaymentReppo paymentReppo=new PaymentReppo();

    @Override
    public void createDetails(Payment payment,Long id) {
        paymentReppo.CreateDetails(payment,id);



    }

    @Override
    public Payment getDetailsById(Long id) {
        Payment detailsById = paymentReppo.getDetailsById(id);
        return detailsById;
    }

    @Override
    public void deleteById(Long id) {
        paymentReppo.deleteById(id);
    }

    @Override
    public List<Payment> getDetailsByForiegn(Long id) {
        List<Payment> detailsByForiegn = paymentReppo.getDetailsByForiegn(id);
        return detailsByForiegn;
    }

    @Override
    public Integer getNoOfTrancEach(Long id) {
        Integer noOfTrancEach = paymentReppo.getNoOfTrancEach(id);
        return noOfTrancEach;
    }

    @Override
    public List<Payment> getByName(String name) {
        List<Payment> byName = paymentReppo.getByName(name);
        return byName;
    }
}
