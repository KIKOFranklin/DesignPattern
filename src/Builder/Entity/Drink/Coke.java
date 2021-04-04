package Builder.Entity;

import Builder.ItemImpl.ColdDrink;

/**
 * @author KIKOFranklin
 * @create 2021/4/4 0004 13:28
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
