package ca.dosfx.juju;

import ca.dosfx.juju.block.BlockRegistry;
import ca.dosfx.juju.item.ItemRegistry;
import ca.dosfx.juju.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

/**
 * Created by Dos on 2016-12-03.
 */
@Mod(modid = JuJuMod.MODID, version = JuJuMod.VERSION, name = JuJuMod.NAME)
public class JuJuMod
{
    public static final String MODID = "jujumod";
    public static final String VERSION = "1.0";
    public static final String NAME = "JuJu";

    @SidedProxy(clientSide = "ca.dosfx.juju.proxy.ClientProxy", serverSide = "ca.dosfx.juju.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JuJuMod instance;

    public static CreativeTabJuJu tabJuJu;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabJuJu = new CreativeTabJuJu(CreativeTabs.getNextID());

        ItemRegistry.preInit();
        BlockRegistry.preInit();

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);

    }
}
