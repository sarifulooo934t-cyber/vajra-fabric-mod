package com.sariful.vajra.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public final class VajraCreativeTabs {
	private VajraCreativeTabs() {
	}

	public static void register() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries ->
				entries.accept(VajraItems.VAJRA_INGOT));

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries ->
				entries.accept(VajraBlocks.VAJRA_BLOCK));

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries ->
				entries.accept(VajraBlocks.VAJRA_ORE));

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(entries -> {
			entries.accept(VajraItems.VAJRA);
			entries.accept(VajraItems.VAJRA_SWORD);
			entries.accept(VajraItems.VAJRA_HELMET);
			entries.accept(VajraItems.VAJRA_CHESTPLATE);
			entries.accept(VajraItems.VAJRA_LEGGINGS);
			entries.accept(VajraItems.VAJRA_BOOTS);
		});

		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
			entries.accept(VajraItems.VAJRA_PICKAXE);
			entries.accept(VajraItems.VAJRA_AXE);
			entries.accept(VajraItems.VAJRA_SHOVEL);
			entries.accept(VajraItems.VAJRA_HOE);
		});
	}
}
