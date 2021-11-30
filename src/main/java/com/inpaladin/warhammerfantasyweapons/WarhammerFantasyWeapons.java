package com.inpaladin.warhammerfantasyweapons;

import com.inpaladin.warhammerfantasyweapons.registry.ModItems;
import com.inpaladin.warhammerfantasyweapons.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class WarhammerFantasyWeapons implements ModInitializer {

    public static final String MOD_ID = "wfw";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
