package com.wildeschildpad.mod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import com.wildeschildpad.mod.util.IMetaName;

public class CustomBlockPlanks extends Block implements IMetaName
{
	public static final PropertyEnum<CustomBlockPlanks.EnumType> VARIANT = PropertyEnum.<CustomBlockPlanks.EnumType>create("variant", CustomBlockPlanks.EnumType.class);
	
	public CustomBlockPlanks(String name) 
	{
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, CustomBlockPlanks.EnumType.BLUE));
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("axe", 0);
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((CustomBlockPlanks.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(CustomBlockPlanks.EnumType customblockplanks$enumtype : CustomBlockPlanks.EnumType.values())
		{
			items.add(new ItemStack(this, 1, customblockplanks$enumtype.getMeta()));
		}
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, CustomBlockPlanks.EnumType.byMetadata(meta));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((CustomBlockPlanks.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, (int)(getMetaFromState(world.getBlockState(pos))));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}

	public static enum EnumType implements IStringSerializable
	{
		BLUE(0, "blue"),
		RED(1, "red"),
		GREEN(2, "green"),
		BLACK(3, "black"),
		BROWN(4, "brown"),
		PURPLE(5, "purple"),
		CYAN(6, "cyan"),
		LIGHT_GRAY(7, "light_gray"),
		GRAY(8, "gray"),
		PINK(9, "pink"),
		LIME(10, "lime"),
		YELLOW(11, "yellow"),
		LIGHT_BLUE(12, "light_blue"),
		MAGENTA(13, "magenta"),
		ORANGE(14, "orange"),
		WHITE(15, "white");
		
		
		private static final CustomBlockPlanks.EnumType[] META_LOOKUP = new CustomBlockPlanks.EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name)
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName)
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta()
		{
			return this.meta;
		}
		
		public String getUnlocalizedName() 
		{
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		
		public static CustomBlockPlanks.EnumType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(CustomBlockPlanks.EnumType customblockplanks$enumtype : values())
			{
				META_LOOKUP[customblockplanks$enumtype.getMeta()] = customblockplanks$enumtype;
			}
		}
	}

	public String getSpecialName(ItemStack stack) {
		return CustomBlockPlanks.EnumType.values()[stack.getItemDamage()].getName();
	}
}
