package ca.dosfx.juju.item;

import ca.dosfx.juju.JuJuMod;
import net.minecraft.item.Item;

/**
 * Created by Dos on 2016-12-11.
 */
public abstract class ItemBase extends Item
{
    protected ItemBase(String name)
    {
        setCreativeTab(JuJuMod.CREATIVE_TAB);
        setRegistryName(JuJuMod.MODID, name);
        setUnlocalizedName(JuJuMod.getUnlocalizedName(name));
    }

    public String getModelPath()
    {
        // trim off the "item."
        return getUnlocalizedName().substring(5);
    }
}
