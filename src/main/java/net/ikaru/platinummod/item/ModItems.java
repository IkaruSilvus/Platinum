package net.ikaru.platinummod.item;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.item.custom.BatItem;
import net.ikaru.platinummod.item.custom.KnifeItem;
import net.ikaru.platinummod.item.custom.ModArmorItem;
import net.ikaru.platinummod.item.custom.WrenchItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ikaru.platinummod.item.ModToolTiers;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PlatinumMod.MOD_ID);

    public static final RegistryObject<Item> PLATINUM = ITEMS.register("platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_CHARGE = ITEMS.register("dragon_charge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_CORE = ITEMS.register("dragon_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYNTHETIC_DRAGON_CORE = ITEMS.register("synthetic_dragon_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDER_TEAR = ITEMS.register("ender_tear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM = ITEMS.register("neoplatinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_PIPE = ITEMS.register("metal_pipe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SPIKE = ITEMS.register("platinum_spike",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModToolTiers.PLATINUM, 6, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM, 8, -3, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM, 5, -3, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(ModToolTiers.PLATINUM, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_SWORD = ITEMS.register("neoplatinum_sword",
            () -> new SwordItem(ModToolTiers.NEOPLATINUM, 13, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_PICKAXE = ITEMS.register("neoplatinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NEOPLATINUM, 6, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_AXE = ITEMS.register("neoplatinum_axe",
            () -> new AxeItem(ModToolTiers.NEOPLATINUM, 15, -3, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_BATTLEAXE = ITEMS.register("neoplatinum_battleaxe",
            () -> new SwordItem(ModToolTiers.NEOPLATINUM, 17, -3, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_SHOVEL = ITEMS.register("neoplatinum_shovel",
            () -> new ShovelItem(ModToolTiers.NEOPLATINUM, 6, -3, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_HOE = ITEMS.register("neoplatinum_hoe",
            () -> new HoeItem(ModToolTiers.NEOPLATINUM, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_HELMET = ITEMS.register("neoplatinum_helmet",
            () -> new ModArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_CHESTPLATE = ITEMS.register("neoplatinum_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_LEGGINGS = ITEMS.register("neoplatinum_leggings",
            () -> new ModArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_BOOTS = ITEMS.register("neoplatinum_boots",
            () -> new ModArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 3, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 8.5f, -3, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 3.5f, -3, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench",
            () -> new WrenchItem(Tiers.IRON, 3f, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_BAT = ITEMS.register("wooden_bat",
            () -> new BatItem(Tiers.WOOD, 11f, -3.5f, new Item.Properties()));
    public static final RegistryObject<Item> METAL_BAT = ITEMS.register("metal_bat",
            () -> new BatItem(Tiers.IRON, 8f, -3.5f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BAT = ITEMS.register("diamond_bat",
            () -> new BatItem(Tiers.DIAMOND, 11f, -3.5f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BAT = ITEMS.register("netherite_bat",
            () -> new BatItem(Tiers.NETHERITE, 20f, -3.7f, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_KNIFE = ITEMS.register("obsidian_knife",
            () -> new KnifeItem(ModToolTiers.OBSIDIAN, 6, -2.4f, new Item.Properties()));


   public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
