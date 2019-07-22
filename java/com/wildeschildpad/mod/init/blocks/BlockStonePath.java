package com.wildeschildpad.mod.init.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

public class BlockStonePath extends Block {
	
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0D, 0, 0D, 1D, 0.03125D, 1D);
	public BlockStonePath() {
		super(Material.ROCK);
		
		setUnlocalizedName(Reference.ModBlocks.STONE_PATH.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.STONE_PATH.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
		
		this.setHardness(20.0F);
		this.setHarvestLevel("pickaxe", 2);
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
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOX_BOUNDING;
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean isActualState) {
		
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, BOX_BOUNDING);
	}

}
