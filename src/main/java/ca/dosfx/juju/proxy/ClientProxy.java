package ca.dosfx.juju.proxy;

import ca.dosfx.juju.JuJuItems;
import ca.dosfx.juju.item.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;

/**
 * Created by Dos on 2016-12-03.
 */
public class ClientProxy extends CommonProxy
{
    private ArrayList<ItemBase> registeredItems;

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        // array tracks items registered in the common proxy
        registeredItems = new ArrayList<ItemBase>();

        super.preInit(event);

        // register models for everything
        for (ItemBase item : registeredItems)
        {
            registerItemModel(item);
        }

        // don't need this anymore, may as well clean up
        registeredItems = null;
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }

    @Override
    public void registerItem(ItemBase item)
    {
        // save the item
        registeredItems.add(item);

        // pass to common to register
        super.registerItem(item);
    }

    private void registerItemModel(ItemBase item)
    {
        // ItemBase provides the model path
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getModelPath(), "inventory"));
    }
}
