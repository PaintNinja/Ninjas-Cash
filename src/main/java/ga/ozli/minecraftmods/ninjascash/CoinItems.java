package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

class CoinItems {
    static final Item
            ONE_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "one_pence"), new Item(new Item.Properties())),
            TWO_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "two_pence"), new Item(new Item.Properties())),
            FIVE_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "five_pence"), new Item(new Item.Properties())),
            TEN_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "ten_pence"), new Item(new Item.Properties())),
            TWENTY_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "twenty_pence"), new Item(new Item.Properties())),
            FIFTY_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "fifty_pence"), new Item(new Item.Properties())),
            ONE_POUND = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "one_pound"), new Item(new Item.Properties())),
            TWO_POUNDS = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "two_pounds"), new Item(new Item.Properties()));

    static void register() {}
}
