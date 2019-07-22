package com.wildeschildpad.mod.init.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;
import com.wildeschildpad.mod.init.ModBlocks;
import com.wildeschildpad.mod.init.ModItems;

public class BlockObsidianOreEnd extends Block{

	public BlockObsidianOreEnd() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.OBSIDIAN_ORE_END.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.OBSIDIAN_ORE_END.getRegistryName());
		setCreativeTab(ModClass.modTab);
		
		
		//Block Properties
		
		this.setHardness(20.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.3F);
		this.setLightOpacity(10);
		this.setSoundType(blockSoundType);
		
		//16 - X = Y
	}
	
	//Transparent texture block
	public boolean isOpaqueCube() {
		return false;
	}
	
		//Item which the block drops
	public Item getItemDropped(int metadeta, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.obsidian_ore_end);
				
	}
			
	//How many items the block drops
	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}

}
