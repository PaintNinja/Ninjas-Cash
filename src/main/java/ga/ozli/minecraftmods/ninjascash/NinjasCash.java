package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@Mod(NinjasCash.MOD_ID)
public final class NinjasCash {

    static final String MOD_ID = "ninjascash";
    private static final ResourceLocation COIN_GROUP_RL = new ResourceLocation(MOD_ID, "coins");
    private static final ResourceLocation NOTE_GROUP_RL = new ResourceLocation(MOD_ID, "notes");

    public NinjasCash() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CoinItems.ITEMS.register(modEventBus);
        NoteItems.ITEMS.register(modEventBus);
    }

    @Mod.EventBusSubscriber(modid = NinjasCash.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    static class EventListeners {
        @SubscribeEvent
        static void onRegisterCreativeTabs(final CreativeModeTabEvent.Register event) {
            event.registerCreativeModeTab(COIN_GROUP_RL, List.of(NOTE_GROUP_RL), List.of(), builder ->
                    builder.title(Component.translatable("itemGroup." + NinjasCash.MOD_ID + ".coins"))
                            .icon(() -> CoinItems.TWO_POUNDS.get().getDefaultInstance())
                            .displayItems((enabledFlags, populator, hasPermissions) ->
                                    populator.acceptAll(CoinItems.ITEMS.getEntries().stream()
                                            .map(RegistryObject::get)
                                            .map(Item::getDefaultInstance)
                                            .toList()
                                    )
                            )
            );

            event.registerCreativeModeTab(NOTE_GROUP_RL, List.of(), List.of(COIN_GROUP_RL), builder ->
                    builder.title(Component.translatable("itemGroup." + NinjasCash.MOD_ID + ".notes"))
                            .icon(() -> NoteItems.TWENTY_NOTE.get().getDefaultInstance())
                            .displayItems((enabledFlags, populator, hasPermissions) ->
                                    populator.acceptAll(NoteItems.ITEMS.getEntries().stream()
                                            .map(RegistryObject::get)
                                            .map(Item::getDefaultInstance)
                                            .toList()
                                    )
                            )
            );
        }
    }

    static Item newBasicItem() {
        return new Item(new Item.Properties());
    }
}
