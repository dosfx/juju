package ca.dosfx.juju.item;

import net.minecraft.item.ItemSpade;

/**
 * Created by Dos on 2016-12-11.
 */
public class ItemGemSpade extends ItemToolBase
{
    public ItemGemSpade(String gemName)
    {
        super(ItemUtil.getSpadeName(gemName), new ItemSpade(ToolMaterial.DIAMOND));
    }
}
