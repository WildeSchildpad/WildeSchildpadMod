package com.wildeschildpad.mod.init.items;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemOShovel extends ItemSpade {

	public ItemOShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.OBSIDIAN_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OBSIDIAN_SHOVEL.getRegistryName());
		
		this.setFull3D();
		
		setCreativeTab(ModClass.modTab);
	}

}
