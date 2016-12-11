package ca.dosfx.juju.item;

/**
 * Created by Dos on 2016-12-08.
 */
public class ItemGemPickaxe extends ItemToolBase
{
    public ItemGemPickaxe(String gemName)
    {
        super(ItemUtil.getPickaxeName(gemName), new ItemPickaxeDummy(ToolMaterial.DIAMOND));
    }
}
