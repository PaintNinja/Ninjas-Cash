package ga.ozli.minecraftmods.ninjascash.util;

import ga.ozli.minecraftmods.ninjascash.NinjasCash;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class NCTags {
    public static final TagKey<Item> MONEYS = ItemTags.create(new ResourceLocation(NinjasCash.MOD_ID, "moneys"));
}
