package com.wildeschildpad.mod.init.items;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemOSword extends ItemSword {

	public ItemOSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.OBSIDIAN_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OBSIDIAN_SWORD.getRegistryName());
		
		this.setFull3D();
		
		setCreativeTab(ModClass.modTab);
	}

}
