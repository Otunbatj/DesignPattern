package builder.cold_drink;

import builder.items.Item;
import builder.packing.Bottle;
import builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
