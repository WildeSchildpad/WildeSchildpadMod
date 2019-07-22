package com.wildeschildpad.mod.init.items;

import net.minecraft.item.ItemPickaxe;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

public class ItemOPickaxe extends ItemPickaxe {

	public ItemOPickaxe(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(Reference.ModItems.OBSIDIAN_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OBSIDIAN_PICKAXE.getRegistryName());
		this.setFull3D();
		
		setCreativeTab(ModClass.modTab);
	}

}
