package com.wildeschildpad.mod.proxy;

import com.wildeschildpad.mod.Reference;
import com.wildeschildpad.mod.init.ModBlocks;
import com.wildeschildpad.mod.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

public class ClientProxy implements CommonProxy {

	
	
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}
	
	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(ModItems.plastic, new ResourceLocation(Reference.MOD_ID, "plastic_transparent"), new ResourceLocation(Reference.MOD_ID, "plastic_white"), new ResourceLocation(Reference.MOD_ID, "plastic_black"), new ResourceLocation(Reference.MOD_ID, "plastic_blue"), new ResourceLocation(Reference.MOD_ID, "plastic_red"), new ResourceLocation(Reference.MOD_ID, "plastic_green"), new ResourceLocation(Reference.MOD_ID, "plastic_lime"), new ResourceLocation(Reference.MOD_ID, "plastic_pink"), new ResourceLocation(Reference.MOD_ID, "plastic_yellow"), new ResourceLocation(Reference.MOD_ID, "plastic_cyan"), new ResourceLocation(Reference.MOD_ID, "plastic_light_blue"), new ResourceLocation(Reference.MOD_ID, "plastic_light_gray") , new ResourceLocation(Reference.MOD_ID, "plastic_gray"), new ResourceLocation(Reference.MOD_ID, "plastic_magenta"), new ResourceLocation(Reference.MOD_ID, "plastic_purple") , new ResourceLocation(Reference.MOD_ID, "plastic_brown"), new ResourceLocation(Reference.MOD_ID, "plastic_orange"));
	}

}
