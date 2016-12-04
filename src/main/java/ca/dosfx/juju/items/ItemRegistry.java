package ca.dosfx.juju.items;

import ca.dosfx.juju.JuJuMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dos on 2016-12-03.
 */
public class ItemRegistry
{
    public static Item citrineItem;

    public static void preInit()
    {
        citrineItem =  registerItem(new Item(), ItemNames.CitrineItem);
    }

    private static Item registerItem(Item item, String name)
    {
        item.setCreativeTab(JuJuMod.tabJuJu);
        item.setUnlocalizedName(name);

        JuJuMod.proxy.registerItem(item);

        return GameRegistry.register(item, new ResourceLocation(JuJuMod.MODID, ItemNames.CitrineItem));
    }
}
