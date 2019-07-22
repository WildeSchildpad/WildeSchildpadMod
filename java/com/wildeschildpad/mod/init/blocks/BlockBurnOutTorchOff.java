package com.wildeschildpad.mod.init.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;

import com.google.common.base.Predicate;
import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;
import com.wildeschildpad.mod.init.ModBlocks;

public class BlockBurnOutTorchOff extends Block {
	
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0.40625D, 0, 0.40625D, 0.59375D, 0.59375D, 0.59375D);
	public BlockBurnOutTorchOff() {
		super(Material.CIRCUITS);
		
		setUnlocalizedName(Reference.ModBlocks.BURN_OUT_TORCH_OFF.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BURN_OUT_TORCH_OFF.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
		
		this.setHardness(0F);
		this.setResistance(0F);
		this.setLightLevel(0.0F);
		this.setLightOpacity(0);
		this.setSoundType(blockSoundType);
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		Block blk=ModBlocks.burn_torch;
		BlockPos pos1=new BlockPos(pos.getX(), pos.getY(), pos.getZ());
		IBlockState state1=blk.getDefaultState();
		if(playerIn.inventory.getCurrentItem().getItem() == Items.FLINT_AND_STEEL){
			worldIn.setBlockState(pos1, state1);
			worldIn.playSound(playerIn, pos1, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		return enableStats;
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
