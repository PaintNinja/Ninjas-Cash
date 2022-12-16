package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

final class NoteItems {

    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID);

    static final RegistryObject<Item>
            FIVE_NOTE = ITEMS.register("five_note", NinjasCash::newBasicItem),
            TEN_NOTE = ITEMS.register("ten_note", NinjasCash::newBasicItem),
            TWENTY_NOTE = ITEMS.register("twenty_note", NinjasCash::newBasicItem),
            FIFTY_NOTE = ITEMS.register("fifty_note", NinjasCash::newBasicItem),
            HUNDRED_NOTE = ITEMS.register("hundred_note", NinjasCash::newBasicItem),
            FORGED_NOTE = ITEMS.register("forged_note", NinjasCash::newBasicItem);
}
