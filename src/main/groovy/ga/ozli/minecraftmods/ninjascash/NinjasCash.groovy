package ga.ozli.minecraftmods.ninjascash

import groovy.transform.CompileStatic
import groovy.transform.PackageScope
import net.minecraft.core.registries.Registries
import net.minecraft.world.item.CreativeModeTab
import net.minecraftforge.registries.DeferredRegister
import org.groovymc.gml.GMod

@CompileStatic
@GMod(NinjasCash.MOD_ID)
final class NinjasCash {
    @PackageScope static final String MOD_ID = 'ninjascash'
    @PackageScope static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID)

    NinjasCash() {
        CoinItems.ITEMS.register(modBus)
        NoteItems.ITEMS.register(modBus)
        CREATIVE_MODE_TABS.register(modBus)
    }
}
