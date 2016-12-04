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
public class JuJuItems
{
    public static Item citrineItem;

    public static void preInit()
    {
        citrineItem = new CitrineItem();

        registerItems();
    }

    public static void registerItems()
    {
        GameRegistry.register(citrineItem, new ResourceLocation(JuJuMod.MODID, "citrine_item"));
    }

    public static void registerRenders()
    {
        registerRender(citrineItem);
    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(JuJuMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
