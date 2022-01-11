package ga.ozli.minecraftmods.ninjascash;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.List;

import static ga.ozli.minecraftmods.ninjascash.NinjasCash.MOD_ID;

class Tabs {
    static final CreativeModeTab COINS_GROUP = FabricItemGroupBuilder
            .create(new ResourceLocation(MOD_ID, "coins"))
            .icon(() -> new ItemStack(CoinItems.TWO_POUNDS))
            .appendItems(itemStackList -> itemStackList.addAll(List.of(
                    new ItemStack(CoinItems.ONE_PENCE),
                    new ItemStack(CoinItems.TWO_PENCE),
                    new ItemStack(CoinItems.FIVE_PENCE),
                    new ItemStack(CoinItems.TEN_PENCE),
                    new ItemStack(CoinItems.TWENTY_PENCE),
                    new ItemStack(CoinItems.FIFTY_PENCE),
                    new ItemStack(CoinItems.ONE_POUND),
                    new ItemStack(CoinItems.TWO_POUNDS))))
            .build();

    static final CreativeModeTab NOTES_GROUP = FabricItemGroupBuilder
            .create(new ResourceLocation(MOD_ID, "notes"))
            .icon(() -> new ItemStack(NoteItems.TWENTY_NOTE))
            .appendItems(itemStackList -> itemStackList.addAll(List.of(
                    new ItemStack(NoteItems.FIVE_NOTE),
                    new ItemStack(NoteItems.TEN_NOTE),
                    new ItemStack(NoteItems.TWENTY_NOTE),
                    new ItemStack(NoteItems.FIFTY_NOTE),
                    new ItemStack(NoteItems.HUNDRED_NOTE),
                    new ItemStack(NoteItems.FORGED_NOTE))))
            .build();
}
