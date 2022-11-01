package net.deco.decomod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier HELLSTONE = new ForgeTier(5, 2500, 12f,
            5f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.HELLSTONE_INGOT.get()));
}
