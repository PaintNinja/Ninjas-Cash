package ga.ozli.minecraftmods.ninjascash;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NinjasCash.MOD_ID)
public final class NinjasCash {

    public static final String MOD_ID = "ninjascash";

    public NinjasCash() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CoinItems.ITEMS.register(modEventBus);
        NoteItems.ITEMS.register(modEventBus);
    }
}