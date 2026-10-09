package com.sariful.vajra.registry;

import java.util.Map;

import com.sariful.vajra.VajraMod;
import com.sariful.vajra.VajraTags;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.sounds.SoundEvents;

public final class VajraMaterials {
	private VajraMaterials() {
	}

	public static final ToolMaterial VAJRA_TOOL = new ToolMaterial(
			BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
			2400, 9.5F, 4.5F, 20,
			VajraTags.REPAIRS_VAJRA
	);

	public static final ResourceKey<EquipmentAsset> VAJRA_EQUIPMENT_ASSET = ResourceKey.create(
			ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset")),
			VajraMod.id("vajra")
	);

	public static final ArmorMaterial VAJRA_ARMOR = new ArmorMaterial(
			40,
			Map.of(
					ArmorType.BOOTS, 3,
					ArmorType.LEGGINGS, 6,
					ArmorType.CHESTPLATE, 8,
					ArmorType.HELMET, 4,
					ArmorType.BODY, 12
			),
			20,
			SoundEvents.ARMOR_EQUIP_NETHERITE,
			3.5F, 0.1F,
			VajraTags.REPAIRS_VAJRA,
			VAJRA_EQUIPMENT_ASSET
	);
}
