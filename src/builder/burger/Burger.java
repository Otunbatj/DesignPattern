package builder.burger;

import builder.items.Item;
import builder.packing.Packing;
import builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
