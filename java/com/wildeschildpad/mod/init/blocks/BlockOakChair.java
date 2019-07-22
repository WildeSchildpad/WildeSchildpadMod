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

public class BlockOakChair extends Block{
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0.25D, 0, 0.25D, 0.75D, 1.0D, 0.75D);
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public BlockOakChair() {
		super(Material.WOOD);
		
		setUnlocalizedName(Reference.ModBlocks.OAK_CHAIR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.OAK_CHAIR.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
		
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("axe", 1);
		this.setLightLevel(0.0F);
		this.setLightOpacity(0);
		this.setSoundType(blockSoundType);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING,  EnumFacing.NORTH));
		
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {

		EnumFacing enumfacing = EnumFacing.getFront(meta);
		
		if (enumfacing.getAxis() == EnumFacing.Axis.Y)
		{
			enumfacing = EnumFacing.UP;
		}
		
		return this.getDefaultState().withProperty(FACING, enumfacing);
	}
	@Override
	public int getMetaFromState(IBlockState state) {
		
		EnumFacing facing=state.getValue(FACING);
		
		int meta =((EnumFacing)state.getValue(FACING)).getIndex();
		
		return meta;
	}
	
	@Override
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
		
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
