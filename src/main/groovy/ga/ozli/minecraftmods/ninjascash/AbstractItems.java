package ga.ozli.minecraftmods.ninjascash;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;

sealed abstract class AbstractItems permits CoinItems, NoteItems {
    protected static Item newBasicItem() {
        return new Item(new Item.Properties());
    }

    protected static CreativeModeTab.Builder makeCreativeTab(final String tabName, final Item iconItem,
                                                             final DeferredRegister<Item> items) {
        return CreativeModeTab.builder()
                .title(Component.translatable("itemGroup." + NinjasCash.MOD_ID + "." + tabName))
                .icon(iconItem::getDefaultInstance)
                .displayItems((CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) ->
                    output.acceptAll(items.getEntries().stream().map(entry -> entry.get().getDefaultInstance()).toList())
                )
                .withTabsBefore(CreativeModeTabs.SPAWN_EGGS);
    }
}
