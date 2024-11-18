package dtos;

public class OnlyPayment {
    private Long id;
    private String paymentMethod;
    private String transactionNo;
    private Double amount;

    public OnlyPayment() {
    }

    public OnlyPayment(Long id, String paymentMethod, String transactionNo, Double amount) {
        this.id = id;
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

    @Override
    public String toString() {
        return "OnlyPayment{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", transactionNo='" + transactionNo + '\'' +
                ", amount=" + amount +
                '}';
    }
}
