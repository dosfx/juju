package ca.dosfx.juju.proxy;

import ca.dosfx.juju.JuJuItems;
import ca.dosfx.juju.item.ItemBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dos on 12/3/2016.
 */
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        registerItem(JuJuItems.CITRINE_GEM);
        registerItem(JuJuItems.CITRINE_PICKAXE);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

    public void registerItem(ItemBase item)
    {
        GameRegistry.register(item);
    }
}
