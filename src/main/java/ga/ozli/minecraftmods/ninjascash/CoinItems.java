package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

final class CoinItems {

    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID);

    static final RegistryObject<Item>
            ONE_PENCE = ITEMS.register("one_pence", NinjasCash::newBasicItem),
            TWO_PENCE = ITEMS.register("two_pence", NinjasCash::newBasicItem),
            FIVE_PENCE = ITEMS.register("five_pence", NinjasCash::newBasicItem),
            TEN_PENCE = ITEMS.register("ten_pence", NinjasCash::newBasicItem),
            TWENTY_PENCE = ITEMS.register("twenty_pence", NinjasCash::newBasicItem),
            FIFTY_PENCE = ITEMS.register("fifty_pence", NinjasCash::newBasicItem),
            ONE_POUND = ITEMS.register("one_pound", NinjasCash::newBasicItem),
            TWO_POUNDS = ITEMS.register("two_pounds", NinjasCash::newBasicItem);
}
