package ca.dosfx.juju.item;

/**
 * Created by Dos on 2016-12-11.
 */
public class ItemGemAxe extends ItemToolBase
{
    public ItemGemAxe(String gemName)
    {
        super(ItemUtil.getAxeName(gemName), new ItemAxeDummy(ToolMaterial.DIAMOND));
    }
}
