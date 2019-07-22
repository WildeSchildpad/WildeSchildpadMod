package com.wildeschildpad.mod.init.items;

import java.util.Set;

import com.google.common.collect.Sets;
import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemOAxe extends ItemTool 
{
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	   

    public ItemOAxe(String name, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
      
				setUnlocalizedName(Reference.ModItems.OBSIDIAN_AXE.getUnlocalizedName());
				setRegistryName(Reference.ModItems.OBSIDIAN_AXE.getRegistryName());
			
				setCreativeTab(ModClass.modTab);
	
				this.setFull3D();
    }

    

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

	
	

}