package com.wildeschildpad.mod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.wildeschildpad.mod.Reference;
import com.wildeschildpad.mod.handlers.EnumHandler;
import com.wildeschildpad.mod.init.items.ItemCheese;
import com.wildeschildpad.mod.init.items.ItemEmeraldSword;
import com.wildeschildpad.mod.init.items.ItemOAxe;
import com.wildeschildpad.mod.init.items.ItemOHoe;
import com.wildeschildpad.mod.init.items.ItemOIngot;
import com.wildeschildpad.mod.init.items.ItemOPickaxe;
import com.wildeschildpad.mod.init.items.ItemOShovel;
import com.wildeschildpad.mod.init.items.ItemOSword;
import com.wildeschildpad.mod.init.items.ItemPlastic;
import com.wildeschildpad.mod.init.items.ItemRuby;



public class ModItems {
	
	public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 20, 3000, 20.0F, 20.0F, 30);
	public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial", 15, 2500, 15.0F, 15.0F, 25);
	//public static final Item.ToolMaterial adsfjf = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	
	public static Item obsidian_ingot;
	public static Item obsidian_sword;
	public static Item obsidian_pickaxe;
	public static Item obsidian_axe;
	public static Item obsidian_hoe;
	public static Item obsidian_shovel;
	public static Item emerald_sword;
	public static Item ruby;
	public static Item plastic;
	
	public static Item cheese;
	
	public static void init() {	
		obsidian_ingot = new ItemOIngot();
		obsidian_sword = new ItemOSword(obsidianToolMaterial);
		obsidian_pickaxe = new ItemOPickaxe(obsidianToolMaterial);
		obsidian_hoe = new ItemOHoe(obsidianToolMaterial);
		obsidian_axe = new ItemOAxe("obsidian_axe", obsidianToolMaterial);
		obsidian_shovel = new ItemOShovel(obsidianToolMaterial);
		emerald_sword = new ItemEmeraldSword(emeraldToolMaterial);
		cheese = new ItemCheese();
		ruby = new ItemRuby();
		plastic = new ItemPlastic("plastic");
	}
	
	public static void register() {
		ForgeRegistries.ITEMS.register(obsidian_ingot);
		ForgeRegistries.ITEMS.register(obsidian_sword);
		ForgeRegistries.ITEMS.register(obsidian_pickaxe);
		ForgeRegistries.ITEMS.register(obsidian_axe);
		ForgeRegistries.ITEMS.register(obsidian_hoe);
		ForgeRegistries.ITEMS.register(obsidian_shovel);
		ForgeRegistries.ITEMS.register(emerald_sword);
		ForgeRegistries.ITEMS.register(cheese);
		ForgeRegistries.ITEMS.register(ruby);
	}
	
	public static void registerRenders() {
		registerRender(obsidian_ingot);
		registerRender(obsidian_sword);
		registerRender(obsidian_pickaxe);
		registerRender(obsidian_axe);
		registerRender(obsidian_hoe);
		registerRender(obsidian_shovel);
		registerRender(emerald_sword);
		registerRender(cheese);
		registerRender(ruby);
		for(int i = 0; i < EnumHandler.PlasticTypes.values().length; i++) {
			registerRender(plastic, i, "plastic_" + EnumHandler.PlasticTypes.values()[i].getName());
		}
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, fileName), "inventory"));
	}
	
	
}
