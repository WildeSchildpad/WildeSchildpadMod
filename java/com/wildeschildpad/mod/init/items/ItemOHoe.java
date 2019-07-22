package com.wildeschildpad.mod.init.items;

import net.minecraft.item.ItemHoe;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

public class ItemOHoe extends ItemHoe {

	public ItemOHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.OBSIDIAN_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OBSIDIAN_HOE.getRegistryName());

		this.setFull3D();
		
		setCreativeTab(ModClass.modTab);
	}

}
