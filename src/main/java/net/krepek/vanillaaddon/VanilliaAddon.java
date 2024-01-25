package net.krepek.vanillaaddon;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.data.server.tag.vanilla.VanillaItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanilliaAddon implements ModInitializer {
	public static final String MOD_ID = "vanillia_addon";
    public static final Logger LOGGER = LoggerFactory.getLogger("vanillia-addon");

	@Override
	public void onInitialize() {

	//Smelting
		FuelRegistry.INSTANCE.add(Items.ARROW, 150);
		FuelRegistry.INSTANCE.add(Items.SPECTRAL_ARROW, 150);
		FuelRegistry.INSTANCE.add(Items.BRUSH, 150);
		FuelRegistry.INSTANCE.add(Items.ITEM_FRAME, 150);
		FuelRegistry.INSTANCE.add(Items.GLOW_ITEM_FRAME, 150);
		FuelRegistry.INSTANCE.add(Items.BEEHIVE, 300);
		FuelRegistry.INSTANCE.add(Items.FIRE_CHARGE, 3000);
		FuelRegistry.INSTANCE.add(Items.ARMOR_STAND, 600);
		FuelRegistry.INSTANCE.add(Items.PAINTING, 150);
		FuelRegistry.INSTANCE.add(Items.LEAD, 150);
		FuelRegistry.INSTANCE.add(Items.WARPED_FUNGUS_ON_A_STICK, 300);
		FuelRegistry.INSTANCE.add(Items.CARROT_ON_A_STICK, 300);
		FuelRegistry.INSTANCE.add(Items.BLACK_BED, 300);
		FuelRegistry.INSTANCE.add(Items.BLUE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.BROWN_BED, 300);
		FuelRegistry.INSTANCE.add(Items.CYAN_BED, 300);
		FuelRegistry.INSTANCE.add(Items.GRAY_BED, 300);
		FuelRegistry.INSTANCE.add(Items.GREEN_BED, 300);
		FuelRegistry.INSTANCE.add(Items.LIGHT_BLUE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.LIGHT_GRAY_BED, 300);
		FuelRegistry.INSTANCE.add(Items.LIME_BED, 300);
		FuelRegistry.INSTANCE.add(Items.MAGENTA_BED, 300);
		FuelRegistry.INSTANCE.add(Items.ORANGE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.PINK_BED, 300);
		FuelRegistry.INSTANCE.add(Items.PURPLE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.RED_BED, 300);
		FuelRegistry.INSTANCE.add(Items.WHITE_BED, 300);
		FuelRegistry.INSTANCE.add(Items.YELLOW_BED, 300);
		FuelRegistry.INSTANCE.add(Items.SHIELD, 300);
		FuelRegistry.INSTANCE.add(Items.SWEET_BERRIES, 50);
		FuelRegistry.INSTANCE.add(Items.TORCH, 300);
		FuelRegistry.INSTANCE.add(Items.PAPER, 150);
		FuelRegistry.INSTANCE.add(Items.MAP, 150);
		FuelRegistry.INSTANCE.add(Items.LEVER, 150);
		FuelRegistry.INSTANCE.add(Items.TRIPWIRE_HOOK, 150);
		FuelRegistry.INSTANCE.add(Items.SOUL_TORCH, 300);
		FuelRegistry.INSTANCE.add(Items.REDSTONE_TORCH, 150);
		FuelRegistry.INSTANCE.add(Items.RAIL, 300);
		FuelRegistry.INSTANCE.add(Items.REDSTONE_LAMP, 600);
		FuelRegistry.INSTANCE.add(Items.TARGET, 300);
		FuelRegistry.INSTANCE.add(Items.AZALEA, 300);
		FuelRegistry.INSTANCE.add(Items.FLOWERING_AZALEA, 300);
		FuelRegistry.INSTANCE.add(Items.GLOW_BERRIES, 50);
		FuelRegistry.INSTANCE.add(Items.OAK_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.DARK_OAK_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.SPRUCE_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.BIRCH_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.JUNGLE_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.ACACIA_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.MANGROVE_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.CHERRY_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.AZALEA_LEAVES, 150);
		FuelRegistry.INSTANCE.add(Items.FLOWERING_AZALEA_LEAVES, 150);
//Not working lol
		FuelRegistry.INSTANCE.add(Items.CRIMSON_STEM, 300);
		FuelRegistry.INSTANCE.add(Items.STRIPPED_CRIMSON_STEM, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_PLANKS, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_SLAB, 150);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_STAIRS, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_PRESSURE_PLATE, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_BUTTON, 100);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_TRAPDOOR, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_FENCE_GATE, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_FENCE, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_HYPHAE, 300);
		FuelRegistry.INSTANCE.add(Items.STRIPPED_CRIMSON_HYPHAE, 300);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_DOOR, 200);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_SIGN, 200);
		FuelRegistry.INSTANCE.add(Items.CRIMSON_HANGING_SIGN, 200);
		FuelRegistry.INSTANCE.add(Items.WARPED_STEM, 300);
		FuelRegistry.INSTANCE.add(Items.STRIPPED_WARPED_STEM, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_PLANKS, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_SLAB, 150);
		FuelRegistry.INSTANCE.add(Items.WARPED_STAIRS, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_PRESSURE_PLATE, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_BUTTON, 100);
		FuelRegistry.INSTANCE.add(Items.WARPED_TRAPDOOR, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_FENCE_GATE, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_FENCE, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_HYPHAE, 300);
		FuelRegistry.INSTANCE.add(Items.STRIPPED_WARPED_HYPHAE, 300);
		FuelRegistry.INSTANCE.add(Items.WARPED_DOOR, 200);
		FuelRegistry.INSTANCE.add(Items.WARPED_SIGN, 200);
		FuelRegistry.INSTANCE.add(Items.WARPED_HANGING_SIGN, 200);
	//Compost
		CompostingChanceRegistry.INSTANCE.add(Items.ROTTEN_FLESH, 0.30F);
		CompostingChanceRegistry.INSTANCE.add(Items.POISONOUS_POTATO, 0.50F);
		CompostingChanceRegistry.INSTANCE.add(Items.SPIDER_EYE, 0.30F);
		CompostingChanceRegistry.INSTANCE.add(Items.TURTLE_EGG, 1.00F);
		CompostingChanceRegistry.INSTANCE.add(Items.SNIFFER_EGG, 1.00F);
	}
}