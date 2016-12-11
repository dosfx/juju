package ca.dosfx.juju.item;

import net.minecraft.item.ItemSword;

/**
 * Created by Dos on 2016-12-11.
 */
public class ItemGemSword extends ItemToolBase
{
    public ItemGemSword(String gemName)
    {
        super(ItemUtil.getSwordName(gemName), new ItemSword(ToolMaterial.DIAMOND));
    }
}
