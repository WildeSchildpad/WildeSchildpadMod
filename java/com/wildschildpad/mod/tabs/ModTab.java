package com.wildschildpad.mod.tabs;

import com.wildeschildpad.mod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs{

	
public ModTab(String label) {
		super("modTab");
		}
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.obsidian_ingot);
		}
	};
