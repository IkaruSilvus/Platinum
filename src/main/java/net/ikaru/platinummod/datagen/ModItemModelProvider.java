package net.ikaru.platinummod.datagen;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PlatinumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PLATINUM);
        simpleItem(ModItems.RAW_PLATINUM);
        handheldItem(ModItems.PLATINUM_SWORD);
        handheldItem(ModItems.PLATINUM_PICKAXE);
        handheldItem(ModItems.PLATINUM_AXE);
        handheldItem(ModItems.PLATINUM_SHOVEL);
        handheldItem(ModItems.PLATINUM_HOE);
        trimmedArmorItem(ModItems.PLATINUM_HELMET);
        trimmedArmorItem(ModItems.PLATINUM_CHESTPLATE);
        trimmedArmorItem(ModItems.PLATINUM_LEGGINGS);
        trimmedArmorItem(ModItems.PLATINUM_BOOTS);
        simpleItem(ModItems.NEOPLATINUM);
        handheldItem(ModItems.NEOPLATINUM_SWORD);
        handheldItem(ModItems.NEOPLATINUM_PICKAXE);
        handheldItem(ModItems.NEOPLATINUM_AXE);
        handheldItem(ModItems.NEOPLATINUM_BATTLEAXE);
        handheldItem(ModItems.NEOPLATINUM_SHOVEL);
        handheldItem(ModItems.NEOPLATINUM_HOE);
        trimmedArmorItem(ModItems.NEOPLATINUM_HELMET);
        trimmedArmorItem(ModItems.NEOPLATINUM_CHESTPLATE);
        trimmedArmorItem(ModItems.NEOPLATINUM_LEGGINGS);
        trimmedArmorItem(ModItems.NEOPLATINUM_BOOTS);
        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_SHOVEL);
        handheldItem(ModItems.COPPER_HOE);
        trimmedArmorItem(ModItems.COPPER_HELMET);
        trimmedArmorItem(ModItems.COPPER_CHESTPLATE);
        trimmedArmorItem(ModItems.COPPER_LEGGINGS);
        trimmedArmorItem(ModItems.COPPER_BOOTS);
        simpleItem(ModItems.ENDER_TEAR);
        simpleItem(ModItems.SYNTHETIC_DRAGON_CORE);
        simpleItem(ModItems.DRAGON_CORE);
        simpleItem(ModItems.DRAGON_CHARGE);
        handheldItem(ModItems.WRENCH);
        handheldItem(ModItems.WOODEN_BAT);
        handheldItem(ModItems.METAL_BAT);
        handheldItem(ModItems.DIAMOND_BAT);
        handheldItem(ModItems.NETHERITE_BAT);
        handheldItem(ModItems.METAL_PIPE);
        handheldItem(ModItems.OBSIDIAN_KNIFE);
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = PlatinumMod.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PlatinumMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(PlatinumMod.MOD_ID,"item/" + item.getId().getPath()));
    }

}
