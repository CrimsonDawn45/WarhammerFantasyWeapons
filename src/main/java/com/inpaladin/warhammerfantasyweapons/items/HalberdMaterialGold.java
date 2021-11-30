package com.inpaladin.warhammerfantasyweapons.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class HalberdMaterialGold implements ToolMaterial {
    @Override
    public int getDurability() {
        return 32;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }
}

