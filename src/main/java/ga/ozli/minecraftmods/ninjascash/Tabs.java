package ga.ozli.minecraftmods.ninjascash;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

class Tabs {
    static final CreativeModeTab COINS_GROUP = FabricItemGroupBuilder.build(
            new ResourceLocation("ninjascash", "coins"),
            CoinItems.TWO_POUNDS::getDefaultInstance
    );

    static final CreativeModeTab NOTES_GROUP = FabricItemGroupBuilder.build(
            new ResourceLocation("ninjascash", "notes"),
            NoteItems.TWENTY_NOTE::getDefaultInstance
    );
}
