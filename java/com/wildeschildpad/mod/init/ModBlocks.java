package com.wildeschildpad.mod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.wildeschildpad.mod.ModClass;
import com.wildeschildpad.mod.Reference;
import com.wildeschildpad.mod.init.blocks.BlockBurnOutTorch;
import com.wildeschildpad.mod.init.blocks.BlockBurnOutTorchOff;
import com.wildeschildpad.mod.init.blocks.BlockDirtSlab;
import com.wildeschildpad.mod.init.blocks.BlockDirtSlabDouble;
import com.wildeschildpad.mod.init.blocks.BlockDirtSlabHalf;
import com.wildeschildpad.mod.init.blocks.BlockDirtStairs;
import com.wildeschildpad.mod.init.blocks.BlockElectricTorch;
import com.wildeschildpad.mod.init.blocks.BlockElectricTorchOn;
import com.wildeschildpad.mod.init.blocks.BlockOakChair;
import com.wildeschildpad.mod.init.blocks.BlockObsidianOre;
import com.wildeschildpad.mod.init.blocks.BlockObsidianOreEnd;
import com.wildeschildpad.mod.init.blocks.BlockObsidianOreNether;
import com.wildeschildpad.mod.init.blocks.BlockObsidianSlab;
import com.wildeschildpad.mod.init.blocks.BlockObsidianSlabDouble;
import com.wildeschildpad.mod.init.blocks.BlockObsidianSlabHalf;
import com.wildeschildpad.mod.init.blocks.BlockObsidianStairs;
import com.wildeschildpad.mod.init.blocks.BlockPillarBottom;
import com.wildeschildpad.mod.init.blocks.BlockRubyOre;
import com.wildeschildpad.mod.init.blocks.BlockStonePath;
import com.wildeschildpad.mod.init.blocks.CustomBlockPlanks;
import com.wildeschildpad.mod.init.blocks.activators.BlockAcaciaButton;
import com.wildeschildpad.mod.init.blocks.activators.BlockBirchButton;
import com.wildeschildpad.mod.init.blocks.activators.BlockDarkOakButton;
import com.wildeschildpad.mod.init.blocks.activators.BlockDirtButton;
import com.wildeschildpad.mod.init.blocks.activators.BlockDirtPressurePlate;
import com.wildeschildpad.mod.init.blocks.activators.BlockJungleButton;
import com.wildeschildpad.mod.init.blocks.activators.BlockObsidianButton;
import com.wildeschildpad.mod.init.blocks.activators.BlockObsidianPressurePlate;
import com.wildeschildpad.mod.init.blocks.activators.BlockSpruceButton;
import com.wildeschildpad.mod.init.blocks.item.ItemBlockVariants;

public class ModBlocks {
	
	
public static Block obsidian_ore;
public static Block obsidian_ore_nether;
public static Block obsidian_ore_end;
public static Block stone_path;
public static Block oak_chair;
public static BlockObsidianSlab obsidian_slab_half;
public static BlockObsidianSlab obsidian_slab_double;
public static BlockDirtSlab dirt_slab_half;
public static BlockDirtSlab dirt_slab_double;
public static BlockObsidianButton obsidian_button;
public static BlockDirtButton dirt_button;
public static BlockSpruceButton spruce_button;
public static BlockJungleButton jungle_button;
public static BlockBirchButton birch_button;
public static BlockAcaciaButton acacia_button;
public static BlockDarkOakButton dark_oak_button;
public static BlockObsidianPressurePlate obsidian_pressure_plate;	
public static BlockDirtPressurePlate dirt_pressure_plate;	
public static BlockObsidianStairs obsidian_stairs;
public static BlockDirtStairs dirt_stairs;
public static BlockElectricTorch electric_torch;
public static BlockElectricTorchOn electric_torch_on;
public static BlockBurnOutTorch burn_torch;
public static BlockBurnOutTorchOff burn_torch_off;
public static BlockPillarBottom pillar_bottom;
public static BlockRubyOre ruby_ore;
public static Block planks;

