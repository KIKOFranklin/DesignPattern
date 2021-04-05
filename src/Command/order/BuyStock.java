package Command;



/**
 * @author KIKOFranklin
 * @create 2021/4/5 0005 16:58
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
