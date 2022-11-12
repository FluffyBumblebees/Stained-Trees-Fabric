package net.bumblesoftware.stainedtrees;

import net.bumblesoftware.stainedtrees.block.STBlocks;
import net.bumblesoftware.stainedtrees.item.STItemGroup;
import net.bumblesoftware.stainedtrees.world.gen.STWorldGen;
import net.fabricmc.api.ModInitializer;

public class StainedTrees implements ModInitializer {
    public static String MOD_ID = "stained_trees";
    @Override
    public void onInitialize() {
        STWorldGen.generateWorldGen();
        STBlocks.initClass();
        STItemGroup.initClass();
    }
}
