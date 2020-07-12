package ga.ozli.minecraftmods.ninjascash;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NinjasCash.MOD_ID)
public class NinjasCash
{
    // Directly reference a log4j logger.
    //private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "ninjascash";

    public NinjasCash() {
        CoinItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        NoteItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
