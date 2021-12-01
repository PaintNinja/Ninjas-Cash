package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

class CoinItems {
    static final Item
            ONE_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "one_pence"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP))),
            TWO_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "two_pence"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP))),
            FIVE_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "five_pence"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP))),
            TEN_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "ten_pence"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP))),
            TWENTY_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "twenty_pence"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP))),
            FIFTY_PENCE = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "fifty_pence"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP))),
            ONE_POUND = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "one_pound"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP))),
            TWO_POUNDS = Registry.register(Registry.ITEM, new ResourceLocation("ninjascash", "two_pounds"), new Item(new Item.Properties().tab(Tabs.COINS_GROUP)));

    static void register() {}
}
