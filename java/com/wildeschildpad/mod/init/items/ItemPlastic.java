package com.wildeschildpad.mod.init.items;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;
import com.wildeschildpad.mod.handlers.EnumHandler.PlasticTypes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class ItemPlastic extends Item {

	public ItemPlastic(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		this.setHasSubtypes(true);
		
		setCreativeTab(ModClass.modTab);
	}
	
	public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> items) {
		for(int i = 0; i < PlasticTypes.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < PlasticTypes.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + PlasticTypes.values()[i].getName();
			}
			else {
				continue;
			}
		}
		return this.getUnlocalizedName()+"."+PlasticTypes.values()[stack.getItemDamage()].getName();



	}
}
