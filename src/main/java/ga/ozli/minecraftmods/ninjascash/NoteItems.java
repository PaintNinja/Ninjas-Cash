package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class NoteItems {

    public static final ItemGroup NOTES_GROUP = new ItemGroup("ninjascash.notes") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(TWENTY_NOTE.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID);

    public static final RegistryObject<Item>
            FIVE_NOTE = ITEMS.register("five_note", () -> new Item(new Item.Properties().group(NOTES_GROUP))),
            TEN_NOTE = ITEMS.register("ten_note", () -> new Item(new Item.Properties().group(NOTES_GROUP))),
            TWENTY_NOTE = ITEMS.register("twenty_note", () -> new Item(new Item.Properties().group(NOTES_GROUP))),
            FIFTY_NOTE = ITEMS.register("fifty_note", () -> new Item(new Item.Properties().group(NOTES_GROUP))),
            HUNDRED_NOTE = ITEMS.register("hundred_note", () -> new Item(new Item.Properties().group(NOTES_GROUP))),
            FORGED_NOTE = ITEMS.register("forged_note", () -> new Item(new Item.Properties().group(NOTES_GROUP)));
}
