package com.inpaladin.warhammerfantasyweapons.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RapierBase extends SwordItem {

    public RapierBase(ToolMaterial material, FabricItemSettings settings) {
        super(material, 1, -2f,  settings);
    }
}
