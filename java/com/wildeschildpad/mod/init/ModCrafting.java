package com.wildeschildpad.mod.init;

import com.wildeschildpad.mod.init.blocks.CustomBlockPlanks;
import com.wildeschildpad.mod.init.blocks.CustomBlockPlanks.EnumType;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register( ) {
		
		//Crafting
		GameRegistry.addShapedRecipe(new ResourceLocation("00"), new ResourceLocation("11" ), new ItemStack(Blocks.OBSIDIAN), "OOO", "OOO", "OOO", 'O', ModItems.obsidian_ingot);
		GameRegistry.addShapedRecipe(new ResourceLocation("000"), new ResourceLocation("111" ), new ItemStack(ModItems.obsidian_sword), " O ", " O ", " S ", 'O', ModItems.obsidian_ingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ResourceLocation("0000"), new ResourceLocation("1111" ), new ItemStack(ModItems.obsidian_shovel), " O ", " S ", " S ", 'O', ModItems.obsidian_ingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ResourceLocation("00000"), new ResourceLocation("11111" ), new ItemStack(ModItems.obsidian_axe), "OO ", "OS ", " S ", 'O', ModItems.obsidian_ingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ResourceLocation("000000"), new ResourceLocation("111111" ), new ItemStack(ModItems.obsidian_pickaxe), "OOO", " S ", " S ", 'O', ModItems.obsidian_ingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ResourceLocation("0000000"), new ResourceLocation("1111111" ), new ItemStack(ModItems.obsidian_hoe), "OO ", " S ", " S ", 'O', ModItems.obsidian_ingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ResourceLocation("00000000"), new ResourceLocation("11111111"), new ItemStack(ModItems.emerald_sword), " E ", " E ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ResourceLocation("2"), new ResourceLocation("3"), new ItemStack(ModBlocks.obsidian_slab_half, 6), "   ", "OOO", "   ", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ResourceLocation("22"), new ResourceLocation("33"), new ItemStack(ModBlocks.dirt_slab_half, 6), "   ", "DDD", "   ", 'D', Blocks.DIRT);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("222"), new ResourceLocation("333"), new ItemStack(ModBlocks.planks, 1, 0), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 4), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("2222"), new ResourceLocation("3333"), new ItemStack(ModBlocks.planks, 1, 1), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 1), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("22222"), new ResourceLocation("33333"), new ItemStack(ModBlocks.planks, 1, 2), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 2), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("222222"), new ResourceLocation("333333"), new ItemStack(ModBlocks.planks, 1, 3), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 0), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("2222222"), new ResourceLocation("3333333"), new ItemStack(ModBlocks.planks, 1, 4), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 3), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("22222222"), new ResourceLocation("33333333"), new ItemStack(ModBlocks.planks, 1, 5), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 5), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("4"), new ResourceLocation("5"), new ItemStack(ModBlocks.planks, 1, 6), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 6), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("44"), new ResourceLocation("55"), new ItemStack(ModBlocks.planks, 1, 7), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 7), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("444"), new ResourceLocation("555"), new ItemStack(ModBlocks.planks, 1, 8), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 8), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("4444"), new ResourceLocation("5555"), new ItemStack(ModBlocks.planks, 1, 9), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 9), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("44444"), new ResourceLocation("55555"), new ItemStack(ModBlocks.planks, 1, 10), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 10), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("444444"), new ResourceLocation("555555"), new ItemStack(ModBlocks.planks, 1, 11), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 11), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("4444444"), new ResourceLocation("5555555"), new ItemStack(ModBlocks.planks, 1, 12), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 12), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("44444444"), new ResourceLocation("55555555"), new ItemStack(ModBlocks.planks, 1, 13), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 13), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("6"), new ResourceLocation("7"), new ItemStack(ModBlocks.planks, 1, 14), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 14), 'P', Blocks.PLANKS);
		GameRegistry.addShapedRecipe(new ResourceLocation("66"), new ResourceLocation("77"), new ItemStack(ModBlocks.planks, 1, 15), "   ", " D ", " P ", 'D', new ItemStack(Items.DYE, 1, 15), 'P', Blocks.PLANKS);
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("ws:obsidian_ingot"), new ResourceLocation("32hdisj"), new ItemStack(ModItems.obsidian_ingot, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(Blocks.OBSIDIAN))});
		
		//Smelting
		
		GameRegistry.addSmelting(ModBlocks.obsidian_ore, new ItemStack(ModItems.obsidian_ingot), 1.0F);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.obsidian_ingot), 1.0F);
	}

}
