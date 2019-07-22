package com.wildeschildpad.mod.init.blocks.activators;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockObsidianPressurePlate extends BlockPressurePlate{

public BlockObsidianPressurePlate(String name, float hardness, float resistance) {
		
		super(Material.ROCK, Sensitivity.EVERYTHING);	
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(50F);
		
		
	}

	@Override
		protected void playClickOnSound(World worldIn, BlockPos color) {
			
		worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
			super.playClickOnSound(worldIn, color);
		}
	
	@Override
		protected void playClickOffSound(World worldIn, BlockPos color) {
		
		worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
			super.playClickOffSound(worldIn, color);
		}
	}
