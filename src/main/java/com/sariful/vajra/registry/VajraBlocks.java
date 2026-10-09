package com.sariful.vajra.registry;

import com.sariful.vajra.VajraMod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class VajraBlocks {
	private VajraBlocks() {
	}

	public static final Block VAJRA_BLOCK = registerBlock("vajra_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_CYAN)
					.strength(6.0F, 9.0F)
					.requiresCorrectToolForDrops()
					.sound(SoundType.METAL));

	public static final Block VAJRA_ORE = registerBlock("vajra_ore",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.STONE)
					.strength(4.5F, 4.5F)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE));

	public static void register() {
		VajraMod.LOGGER.debug("Registered Vajra blocks");
	}

	private static Block registerBlock(String name, BlockBehaviour.Properties properties) {
		ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, VajraMod.id(name));
		Block block = new Block(properties.setId(blockKey));
		Registry.register(BuiltInRegistries.BLOCK, blockKey, block);

		ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, VajraMod.id(name));
		Registry.register(BuiltInRegistries.ITEM, itemKey,
				new BlockItem(block, new Item.Properties().setId(itemKey)));
		return block;
	}
}
