package com.wildeschildpad.mod.init.items;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;


public class ItemCheese extends ItemFood{

	public ItemCheese() {
		super(8, 2, true);
		setUnlocalizedName(Reference.ModItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.CHEESE.getRegistryName());
		setCreativeTab(ModClass.modTab);
	}

}
