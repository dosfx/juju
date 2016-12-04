package ca.dosfx.juju.proxy;

import ca.dosfx.juju.items.JuJuItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Dos on 2016-12-03.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        JuJuItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