	public static void init() {	
		obsidian_ore = new BlockObsidianOre();
		obsidian_ore_nether = new BlockObsidianOreNether();
		obsidian_ore_end = new BlockObsidianOreEnd();
		stone_path = new BlockStonePath();
		obsidian_slab_half = new BlockObsidianSlabHalf("obsidian_slab_half");
		obsidian_slab_double = new BlockObsidianSlabDouble("obsidian_slab_double");
		dirt_slab_half = new BlockDirtSlabHalf("dirt_slab_half");
		dirt_slab_double = new BlockDirtSlabDouble("dirt_slab_double");
		obsidian_button = new BlockObsidianButton("obsidian_button", 50F, 2000.0F);
		dirt_button = new BlockDirtButton("dirt_button", 0.5F, 0.0F);
		spruce_button = new BlockSpruceButton("spruce_button", 2F, 15.0F);
		jungle_button = new BlockJungleButton("jungle_button", 2F, 15.0F);
		birch_button = new BlockBirchButton("birch_button", 2F, 15.0F);
		acacia_button = new BlockAcaciaButton("acacia_button", 2F, 15.0F);
		dark_oak_button = new BlockDarkOakButton("dark_oak_button", 2F, 15.0F);
		obsidian_pressure_plate = new BlockObsidianPressurePlate("obsidian_pressure_plate", 50F, 2000.0F);
		dirt_pressure_plate = new BlockDirtPressurePlate("dirt_pressure_plate", 0.5F, 0.0F);
		obsidian_stairs = new BlockObsidianStairs("obsidian_stairs", Blocks.OBSIDIAN.getDefaultState());
		dirt_stairs = new BlockDirtStairs("dirt_stairs", Blocks.DIRT.getDefaultState());
		oak_chair = new BlockOakChair();
		electric_torch = new BlockElectricTorch();
		electric_torch_on = new BlockElectricTorchOn();
		burn_torch = new BlockBurnOutTorch();
		burn_torch_off = new BlockBurnOutTorchOff();
		pillar_bottom = new BlockPillarBottom();
		ruby_ore = new BlockRubyOre();
		
		planks = new CustomBlockPlanks("planks");
	}
	
	public static void register() {
		registerBlock(obsidian_ore);
		registerBlock(obsidian_ore_nether);
		registerBlock(obsidian_ore_end);
		registerBlock(stone_path);
		registerBlock(obsidian_slab_half, new ItemSlab(obsidian_slab_half, obsidian_slab_half, obsidian_slab_double));
		registerBlock(dirt_slab_half, new ItemSlab(dirt_slab_half, dirt_slab_half, dirt_slab_double));
		registerBlock(obsidian_button);
		registerBlock(dirt_button);
		registerBlock(spruce_button);
		registerBlock(jungle_button);
		registerBlock(birch_button);
		registerBlock(acacia_button);
		registerBlock(dark_oak_button);
		registerBlock(obsidian_pressure_plate);
		registerBlock(dirt_pressure_plate);
		registerBlock(obsidian_stairs);
		registerBlock(dirt_stairs);
		registerBlock(oak_chair);
		registerBlock(electric_torch);
		registerBlock(electric_torch_on);
		registerBlock(burn_torch);
		registerBlock(burn_torch_off);
		registerBlock(pillar_bottom);
		registerBlock(ruby_ore);
		registerBlock(planks, new ItemBlockVariants(planks));
	}
	
	private static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(obsidian_slab_double);
		ForgeRegistries.BLOCKS.register(dirt_slab_double);
		
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(ModClass.modTab);
		ItemBlock item = new ItemBlock(block); 
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	private static void registerBlock(Block block, ItemBlock itemblock) {
		
		ForgeRegistries.BLOCKS.register(block);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		block.setCreativeTab(ModClass.modTab);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	private static void registerBlockWithVariants(Block block, ItemBlock itemblock) {
		
		ForgeRegistries.BLOCKS.register(block);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		block.setCreativeTab(ModClass.modTab);
		
	}
	
	public static void registerRenders() {
		registerRender(obsidian_ore);
		registerRender(obsidian_ore_nether);
		registerRender(obsidian_ore_end);
		registerRender(stone_path);
		registerRender(obsidian_slab_half);
		registerRender(obsidian_slab_double);
		registerRender(dirt_slab_half);
		registerRender(dirt_slab_double);
		registerRender(obsidian_button);
		registerRender(dirt_button);
		registerRender(spruce_button);
		registerRender(jungle_button);
		registerRender(birch_button);
		registerRender(acacia_button);
		registerRender(dark_oak_button);
		registerRender(obsidian_pressure_plate);
		registerRender(dirt_pressure_plate);
		registerRender(oak_chair);
		registerRender(electric_torch);
		registerRender(electric_torch_on);
		registerRender(burn_torch);
		registerRender(burn_torch_off);
		registerRender(pillar_bottom);
		registerRender(ruby_ore);
		for(int i = 0; i < CustomBlockPlanks.EnumType.values().length; i++)
		{
			registerRenderVariant(planks, i, "planks_" + CustomBlockPlanks.EnumType.values()[i].getName());
		}
	}
	
	public static void registerRender(Block block) {
		  ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation( Item.getItemFromBlock(block).getRegistryName(), "inventory"));
	}
	
	public static void registerRenderVariant(Block block, int meta, String filename)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), "inventory"));
	}
	
}
