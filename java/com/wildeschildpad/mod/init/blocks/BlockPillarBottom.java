package com.wildeschildpad.mod.init.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

public class BlockPillarBottom extends Block{
	public BlockPillarBottom() {
		super(Material.ROCK);
		
		setUnlocalizedName(Reference.ModBlocks.PILLAR_BOTTOM.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.PILLAR_BOTTOM.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
		
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(0.0F);
		this.setLightOpacity(0);
		this.setSoundType(blockSoundType);
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}

}
