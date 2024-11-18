package Models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentMethod;
    private String transactionNo;
    private Double amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private Customer customer;


    public Payment() {
    }

    public Payment(String paymentMethod, String transactionNo, Double amount) {
        this.paymentMethod = paymentMethod;
        this.transactionNo = transactionNo;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", transactionNo='" + transactionNo + '\'' +
                ", amount=" + amount +
                ", customer=" + customer +
                '}';
    }
}
