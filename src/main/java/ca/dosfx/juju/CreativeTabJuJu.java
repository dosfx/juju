package ca.dosfx.juju;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Dos on 2016-12-03.
 */
public class CreativeTabJuJu extends CreativeTabs
{
    public CreativeTabJuJu(int index)
    {
        super(index, "tab_" + JuJuMod.MODID);
    }

    @Override
    public Item getTabIconItem()
    {
        return Items.EMERALD;
    }
}
