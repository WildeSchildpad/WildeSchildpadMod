package com.wildeschildpad.mod.init.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.wildeschildpad.mod.Reference;
import com.wildeschildpad.mod.init.ModBlocks;

public class BlockBurnOutTorch extends Block {
	
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0.40625D, 0, 0.40625D, 0.59375D, 0.59375D, 0.59375D);
	public BlockBurnOutTorch() {
		super(Material.CIRCUITS);
		
		setUnlocalizedName(Reference.ModBlocks.BURN_OUT_TORCH.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BURN_OUT_TORCH.getRegistryName());
		
		this.setHardness(0F);
		this.setResistance(0F);
		this.setLightLevel(0.875F);
		this.setLightOpacity(0);
		this.setSoundType(blockSoundType);
	}
	
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn) {
		int tick = 0;
		Block blk=ModBlocks.burn_torch_off;
		BlockPos pos0=new BlockPos(pos.getX(), pos.getY(), pos.getZ());
		IBlockState state0=blk.getDefaultState();
		if(tick != 5)
		{
			tick++;
			return;
		}
		if(tick >= 5)
		{
			worldIn.setBlockState(pos0, state0);
			return;
		}
	}
	
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, net.minecraft.util.EnumHand hand, net.minecraft.util.EnumFacing facing, float hitX, float hitY, float hitZ) {
		Block blk=ModBlocks.burn_torch_off;
		BlockPos pos0=new BlockPos(pos.getX(), pos.getY(), pos.getZ());
		IBlockState state0=blk.getDefaultState();
		if(playerIn.inventory.getCurrentItem().getItem() == Items.WATER_BUCKET)
		{
			worldIn.setBlockState(pos0, state0);
			worldIn.playSound(playerIn, pos0, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		 
		return enableStats;
	 };
	
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
