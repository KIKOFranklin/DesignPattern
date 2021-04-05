package Command;

import Command.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KIKOFranklin
 * @create 2021/4/5 0005 17:02
 * @apiNote 安排 协商
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
