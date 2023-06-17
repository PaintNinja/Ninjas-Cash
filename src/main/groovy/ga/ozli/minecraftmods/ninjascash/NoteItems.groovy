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
final class NoteItems extends AbstractItems {
    @Registroid(registerAutomatically = false)
    @PackageScope static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NinjasCash.MOD_ID)

    static final Item FIVE_NOTE = newBasicItem()
    static final Item TEN_NOTE = newBasicItem()
    static final Item TWENTY_NOTE = newBasicItem()
    static final Item FIFTY_NOTE = newBasicItem()
    static final Item HUNDRED_NOTE = newBasicItem()
    static final Item FORGED_NOTE = newBasicItem()

    @PackageScope static final RegistryObject<CreativeModeTab> TAB = NinjasCash.CREATIVE_MODE_TABS.register('notes') {
        return makeCreativeTab('notes', TWENTY_NOTE, ITEMS)
                .withTabsAfter(new ResourceLocation(NinjasCash.MOD_ID, 'coins'))
                .build()
    }
}
