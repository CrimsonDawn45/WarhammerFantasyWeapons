package com.inpaladin.warhammerfantasyweapons.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

public class HalberdMaterialStone implements ToolMaterial {
    @Override
    public int getDurability() {
        return 131;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2;
    }

    @Override
    public float getAttackDamage() {
        return 1.5f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);

    }
}
