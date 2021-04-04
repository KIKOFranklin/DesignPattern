package Builder.Entity;

import Builder.ItemImpl.ColdDrink;

/**
 * @author KIKOFranklin
 * @create 2021/4/4 0004 13:29
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
