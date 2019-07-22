package com.wildeschildpad.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.wildeschildpad.mod.gen.OreGen;
import com.wildeschildpad.mod.init.ModBlocks;
import com.wildeschildpad.mod.init.ModCrafting;
import com.wildeschildpad.mod.init.ModItems;
import com.wildeschildpad.mod.proxy.CommonProxy;
import com.wildschildpad.mod.tabs.ModTab;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class ModClass {

	//public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 20, 3000, 20.0F, 20.0F, 30);
	
	
	public static final CreativeTabs modTab = new ModTab("modTab");
	
	@Instance
	public static ModClass instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		ModBlocks.registerRenders();
		
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		
		//Blocks.BEDROCK.setHardness(3.0F);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) 
	{
		
		
		System.out.println("Init");
		
		proxy.registerModelBakeryVariants();
		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post Init");
	}
}
