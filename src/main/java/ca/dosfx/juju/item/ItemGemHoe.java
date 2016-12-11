package ca.dosfx.juju.item;

import net.minecraft.item.ItemHoe;

/**
 * Created by Dos on 2016-12-11.
 */
public class ItemGemHoe extends ItemToolBase
{
    public ItemGemHoe(String gemName)
    {
        super(ItemUtil.getHoeName(gemName), new ItemHoe(ToolMaterial.DIAMOND));
    }
}
