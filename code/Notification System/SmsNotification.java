public class SmsNotification implements Notification{
    private String phoneNumber;

    public SmsNotification(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message){
        System.out.println("Sending SMS" + message);
    }
}