public class PaymentService  {
    
    private Payment payment;

    public PaymentService(Payment p){
        this.payment =p;
    }

    public void processPayment(){
        payment.pay();
    }
}
