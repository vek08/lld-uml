import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name){
        this.name = name;
        orders = new ArrayList<>();
    }

    public void addOrder(Order o){
        orders.add(o);
    }

}
