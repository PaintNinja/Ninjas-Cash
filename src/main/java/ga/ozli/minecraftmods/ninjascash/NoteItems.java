package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

class NoteItems {
    static final Item
            FIVE_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "five_note"), new Item(new Item.Properties())),
            TEN_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "ten_note"), new Item(new Item.Properties())),
            TWENTY_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "twenty_note"), new Item(new Item.Properties())),
            FIFTY_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "fifty_note"), new Item(new Item.Properties())),
            HUNDRED_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "hundred_note"), new Item(new Item.Properties())),
            FORGED_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "forged_note"), new Item(new Item.Properties()));

    static void register() {}
}
