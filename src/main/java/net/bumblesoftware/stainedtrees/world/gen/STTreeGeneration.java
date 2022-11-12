package net.bumblesoftware.stainedtrees.world.gen;

import net.bumblesoftware.stainedtrees.block.STBlocks;
import net.bumblesoftware.stainedtrees.block.Sapling;
import net.bumblesoftware.stainedtrees.util.STUtil;
import net.bumblesoftware.stainedtrees.world.feature.STConfiguredFeatures;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class STTreeGeneration {
    private static void register(RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> tree, Sapling sapling, String colour) {
      STUtil.generatePlaced(tree, sapling, colour);
    }
    public static void generateBlackTrees() {
        register(STConfiguredFeatures.BLACK_TREE, STBlocks.BLACK_SAPLING, "black");
    }
    public static void generateBlueTrees() {
        register(STConfiguredFeatures.BLUE_TREE, STBlocks.BLUE_SAPLING, "blue");
    }
    public static void generateBrownTrees() {
        register(STConfiguredFeatures.BROWN_TREE, STBlocks.BROWN_SAPLING, "brown");
    }
    public static void generateCyanTrees() {
        register(STConfiguredFeatures.CYAN_TREE, STBlocks.CYAN_SAPLING, "cyan");
    }
    public static void generateGrayTrees() {
        register(STConfiguredFeatures.GRAY_TREE, STBlocks.GRAY_SAPLING, "gray");
    }
    public static void generateLightBlueTrees() {
        register(STConfiguredFeatures.LIGHT_BLUE_TREE, STBlocks.LIGHT_BLUE_SAPLING, "light_blue");
    }
    public static void generateLightGrayTrees() {
        register(STConfiguredFeatures.LIGHT_GRAY_TREE, STBlocks.LIGHT_GRAY_SAPLING, "light_gray");
    }
    public static void generateLimeTrees() {
        register(STConfiguredFeatures.LIME_TREE, STBlocks.LIME_SAPLING, "lime");
    }
    public static void generateMagentaTrees() {
        register(STConfiguredFeatures.MAGENTA_TREE, STBlocks.MAGENTA_SAPLING, "magenta");
    }
    public static void generateOrangeTrees() {
        register(STConfiguredFeatures.ORANGE_TREE, STBlocks.ORANGE_SAPLING, "orange");
    }
    public static void generatePinkTrees() {
        register(STConfiguredFeatures.PINK_TREE, STBlocks.PINK_SAPLING, "pink");
    }
    public static void generatePurpleTrees() {
        register(STConfiguredFeatures.PURPLE_TREE, STBlocks.PURPLE_SAPLING, "purple");
    }
    public static void generateRedTrees() {
        register(STConfiguredFeatures.RED_TREE, STBlocks.RED_SAPLING, "red");
    }
    public static void generateWhiteTrees() {
        register(STConfiguredFeatures.WHITE_TREE, STBlocks.WHITE_SAPLING, "white");
    }
    public static void generateYellowTrees() {
        register(STConfiguredFeatures.YELLOW_TREE, STBlocks.YELLOW_SAPLING, "yellow");
    }
}
