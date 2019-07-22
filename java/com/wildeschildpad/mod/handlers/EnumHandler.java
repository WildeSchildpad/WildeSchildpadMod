package com.wildeschildpad.mod.handlers;

import net.minecraft.util.IStringSerializable;
import com.wildeschildpad.mod.init.items.ItemPlastic;

public class EnumHandler 
{
	public static enum PlasticTypes implements IStringSerializable {
		TRANSPARENT("transparent", 0),
		WHITE("white", 1),
		BLACK("black", 2),
		BLUE("blue", 3),
		RED("red", 4),
		GREEN("green", 5),
		LIME("lime", 6),
		PINK("pink", 7),
		YELLOW("yellow", 8),
		CYAN("cyan", 9),
		LIGHT_BLUE("light_blue", 10),
		LIGHT_GRAY("light_gray", 11),
		GRAY("gray", 12),
		MAGENTA("magenta", 13),
		PURPLE("purple", 14),
		BROWN("brown", 15),
		ORANGE("orange", 16);
		
		private int ID;
		private String name;
		
		private PlasticTypes(String name, int ID) {
			this.ID = ID;
			this.name= name;
		}

		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}
}
