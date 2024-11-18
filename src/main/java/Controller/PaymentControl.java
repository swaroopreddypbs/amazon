package Controller;

import Models.Customer;
import Models.Payment;
import Services.PaymentService;
import Services.PaymentServiceImp;

import java.util.List;

public class PaymentControl {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentServiceImp();
//        Customer customer=new Customer("swaroop","swaroop@gmail.com","9133003310");
        Long id=1L;
        Long id1=2L;
        Long id2=3L;
        Long id3=4L;
        Payment payment=new Payment("phonepay","12342121",50000D);
        Payment payment1=new Payment("gpay","12323221",52340D);
        Payment payment2=new Payment("paytm","4565263",354252D);
        Payment payment3=new Payment("icpay","76563527",263653D);
        Payment payment4=new Payment("paytm","9865363",252D);
        Payment payment5=new Payment("icpay","0273637",3653D);


//        paymentService.createDetails(payment5,id2);
//        Payment detailsById = paymentService.getDetailsById(id3);
//        System.out.println(detailsById);
//        List<Payment> detailsByForiegn = paymentService.getDetailsByForiegn(id);
//        System.out.println(detailsByForiegn);
//        Integer noOfTrancEach = paymentService.getNoOfTrancEach(id2);
//        System.out.println(noOfTrancEach);

    }
}
