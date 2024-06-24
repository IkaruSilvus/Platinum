package net.ikaru.platinummod.datagen;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.item.ModItems;
import net.ikaru.platinummod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, PlatinumMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("dragon_core_from_ender_dragon", new AddItemModifier(new LootItemCondition[] {
               new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()}, ModItems.DRAGON_CORE.get()));
    }
}
