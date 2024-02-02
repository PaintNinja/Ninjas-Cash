package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class CoinItems extends AbstractItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID);

    public static final RegistryObject<Item>
            ONE_PENCE = ITEMS.register("one_pence", AbstractItems::newBasicItem),
            TWO_PENCE = ITEMS.register("two_pence", AbstractItems::newBasicItem),
            FIVE_PENCE = ITEMS.register("five_pence", AbstractItems::newBasicItem),
            TEN_PENCE = ITEMS.register("ten_pence", AbstractItems::newBasicItem),
            TWENTY_PENCE = ITEMS.register("twenty_pence", AbstractItems::newBasicItem),
            FIFTY_PENCE = ITEMS.register("fifty_pence", AbstractItems::newBasicItem),
            ONE_POUND = ITEMS.register("one_pound", AbstractItems::newBasicItem),
            TWO_POUNDS = ITEMS.register("two_pounds", AbstractItems::newBasicItem);

    static final RegistryObject<CreativeModeTab> TAB = NinjasCash.CREATIVE_MODE_TABS.register("coins", () ->
            makeCreativeTab("coins", TWO_POUNDS.get(), ITEMS)
                    .withTabsBefore(new ResourceLocation(NinjasCash.MOD_ID, "notes"))
                    .build()
    );
}
