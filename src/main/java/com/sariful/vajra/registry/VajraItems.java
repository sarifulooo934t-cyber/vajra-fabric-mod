package com.sariful.vajra.registry;

import java.util.function.Function;

import com.sariful.vajra.VajraMod;
import com.sariful.vajra.item.VajraItem;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorType;

public final class VajraItems {
	private VajraItems() {
	}

	public static final Item VAJRA_INGOT = register("vajra_ingot", Item::new,
			new Item.Properties().rarity(Rarity.UNCOMMON));

	public static final Item VAJRA = register("vajra", VajraItem::new,
			new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant());

	public static final Item VAJRA_SWORD = register("vajra_sword", Item::new,
			new Item.Properties().sword(VajraMaterials.VAJRA_TOOL, 3.5F, -2.4F).rarity(Rarity.RARE));

	public static final Item VAJRA_PICKAXE = register("vajra_pickaxe", Item::new,
			new Item.Properties().pickaxe(VajraMaterials.VAJRA_TOOL, 1.5F, -2.8F));

	public static final Item VAJRA_AXE = register("vajra_axe", Item::new,
			new Item.Properties().axe(VajraMaterials.VAJRA_TOOL, 5.5F, -3.0F));

	public static final Item VAJRA_SHOVEL = register("vajra_shovel", Item::new,
			new Item.Properties().shovel(VajraMaterials.VAJRA_TOOL, 1.5F, -3.0F));

	public static final Item VAJRA_HOE = register("vajra_hoe", Item::new,
			new Item.Properties().hoe(VajraMaterials.VAJRA_TOOL, 0.0F, 0.0F));

	public static final Item VAJRA_HELMET = register("vajra_helmet", Item::new,
			new Item.Properties().humanoidArmor(VajraMaterials.VAJRA_ARMOR, ArmorType.HELMET).rarity(Rarity.RARE));

	public static final Item VAJRA_CHESTPLATE = register("vajra_chestplate", Item::new,
			new Item.Properties().humanoidArmor(VajraMaterials.VAJRA_ARMOR, ArmorType.CHESTPLATE).rarity(Rarity.RARE));

	public static final Item VAJRA_LEGGINGS = register("vajra_leggings", Item::new,
			new Item.Properties().humanoidArmor(VajraMaterials.VAJRA_ARMOR, ArmorType.LEGGINGS).rarity(Rarity.RARE));

	public static final Item VAJRA_BOOTS = register("vajra_boots", Item::new,
			new Item.Properties().humanoidArmor(VajraMaterials.VAJRA_ARMOR, ArmorType.BOOTS).rarity(Rarity.RARE));

	public static void register() {
		// Static initialisers above perform the registration.
		VajraMod.LOGGER.debug("Registered Vajra items");
	}

	private static <T extends Item> T register(String name, Function<Item.Properties, T> factory, Item.Properties properties) {
		ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, VajraMod.id(name));
		T item = factory.apply(properties.setId(key));
		return Registry.register(BuiltInRegistries.ITEM, key, item);
	}
}
