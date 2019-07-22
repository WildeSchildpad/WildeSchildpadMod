package com.wildeschildpad.mod.init.items;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemRuby extends Item {
	
	public ItemRuby() {
		setUnlocalizedName(Reference.ModItems.RUBY.getUnlocalizedName());
		setRegistryName(Reference.ModItems.RUBY.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
			
	}
	
}
