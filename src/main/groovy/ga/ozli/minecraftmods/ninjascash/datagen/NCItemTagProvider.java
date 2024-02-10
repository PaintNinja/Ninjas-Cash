package ga.ozli.minecraftmods.ninjascash.datagen;

import ga.ozli.minecraftmods.ninjascash.CoinItems;
import ga.ozli.minecraftmods.ninjascash.NinjasCash;
import ga.ozli.minecraftmods.ninjascash.NoteItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class NCItemTagProvider extends ItemTagsProvider {

    public NCItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, NinjasCash.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        CoinItems.ITEMS.getEntries().forEach(item -> this.tag(CoinItems.TAG).add(item.get()));
        NoteItems.ITEMS.getEntries().forEach(item -> this.tag(NoteItems.TAG).add(item.get()));
    }
}
