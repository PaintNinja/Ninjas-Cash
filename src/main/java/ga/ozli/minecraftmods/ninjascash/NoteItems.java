package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class NoteItems {
    public static final Item
            FIVE_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "five_note"), new Item(new Item.Properties().tab(Tabs.NOTES_GROUP))),
            TEN_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "ten_note"), new Item(new Item.Properties().tab(Tabs.NOTES_GROUP))),
            TWENTY_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "twenty_note"), new Item(new Item.Properties().tab(Tabs.NOTES_GROUP))),
            FIFTY_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "fifty_note"), new Item(new Item.Properties().tab(Tabs.NOTES_GROUP))),
            HUNDRED_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "hundred_note"), new Item(new Item.Properties().tab(Tabs.NOTES_GROUP))),
            FORGED_NOTE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "forged_note"), new Item(new Item.Properties().tab(Tabs.NOTES_GROUP)));
}
