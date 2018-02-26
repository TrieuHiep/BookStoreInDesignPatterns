package state;

public class StateTest {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        OrderState orderState = new OrderPending();
        orderContext.setOrderState(orderState);
    }
}
