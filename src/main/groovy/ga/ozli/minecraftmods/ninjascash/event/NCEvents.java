package ga.ozli.minecraftmods.ninjascash.event;

import ga.ozli.minecraftmods.ninjascash.NinjasCash;
import ga.ozli.minecraftmods.ninjascash.datagen.NCBlockTagsProvider;
import ga.ozli.minecraftmods.ninjascash.datagen.NCItemTagProvider;
import ga.ozli.minecraftmods.ninjascash.datagen.NCRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = NinjasCash.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NCEvents {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        NCBlockTagsProvider blockTagsProvider = generator.addProvider(event.includeServer(), new NCBlockTagsProvider(packOutput, lookupProvider, NinjasCash.MOD_ID, existingFileHelper));

        generator.addProvider(event.includeServer(), new NCRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), new NCItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
    }
}
