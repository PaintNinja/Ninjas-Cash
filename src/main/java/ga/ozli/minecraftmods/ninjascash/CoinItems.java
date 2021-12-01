package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class CoinItems {

    public static final CreativeModeTab COINS_GROUP = new CreativeModeTab("ninjascash.coins") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TWO_POUNDS.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID);

    public static final RegistryObject<Item>
            ONE_PENCE = ITEMS.register("one_pence", () -> new Item(new Item.Properties().tab(COINS_GROUP))),
            TWO_PENCE = ITEMS.register("two_pence", () -> new Item(new Item.Properties().tab(COINS_GROUP))),
            FIVE_PENCE = ITEMS.register("five_pence", () -> new Item(new Item.Properties().tab(COINS_GROUP))),
            TEN_PENCE = ITEMS.register("ten_pence", () -> new Item(new Item.Properties().tab(COINS_GROUP))),
            TWENTY_PENCE = ITEMS.register("twenty_pence", () -> new Item(new Item.Properties().tab(COINS_GROUP))),
            FIFTY_PENCE = ITEMS.register("fifty_pence", () -> new Item(new Item.Properties().tab(COINS_GROUP))),
            ONE_POUND = ITEMS.register("one_pound", () -> new Item(new Item.Properties().tab(COINS_GROUP))),
            TWO_POUNDS = ITEMS.register("two_pounds", () -> new Item(new Item.Properties().tab(COINS_GROUP)));
}
