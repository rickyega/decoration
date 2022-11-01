package net.deco.decomod.world.feature;

import net.deco.decomod.world.feature.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> PINK_PLACED = PlacementUtils.register("pink_placed",
            ModConfiguredFeatures.PINK_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
    public static final Holder<PlacedFeature> HELLSTONE_ORE_PLACED = PlacementUtils.register("hellstone_ore_placed",
            ModConfiguredFeatures.HELLSTONE_ORE, ModOrePlacement.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(30))));
}
