package ca.dosfx.juju.item;

/**
 * Created by Dos on 2016-12-11.
 */
public class ItemGem extends ItemBase
{
    public ItemGem(String gemName)
    {
        super(ItemUtil.getGemName(gemName));
    }
}
