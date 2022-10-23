package net.bumblesoftware.stainedtrees.block;

import net.bumblesoftware.stainedtrees.util.STUtil;
import net.bumblesoftware.stainedtrees.world.feature.STConfiguredFeatures;
import net.bumblesoftware.stainedtrees.world.feature.tree.STSaplingGenerator;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;


public class STBlocks {
    public static void initClass() {}
    private static final FlammableBlockRegistry INSTANCE = FlammableBlockRegistry.getDefaultInstance();
    private static  <B extends Block> B registerBlocks(B block, String name) {
        INSTANCE.add(block, 30, 60);
        return STUtil.registerBlocks(block, name);
    }
    public static final Leaves BLACK_LEAVES = registerBlocks(new Leaves(), "black_leaves");
    public static final Leaves BLUE_LEAVES = registerBlocks(new Leaves(), "blue_leaves");
    public static final Leaves BROWN_LEAVES = registerBlocks(new Leaves(), "brown_leaves");
    public static final Leaves CYAN_LEAVES = registerBlocks(new Leaves(), "cyan_leaves");
    public static final Leaves GRAY_LEAVES = registerBlocks(new Leaves(), "gray_leaves");
    public static final Leaves LIGHT_BLUE_LEAVES = registerBlocks(new Leaves(), "light_blue_leaves");
    public static final Leaves LIGHT_GRAY_LEAVES = registerBlocks(new Leaves(), "light_gray_leaves");
    public static final Leaves LIME_LEAVES = registerBlocks(new Leaves(), "lime_leaves");
    public static final Leaves MAGENTA_LEAVES = registerBlocks(new Leaves(), "magenta_leaves");
    public static final Leaves ORANGE_LEAVES = registerBlocks(new Leaves(), "orange_leaves");
    public static final Leaves PINK_LEAVES = registerBlocks(new Leaves(), "pink_leaves");
    public static final Leaves PURPLE_LEAVES = registerBlocks(new Leaves(), "purple_leaves");
    public static final Leaves RED_LEAVES = registerBlocks(new Leaves(), "red_leaves");
    public static final Leaves WHITE_LEAVES = registerBlocks(new Leaves(), "white_leaves");
    public static final Leaves YELLOW_LEAVES = registerBlocks(new Leaves(), "yellow_leaves");
    public static final Sapling BLACK_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.BLACK_TREE)),   "black_sapling");
    public static final Sapling BLUE_SAPLING =  registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.BLUE_TREE)),   "blue_sapling");
    public static final Sapling BROWN_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.BROWN_TREE)),   "brown_sapling");
    public static final Sapling CYAN_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.CYAN_TREE)),   "cyan_sapling");
    public static final Sapling GRAY_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.GRAY_TREE)),   "gray_sapling");
    public static final Sapling LIGHT_BLUE_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.LIGHT_BLUE_TREE)),   "light_blue_sapling");
    public static final Sapling LIGHT_GRAY_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.LIGHT_GRAY_TREE)),   "light_gray_sapling");
    public static final Sapling LIME_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.LIME_TREE)),   "lime_sapling");
    public static final Sapling MAGENTA_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.MAGENTA_TREE)),   "magenta_sapling");
    public static final Sapling ORANGE_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.ORANGE_TREE)),   "orange_sapling");
    public static final Sapling PINK_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.PINK_TREE)),   "pink_sapling");
    public static final Sapling PURPLE_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.PURPLE_TREE)),   "purple_sapling");
    public static final Sapling RED_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.RED_TREE)),   "red_sapling");
    public static final Sapling WHITE_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.WHITE_TREE)),   "white_sapling");
    public static final Sapling YELLOW_SAPLING = registerBlocks(new Sapling(new STSaplingGenerator(() -> STConfiguredFeatures.YELLOW_TREE)),   "yellow_sapling");
}
