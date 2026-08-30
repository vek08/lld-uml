import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<OrderItem> items;

    public Order(int id,Customer customer){
        this.orderId = id;
        this.customer=customer;
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public Customer getCustomer(){
        return customer;
    }

}
