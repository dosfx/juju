package ca.dosfx.juju.item;

import com.google.common.collect.Multimap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

/**
 * Created by Dos on 2016-12-11.
 */
public abstract class ItemToolBase extends ItemBase
{
    protected ItemTool proxyTool;

    protected ItemToolBase(String name, ItemTool proxyTool)
    {
        super(name);
        this.proxyTool = proxyTool;

        // make damage work
        this.maxStackSize = 1;
        this.setMaxDamage(proxyTool.getToolMaterial().getMaxUses());
    }

    // Overrides everything the minecraft ItemTool overrides, will need to be maintained.


    @Override
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        return proxyTool.canHarvestBlock(blockIn);
    }

    @Override
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        return proxyTool.getStrVsBlock(stack, state);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        return proxyTool.hitEntity(stack, target, attacker);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
        return proxyTool.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }

    @Override
    public boolean isFull3D()
    {
        return proxyTool.isFull3D();
    }

    @Override
    public int getItemEnchantability()
    {
        return proxyTool.getItemEnchantability();
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return proxyTool.getIsRepairable(toRepair, repair);
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        return proxyTool.getItemAttributeModifiers(equipmentSlot);
    }

    @Override
    public int getHarvestLevel(ItemStack stack, String toolClass)
    {
        return proxyTool.getHarvestLevel(stack, toolClass);
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack)
    {
        return proxyTool.getToolClasses(stack);
    }
}