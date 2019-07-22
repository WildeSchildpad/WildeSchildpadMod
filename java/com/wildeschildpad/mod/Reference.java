package com.wildeschildpad.mod;

public class Reference {
	
	public static final String MOD_ID = "ws";
	public static final String NAME = "WildeSchildpad Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.wildeschildpad.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.wildeschildpad.mod.proxy.ServerProxy";

	public static enum ModItems{
		OBSIDIAN_INGOT("obsidian_ingot", "obsidian_ingot"),
		OBSIDIAN_SWORD("obsidian_sword", "obsidian_sword"),
		OBSIDIAN_PICKAXE("obsidian_pickaxe", "obsidian_pickaxe"),
		OBSIDIAN_AXE("obsidian_axe", "obsidian_axe"),
		OBSIDIAN_HOE("obsidian_hoe", "obsidian_hoe"),
		OBSIDIAN_SHOVEL("obsidian_shovel", "obsidian_shovel"),
		CHEESE("cheese", "cheese"),
		ESWORD("emerald_sword", "emerald_sword"),
		RUBY("ruby", "ruby");
		
		private String unlocalizedName;
		private String registryName;
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
	   public String getUnlocalizedName( )
	   {
		   return unlocalizedName;
	   }
		
		public String getRegistryName() 
		{
			return registryName;
		}
		
	 }
	
	public static enum ModBlocks{
		OBSIDIAN_ORE("obsidian_ore", "obsidian_ore"),
		OBSIDIAN_ORE_NETHER("obsidian_ore_nether", "obsidian_ore_nether"),
		OBSIDIAN_ORE_END("obsidian_ore_end", "obsidian_ore_end"),
		STONE_PATH("stone_path", "stone_path"),
		OBSIDIAN_SLAB("obsidian_slab", "obsidian_slab"),
		DIRT_SLAB("dirt_slab", "dirt_slab"),
		OAK_CHAIR("oak_chair", "oak_chair"),
		ELECTRIC_TORCH("electric_torch", "electric_torch"),
		ELECTRIC_TORCH_ON("electric_torch_on", "electric_torch_on"),
		BURN_OUT_TORCH("burn_torch", "burn_torch"),
		BURN_OUT_TORCH_OFF("burn_torch_off", "burn_torch_off"),
		PILLAR_BOTTOM("pillar_bottom", "pillar_bottom"),
		RUBY_ORE("ruby_ore", "ruby_ore");

		private String unlocalizedName;
		private String registryName;
		
		ModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
	   public String getUnlocalizedName( )
	   {
		   return unlocalizedName;
	   }
		
		public String getRegistryName() {
			return registryName;
		}
		
		
	}
	
	
	
}
