package ca.dosfx.juju.items;

import ca.dosfx.juju.JuJuMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dos on 2016-12-03.
 */
public class ItemRegistry
{
    // Gems
    public static Item citrineItem;

    // Swords
    public static Item citrineSword;

    public static void preInit()
    {
        citrineItem =  registerItem(new Item(), ItemNames.CitrineItem);
        citrineSword = registerItem(new ItemSword(Item.ToolMaterial.DIAMOND), ItemNames.CitrineSword);
    }

    private static Item registerItem(Item item, String name)
    {
        item.setCreativeTab(JuJuMod.tabJuJu);
        item.setUnlocalizedName(name);

        JuJuMod.proxy.registerItem(item);

        return GameRegistry.register(item, new ResourceLocation(JuJuMod.MODID, name));
    }
}
