package party.lemons.biomemakeover.level.generate.foliage;

import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
import party.lemons.biomemakeover.init.BMWorldGen;

import java.util.Random;

public class WillowSaplingGenerator extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random random, boolean bl) {
        return BMWorldGen.Swamp.WILLOW;
    }
}