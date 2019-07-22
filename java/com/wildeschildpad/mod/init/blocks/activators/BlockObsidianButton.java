package com.wildeschildpad.mod.init.blocks.activators;

import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockObsidianButton extends BlockButton{

	public BlockObsidianButton(String name, float hardness, float resistance) {
		
		super(false);	
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(50F);
		
		
	}

	@Override
	protected void playClickSound(EntityPlayer player, World worldIn, BlockPos pos) {
		worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
	}

	@Override
	protected void playReleaseSound(World worldIn, BlockPos pos) {
		worldIn.playSound(null, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
	}

}
