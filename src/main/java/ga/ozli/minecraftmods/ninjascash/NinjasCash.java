package ga.ozli.minecraftmods.ninjascash;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.TranslatableComponent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NinjasCash implements ModInitializer {
	static final String MOD_ID = "ninjascash";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("ninjascash");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Starting Ninja's Cash...");

		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "one_pence"), CoinItems.ONE_PENCE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "two_pence"), CoinItems.TWO_PENCE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "five_pence"), CoinItems.FIVE_PENCE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "ten_pence"), CoinItems.TEN_PENCE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "twenty_pence"), CoinItems.TWENTY_PENCE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "fifty_pence"), CoinItems.FIFTY_PENCE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "one_pound"), CoinItems.ONE_POUND);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "two_pounds"), CoinItems.TWO_POUNDS);

		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "five_note"), NoteItems.FIVE_NOTE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "ten_note"), NoteItems.TEN_NOTE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "twenty_note"), NoteItems.TWENTY_NOTE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "fifty_note"), NoteItems.FIFTY_NOTE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "hundred_note"), NoteItems.HUNDRED_NOTE);
		Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "forged_note"), NoteItems.FORGED_NOTE);
	}
}
