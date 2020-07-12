package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CoinItems {

    public static final ItemGroup COINS_GROUP = new ItemGroup("ninjascash.coins") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(TWO_POUNDS.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, NinjasCash.MOD_ID);

    public static final RegistryObject<Item> ONE_PENCE = ITEMS.register("one_pence", () -> new Item(new Item.Properties().group(COINS_GROUP)));
    public static final RegistryObject<Item> TWO_PENCE = ITEMS.register("two_pence", () -> new Item(new Item.Properties().group(COINS_GROUP)));
    public static final RegistryObject<Item> FIVE_PENCE = ITEMS.register("five_pence", () -> new Item(new Item.Properties().group(COINS_GROUP)));
    public static final RegistryObject<Item> TEN_PENCE = ITEMS.register("ten_pence", () -> new Item(new Item.Properties().group(COINS_GROUP)));
    public static final RegistryObject<Item> TWENTY_PENCE = ITEMS.register("twenty_pence", () -> new Item(new Item.Properties().group(COINS_GROUP)));
    public static final RegistryObject<Item> FIFTY_PENCE = ITEMS.register("fifty_pence", () -> new Item(new Item.Properties().group(COINS_GROUP)));
    public static final RegistryObject<Item> ONE_POUND = ITEMS.register("one_pound", () -> new Item(new Item.Properties().group(COINS_GROUP)));
    public static final RegistryObject<Item> TWO_POUNDS = ITEMS.register("two_pounds", () -> new Item(new Item.Properties().group(COINS_GROUP)));
}
