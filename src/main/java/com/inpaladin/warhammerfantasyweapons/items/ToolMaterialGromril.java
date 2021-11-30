package com.inpaladin.warhammerfantasyweapons.items;

import com.inpaladin.warhammerfantasyweapons.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialGromril implements ToolMaterial {

    public static final ToolMaterialGromril INSTANCE = new ToolMaterialGromril();

    @Override
    public int getDurability() {
        return 2600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8;
    }

    @Override
    public float getAttackDamage() {
        return 3;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 44;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.GROMRIL_INGOT);
    }
}
