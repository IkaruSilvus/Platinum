package net.ikaru.platinummod.item;

import net.ikaru.platinummod.PlatinumMod;
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
            () -> new SwordItem(ModToolTiers.NEOPLATINUM, 14, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_PICKAXE = ITEMS.register("neoplatinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NEOPLATINUM, 5, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_AXE = ITEMS.register("neoplatinum_axe",
            () -> new AxeItem(ModToolTiers.NEOPLATINUM, 17, -3, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_SHOVEL = ITEMS.register("neoplatinum_shovel",
            () -> new ShovelItem(ModToolTiers.NEOPLATINUM, 5, -3, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_HOE = ITEMS.register("neoplatinum_hoe",
            () -> new HoeItem(ModToolTiers.NEOPLATINUM, 1, 0, new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_HELMET = ITEMS.register("neoplatinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_CHESTPLATE = ITEMS.register("neoplatinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_LEGGINGS = ITEMS.register("neoplatinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NEOPLATINUM_BOOTS = ITEMS.register("neoplatinum_boots",
            () -> new ArmorItem(ModArmorMaterials.NEOPLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));

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





   public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
