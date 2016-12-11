package ca.dosfx.juju.item;

import net.minecraft.item.*;

/**
 * Created by Dos on 2016-12-08.
 */
public class GemItemCollection
{
    private Item axeItem;
    private Item gemItem;
    private Item hoeItem;
    private Item pickaxeItem;
    private Item spadeItem;
    private Item swordItem;

    public GemItemCollection(String name)
    {
        /*axeItem = ItemRegistry.registerItem(new GemAxe(Item.ToolMaterial.DIAMOND), ItemUtil.getAxeName(name));
        gemItem =  ItemRegistry.registerItem(new Item(), ItemUtil.getGemUnlocalizedName(name));
        hoeItem = ItemRegistry.registerItem(new ItemHoe(Item.ToolMaterial.DIAMOND), ItemUtil.getHoeName(name));
        pickaxeItem = ItemRegistry.registerItem(new GemPickaxe(Item.ToolMaterial.DIAMOND), ItemUtil.getPickaxeName(name));
        spadeItem = ItemRegistry.registerItem(new ItemSpade(Item.ToolMaterial.DIAMOND), ItemUtil.getSpadeName(name));
        swordItem = ItemRegistry.registerItem(new ItemSword(Item.ToolMaterial.DIAMOND), ItemUtil.getSwordName(name));*/
    }

    public Item getAxeItem()
    {
        return axeItem;
    }

    public Item getGemItem()
    {
        return gemItem;
    }

    public Item getHoeItem()
    {
        return hoeItem;
    }

    public Item getPickaxeItem()
    {
        return pickaxeItem;
    }

    public Item getSpadeItem()
    {
        return spadeItem;
    }

    public Item getSwordItem()
    {
        return swordItem;
    }
}
