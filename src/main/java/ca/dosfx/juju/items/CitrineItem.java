package ca.dosfx.juju.items;

import ca.dosfx.juju.JuJuMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Dos on 2016-12-03.
 */
public class CitrineItem extends Item
{
    public CitrineItem()
    {
        setCreativeTab(JuJuMod.tabJuJu);
        setUnlocalizedName("citrine_item");
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("Citrine Tooltip");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
}
