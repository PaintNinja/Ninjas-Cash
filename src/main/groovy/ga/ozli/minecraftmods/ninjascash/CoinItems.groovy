package ga.ozli.minecraftmods.ninjascash

import groovy.transform.CompileStatic
import groovy.transform.PackageScope
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import org.groovymc.cgl.api.transform.registroid.Registroid

@CompileStatic
final class CoinItems extends AbstractItems {
    @Registroid(registerAutomatically = false)
    @PackageScope static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID)

    static final Item ONE_PENCE = newBasicItem()
    static final Item TWO_PENCE = newBasicItem()
    static final Item FIVE_PENCE = newBasicItem()
    static final Item TEN_PENCE = newBasicItem()
    static final Item TWENTY_PENCE = newBasicItem()
    static final Item FIFTY_PENCE = newBasicItem()
    static final Item ONE_POUND = newBasicItem()
    static final Item TWO_POUNDS = newBasicItem()

    @PackageScope static final RegistryObject<CreativeModeTab> TAB = NinjasCash.CREATIVE_MODE_TABS.register('coins') {
        return makeCreativeTab('coins', TWO_POUNDS, ITEMS)
                .withTabsBefore(new ResourceLocation(NinjasCash.MOD_ID, 'notes'))
                .build()
    }
}
