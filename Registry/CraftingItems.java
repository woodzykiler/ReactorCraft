package Reika.ReactorCraft.Registry;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public enum CraftingItems {

	CANISTER("Fuel Canister"),
	ROD("Absorption Rod"),
	TANK("Obsidian Tank"),
	ALLOY("Cd-In-Ag Alloy Ingot");

	public final String itemName;

	public static final CraftingItems[] partList = values();

	private CraftingItems(String name) {
		itemName = name;
	}

	public ItemStack getItem() {
		return ReactorItems.CRAFTING.getStackOfMetadata(this.ordinal());
	}

	public void addRecipe(Object... o) {
		GameRegistry.addRecipe(this.getItem(), o);
	}

}
