package com.sariful.vajra;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class VajraTags {
	private VajraTags() {
	}

	public static final TagKey<Item> REPAIRS_VAJRA = TagKey.create(Registries.ITEM, VajraMod.id("repairs_vajra"));
}
