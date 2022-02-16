package com.inpaladin.warhammerfantasyweapons.registry;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import com.inpaladin.warhammerfantasyweapons.WarhammerFantasyWeapons;
import com.inpaladin.warhammerfantasyweapons.items.ArmorMaterialGromril;
import com.inpaladin.warhammerfantasyweapons.items.CustomAxeItem;
import com.inpaladin.warhammerfantasyweapons.items.CustomHoeItem;
import com.inpaladin.warhammerfantasyweapons.items.CustomPickaxeItem;
import com.inpaladin.warhammerfantasyweapons.items.HalberdBase;
import com.inpaladin.warhammerfantasyweapons.items.HalberdMaterialDiamond;
import com.inpaladin.warhammerfantasyweapons.items.HalberdMaterialGold;
import com.inpaladin.warhammerfantasyweapons.items.HalberdMaterialGromril;
import com.inpaladin.warhammerfantasyweapons.items.HalberdMaterialIron;
import com.inpaladin.warhammerfantasyweapons.items.HalberdMaterialNetherite;
import com.inpaladin.warhammerfantasyweapons.items.HalberdMaterialStone;
import com.inpaladin.warhammerfantasyweapons.items.HalberdMaterialWood;
import com.inpaladin.warhammerfantasyweapons.items.RapierBase;
import com.inpaladin.warhammerfantasyweapons.items.ToolMaterialGromril;
import com.inpaladin.warhammerfantasyweapons.items.WarHammerBase;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item GROMRIL_INGOT = new Item(new FabricItemSettings().fireproof().group(ItemGroup.MATERIALS));
    public static final Item SWORD_BREAKER_WOOD = new FabricShieldItem(new FabricItemSettings().maxDamage(36).group(ItemGroup.COMBAT), 10, 0, ItemTags.PLANKS);
    //public static final Item SWORD_BREAKER_STONE = new FabricShieldItem(new FabricItemSettings().maxDamage(76).group(ItemGroup.COMBAT), 10, 0, ItemTags.STONE_TOOL_MATERIALS);
    //public static final Item SWORD_BREAKER = new FabricShieldItem(new FabricItemSettings().maxDamage(176).group(ItemGroup.COMBAT), 10, 0, Items.IRON_INGOT);
    //public static final Item SWORD_BREAKER_DIAMOND = new FabricShieldItem(new FabricItemSettings().maxDamage(276).group(ItemGroup.COMBAT), 10, 0, Items.DIAMOND);
    //public static final Item SWORD_BREAKER_NETHERITE = new FabricShieldItem(new FabricItemSettings().fireproof().maxDamage(336).group(ItemGroup.COMBAT), 10, 0, Items.NETHERITE_INGOT);
    //public static final Item SWORD_BREAKER_GROMRIL = new FabricShieldItem(new FabricItemSettings().fireproof().maxDamage(336).group(ItemGroup.COMBAT), 10, 0, ModItems.GROMRIL_INGOT);
    //public static final Item SWORD_BREAKER_GOLD = new FabricShieldItem(new FabricItemSettings().maxDamage(16).group(ItemGroup.COMBAT), 10, 0, Items.GOLD_INGOT);
    public static final Item RAW_GROMRIL = new Item(new FabricItemSettings().fireproof().group(ItemGroup.MATERIALS));
    public static final Item GLASS_HAMMER_BROKEN = new Item(new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final Item GLASS_HAMMER = new Item(new FabricItemSettings().recipeRemainder(GLASS_HAMMER_BROKEN).group(ItemGroup.TOOLS));
    public static final Item NASCENT_ALLOY = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
   // public static final Item GROMRIL_SHIELD = new FabricShieldItem(new FabricItemSettings().fireproof().maxDamage(436).group(ItemGroup.COMBAT), 100, 0, ModItems.GROMRIL_INGOT);

    //armor
    public static final ArmorMaterial ARMOR_MATERIAL_GROMRIL = new ArmorMaterialGromril();
    public static final Item GROMRIL_HELMET = new ArmorItem(ARMOR_MATERIAL_GROMRIL, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ItemGroup.COMBAT));
    public static final Item GROMRIL_CHESTPLATE = new ArmorItem(ARMOR_MATERIAL_GROMRIL, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ItemGroup.COMBAT));
    public static final Item GROMRIL_LEGGINGS = new ArmorItem(ARMOR_MATERIAL_GROMRIL, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ItemGroup.COMBAT));
    public static final Item GROMRIL_BOOTS = new ArmorItem(ARMOR_MATERIAL_GROMRIL, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ItemGroup.COMBAT));

    //blocks
    public static final BlockItem GROMRIL_BLOCK = new BlockItem(ModBlocks.GROMRIL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        //items
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "war_hammer_wood"), new WarHammerBase(WOOD, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "war_hammer_stone"), new WarHammerBase(STONE, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "war_hammer"), new WarHammerBase(IRON, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "war_hammer_gold"), new WarHammerBase(new ToolMaterialGold(), new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "war_hammer_diamond"), new WarHammerBase(DIAMOND, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "war_hammer_netherite"), new WarHammerBase(NETHERITE, new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "war_hammer_gromril"), new WarHammerBase(new ToolMaterialGromril(), new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "sword_breaker_wood"), SWORD_BREAKER_WOOD);
        //Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "sword_breaker_stone"), SWORD_BREAKER_STONE);
        //Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "sword_breaker"), SWORD_BREAKER);
        //Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "sword_breaker_gold"), SWORD_BREAKER_GOLD);
        //Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "sword_breaker_diamond"), SWORD_BREAKER_DIAMOND);
        //Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "sword_breaker_netherite"), SWORD_BREAKER_NETHERITE);
        //Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "sword_breaker_gromril"), SWORD_BREAKER_GROMRIL);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "halberd_wood"), new HalberdBase(new HalberdMaterialWood(), new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "halberd_stone"), new HalberdBase(new HalberdMaterialStone(), new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "halberd_iron"), new HalberdBase(new HalberdMaterialIron(), new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "halberd_gold"), new HalberdBase(new HalberdMaterialGold(), new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "halberd_diamond"), new HalberdBase(new HalberdMaterialDiamond(), new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "halberd_netherite"), new HalberdBase(new HalberdMaterialNetherite(), new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "halberd_gromril"), new HalberdBase(new HalberdMaterialGromril(), new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "rapier_wood"), new RapierBase(WOOD, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "rapier_stone"), new RapierBase(STONE, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "rapier_iron"), new RapierBase(IRON, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "rapier_gold"), new RapierBase(GOLD, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "rapier_diamond"), new RapierBase(DIAMOND, new FabricItemSettings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "rapier_netherite"), new RapierBase(NETHERITE, new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "rapier_gromril"), new RapierBase(new ToolMaterialGromril(), new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_ingot"), GROMRIL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "raw_gromril"), RAW_GROMRIL);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "glass_hammer"), GLASS_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "glass_hammer_broken"), GLASS_HAMMER_BROKEN);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "nascent_alloy"), NASCENT_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_sword"), new SwordItem(ToolMaterialGromril.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_shovel"), new ShovelItem(ToolMaterialGromril.INSTANCE, 1.5f, -3, new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_pickaxe"), new CustomPickaxeItem(ToolMaterialGromril.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_axe"), new CustomAxeItem(ToolMaterialGromril.INSTANCE, 5, -3, new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_hoe"), new CustomHoeItem(ToolMaterialGromril.INSTANCE, -3, 0, new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));
        //Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_shield"), GROMRIL_SHIELD);

        //blocks
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_block"), GROMRIL_BLOCK);

        //armor
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_helmet"), GROMRIL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_chestplate"), GROMRIL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_leggings"), GROMRIL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(WarhammerFantasyWeapons.MOD_ID, "gromril_boots"), GROMRIL_BOOTS);



    }

}
