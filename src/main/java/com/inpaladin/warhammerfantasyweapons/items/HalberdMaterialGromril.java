package com.inpaladin.warhammerfantasyweapons.items;

import com.inpaladin.warhammerfantasyweapons.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class HalberdMaterialGromril implements ToolMaterial {
    @Override
    public int getDurability() {
        return 2600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6;
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


