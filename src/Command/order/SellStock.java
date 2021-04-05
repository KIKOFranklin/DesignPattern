package Command;

/**
 * @author KIKOFranklin
 * @create 2021/4/5 0005 17:00
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
