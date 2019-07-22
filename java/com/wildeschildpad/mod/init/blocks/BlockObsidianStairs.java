package com.wildeschildpad.mod.init.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

import com.wildeschildpad.mod.ModClass;

public class BlockObsidianStairs extends BlockStairs{

	public BlockObsidianStairs(String name, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		
		this.setHardness(3.0F);
		this.setResistance(20);
		
		setCreativeTab(ModClass.modTab);
		
		
	}

}
