package net.bumblesoftware.stainedtrees.item;

import net.bumblesoftware.stainedtrees.block.STBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static net.bumblesoftware.stainedtrees.StainedTrees.MOD_ID;

public class STItemGroup {
    public static void initClass () {}
    public static final ItemGroup STAINED_TREES;

    static {
        STAINED_TREES = FabricItemGroupBuilder.create(
                        new Identifier(MOD_ID, "general"))
                .icon(() -> new ItemStack(STBlocks.PURPLE_LEAVES))
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(STBlocks.BLACK_LEAVES));
                    stacks.add(new ItemStack(STBlocks.BLUE_LEAVES));
                    stacks.add(new ItemStack(STBlocks.BROWN_LEAVES));
                    stacks.add(new ItemStack(STBlocks.CYAN_LEAVES));
                    stacks.add(new ItemStack(STBlocks.GRAY_LEAVES));
                    stacks.add(new ItemStack(STBlocks.LIGHT_BLUE_LEAVES));
                    stacks.add(new ItemStack(STBlocks.LIGHT_GRAY_LEAVES));
                    stacks.add(new ItemStack(STBlocks.LIME_LEAVES));
                    stacks.add(new ItemStack(STBlocks.MAGENTA_LEAVES));
                    stacks.add(new ItemStack(STBlocks.ORANGE_LEAVES));
                    stacks.add(new ItemStack(STBlocks.PINK_LEAVES));
                    stacks.add(new ItemStack(STBlocks.PURPLE_LEAVES));
                    stacks.add(new ItemStack(STBlocks.RED_LEAVES));
                    stacks.add(new ItemStack(STBlocks.WHITE_LEAVES));
                    stacks.add(new ItemStack(STBlocks.YELLOW_LEAVES));
                    stacks.add(new ItemStack(STBlocks.BLACK_SAPLING));
                    stacks.add(new ItemStack(STBlocks.BLUE_SAPLING));
                    stacks.add(new ItemStack(STBlocks.BROWN_SAPLING));
                    stacks.add(new ItemStack(STBlocks.CYAN_SAPLING));
                    stacks.add(new ItemStack(STBlocks.GRAY_SAPLING));
                    stacks.add(new ItemStack(STBlocks.LIGHT_BLUE_SAPLING));
                    stacks.add(new ItemStack(STBlocks.LIGHT_GRAY_SAPLING));
                    stacks.add(new ItemStack(STBlocks.LIME_SAPLING));
                    stacks.add(new ItemStack(STBlocks.MAGENTA_SAPLING));
                    stacks.add(new ItemStack(STBlocks.ORANGE_SAPLING));
                    stacks.add(new ItemStack(STBlocks.PINK_SAPLING));
                    stacks.add(new ItemStack(STBlocks.PURPLE_SAPLING));
                    stacks.add(new ItemStack(STBlocks.RED_SAPLING));
                    stacks.add(new ItemStack(STBlocks.WHITE_SAPLING));
                    stacks.add(new ItemStack(STBlocks.YELLOW_SAPLING));
                }).build();
    }
}
