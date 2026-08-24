public class UpiPayment extends Payment {
    private String upiId;

    @Override
    public void pay(){
        System.out.println("Payment done by Upi Id");
    }
}
