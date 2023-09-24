package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NinjasCash.MOD_ID)
public final class NinjasCash {
    static final String MOD_ID = "ninjascash";
    static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public NinjasCash() {
        final var modBus = FMLJavaModLoadingContext.get().getModEventBus();
        CoinItems.ITEMS.register(modBus);
        NoteItems.ITEMS.register(modBus);
        CREATIVE_MODE_TABS.register(modBus);
    }
}
