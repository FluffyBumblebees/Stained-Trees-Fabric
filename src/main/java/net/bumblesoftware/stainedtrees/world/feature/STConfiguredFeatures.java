package net.bumblesoftware.stainedtrees.world.feature;

import net.bumblesoftware.stainedtrees.block.STBlocks;
import net.bumblesoftware.stainedtrees.util.STUtil;
import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class STConfiguredFeatures {
    private static RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> register(String colour, Block leaf) {
        return STUtil.registerTreeFeature(colour, leaf);
    }
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLACK_TREE = register("black", STBlocks.BLACK_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLUE_TREE = register("blue", STBlocks.BLUE_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BROWN_TREE = register("brown", STBlocks.BROWN_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CYAN_TREE = register("cyan", STBlocks.CYAN_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GRAY_TREE = register("gray", STBlocks.GRAY_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LIGHT_BLUE_TREE = register("light_blue", STBlocks.LIGHT_BLUE_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LIGHT_GRAY_TREE = register("light_gray", STBlocks.LIGHT_BLUE_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LIME_TREE = register("lime", STBlocks.LIME_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MAGENTA_TREE = register("magenta", STBlocks.MAGENTA_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ORANGE_TREE = register("orange", STBlocks.ORANGE_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PINK_TREE = register("pink", STBlocks.PINK_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PURPLE_TREE = register("purple", STBlocks.PURPLE_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_TREE = register("red", STBlocks.RED_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> WHITE_TREE = register("white", STBlocks.WHITE_LEAVES);
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> YELLOW_TREE = register("yellow", STBlocks.YELLOW_LEAVES);
}
