package com.inpaladin.warhammerfantasyweapons.registry;

import com.inpaladin.warhammerfantasyweapons.WarhammerFantasyWeapons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks{

    public static final Block GROMRIL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(70.0F, 1600.0F).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_block"), GROMRIL_BLOCK);
    }
}
