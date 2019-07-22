package com.wildeschildpad.mod.init.blocks.activators;

import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDirtButton extends BlockButton{

	public BlockDirtButton(String name, float hardness, float resistance) {
		
		super(false);	
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(0.5F);
		
		
	}

	@Override
	protected void playClickSound(EntityPlayer player, World worldIn, BlockPos pos) {
		worldIn.playSound(player, pos, SoundEvents.BLOCK_GRAVEL_BREAK, SoundCategory.BLOCKS, 0.3F, 0.6F);
	}

	@Override
	protected void playReleaseSound(World worldIn, BlockPos pos) {
		worldIn.playSound(null, pos, SoundEvents.BLOCK_GRAVEL_BREAK, SoundCategory.BLOCKS, 0.3F, 0.5F);
	}

}
