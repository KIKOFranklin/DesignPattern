package Builder.Entity;

import Builder.ItemImpl.Burger;

/**
 * @author KIKOFranklin
 * @create 2021/4/4 0004 13:25
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
