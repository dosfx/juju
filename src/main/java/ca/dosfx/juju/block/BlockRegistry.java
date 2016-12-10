package ca.dosfx.juju.block;

import ca.dosfx.juju.JuJuMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dos on 2016-12-10.
 */
public class BlockRegistry
{
    public static Block citrineOre;

    public static void preInit()
    {
        citrineOre = new Block(Material.ROCK)
                .setCreativeTab(JuJuMod.tabJuJu)
                .setHardness(1.0f)
                .setResistance(10)
                .setUnlocalizedName("citrine_ore");

        registerBlocks();
    }

    public static void registerBlocks()
    {
        registerBlock(citrineOre, "citrine_ore");
    }

    public static void registerBlock(Block block, String name)
    {
        GameRegistry.register(block, new ResourceLocation(JuJuMod.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(JuJuMod.MODID, name));
    }

    public static void registerRenders()
    {
        registerRender(citrineOre);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(JuJuMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
