package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class NoteItems extends AbstractItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID);

    public static final RegistryObject<Item>
            FIVE_NOTE = ITEMS.register("five_note", AbstractItems::newBasicItem),
            TEN_NOTE = ITEMS.register("ten_note", AbstractItems::newBasicItem),
            TWENTY_NOTE = ITEMS.register("twenty_note", AbstractItems::newBasicItem),
            FIFTY_NOTE = ITEMS.register("fifty_note", AbstractItems::newBasicItem),
            HUNDRED_NOTE = ITEMS.register("hundred_note", AbstractItems::newBasicItem),
            FORGED_NOTE = ITEMS.register("forged_note", AbstractItems::newBasicItem);

    static final RegistryObject<CreativeModeTab> TAB = NinjasCash.CREATIVE_MODE_TABS.register("notes", () ->
            makeCreativeTab("notes", TWENTY_NOTE.get(), ITEMS)
                    .withTabsAfter(new ResourceLocation(NinjasCash.MOD_ID, "coins"))
                    .build()
    );
}
