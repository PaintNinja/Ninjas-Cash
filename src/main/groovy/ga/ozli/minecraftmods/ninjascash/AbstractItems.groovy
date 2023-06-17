package ga.ozli.minecraftmods.ninjascash

import groovy.transform.CompileStatic
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.Item
import net.minecraftforge.registries.DeferredRegister

@CompileStatic
sealed abstract class AbstractItems permits CoinItems, NoteItems {
    protected static final Item newBasicItem() {
        return new Item(new Item.Properties())
    }

    protected static final CreativeModeTab.Builder makeCreativeTab(final String tabName, final Item iconItem,
                                                                   final DeferredRegister<Item> items) {
        return CreativeModeTab.builder().with {
            title(Component.translatable("itemGroup.${NinjasCash.MOD_ID}.${tabName}"))
            icon(() -> iconItem.defaultInstance)
            displayItems((CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) -> {
                output.acceptAll(items.entries.collect { it.get().defaultInstance })
            })
            withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
        }
    }
}
