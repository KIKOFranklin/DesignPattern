package Builder.Entity;

import Builder.ItemImpl.Burger;

/**
 * @author KIKOFranklin
 * @create 2021/4/4 0004 13:28
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 20.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
