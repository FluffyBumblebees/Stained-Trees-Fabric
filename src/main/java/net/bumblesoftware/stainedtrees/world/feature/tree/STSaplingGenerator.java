package net.bumblesoftware.stainedtrees.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.Supplier;

public class STSaplingGenerator extends SaplingGenerator {
    private final  Supplier<RegistryEntry<? extends ConfiguredFeature<?, ?>>> colour;
    public STSaplingGenerator(Supplier<RegistryEntry<? extends ConfiguredFeature<?, ?>>> colour) {
        this.colour = colour;
    }
    @Nullable @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return colour.get();
    }
}
