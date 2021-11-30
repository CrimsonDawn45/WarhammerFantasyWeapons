package com.inpaladin.warhammerfantasyweapons.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class WarHammerBase extends SwordItem {

    public WarHammerBase(ToolMaterial material, FabricItemSettings settings) {
        super(material, 6, -3.1f, settings);
    }
}
