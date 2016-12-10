package ca.dosfx.juju.proxy;

import ca.dosfx.juju.JuJuMod;
import ca.dosfx.juju.block.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dos on 2016-12-03.
 */
public class ClientProxy extends CommonProxy
{
    private List<Item> registerItems = new ArrayList<Item>();

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        for (Item item : registerItems)
        {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                    new ModelResourceLocation(JuJuMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        }

        BlockRegistry.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    public void registerItem(Item item)
    {
        registerItems.add(item);
    }
}
