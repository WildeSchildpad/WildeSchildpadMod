package com.wildeschildpad.mod.proxy;

import com.wildeschildpad.mod.init.ModBlocks;
import com.wildeschildpad.mod.init.ModItems;

public class ServerProxy implements CommonProxy{

	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

	public void registerModelBakeryVariants() {
		// TODO Auto-generated method stub
		
	}

}
