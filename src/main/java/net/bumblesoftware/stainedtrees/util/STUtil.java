package net.bumblesoftware.stainedtrees.util;

import net.bumblesoftware.stainedtrees.StainedTrees;
import net.bumblesoftware.stainedtrees.block.Sapling;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.BlockView;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class STUtil {
    public static boolean never(BlockState ignoredBlockState, BlockView ignoredBlockView, BlockPos ignoredBlockPos) {
        return false;
    }
    public static Boolean canSpawnOnLeaves(BlockState ignoredState, BlockView ignoredWorld, BlockPos ignoredPos, EntityType<?> type) {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }

    public static <B extends Block> B registerBlocks(B block, String name, ItemGroup itemGroup) {
        Registry.register(Registry.BLOCK, new Identifier(StainedTrees.MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(StainedTrees.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    return block;
    }
    public static <B extends Block> B registerBlocks(B block, String name) {
        return registerBlocks(block, name , ItemGroup.DECORATIONS);
    }
    public static <B extends Block> B registerPottedSapling(B block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(StainedTrees.MOD_ID, name), block);
        return block;
    }
    public static RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> registerTreeFeature(String colour, Block block) {
        return ConfiguredFeatures.register(
                colour + "_tree",
                Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
                        new StraightTrunkPlacer(4, 2, 0),
                        BlockStateProvider.of(block.getDefaultState()),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)).build());
    }
    public static RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> registerTreeSpawn(RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> tree, String colour, Sapling sapling) {
        RegistryEntry<PlacedFeature> TREE_CHECKED =
                PlacedFeatures.register(colour + "_checked", tree,
                        PlacedFeatures.wouldSurvive(sapling));
        return ConfiguredFeatures.register(colour + "_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(TREE_CHECKED, 0.5f)),
                        TREE_CHECKED));
    }
    public static void generatePlaced(RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> tree, Sapling sapling, String colour) {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatures.register(colour + "_placed",
                        registerTreeSpawn(tree, colour, sapling),
                        VegetationPlacedFeatures.modifiers(
                                PlacedFeatures.createCountExtraModifier(0, 0.005f, 1)
                        )).getKey().get());
    }
}
