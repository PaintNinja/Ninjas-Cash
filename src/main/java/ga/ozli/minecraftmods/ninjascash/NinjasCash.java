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
	static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting Ninja's Cash...");

		// call empty register methods so that the classes load
		CoinItems.register();
		NoteItems.register();
		Tabs.register();
	}
}
