public class CreditCardPayment extends Payment{
    private String cardNo;
    
    @Override
    public void pay(){
            System.out.println("Payment done by credit card");
    }
}
