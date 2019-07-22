package com.wildeschildpad.mod.init.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

import com.wildeschildpad.mod.ModClass;

public class BlockDirtStairs extends BlockStairs{

	public BlockDirtStairs(String name, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		
		this.setHardness(0.5F);
		this.setResistance(0.0F);
		
		setCreativeTab(ModClass.modTab);
		
		
	}

}
