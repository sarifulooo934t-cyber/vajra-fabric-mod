package com.sariful.vajra;

import com.sariful.vajra.registry.VajraBlocks;
import com.sariful.vajra.registry.VajraCreativeTabs;
import com.sariful.vajra.registry.VajraItems;
import com.sariful.vajra.registry.VajraWorldGen;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VajraMod implements ModInitializer {
	public static final String MOD_ID = "vajra";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		VajraItems.register();
		VajraBlocks.register();
		VajraWorldGen.register();
		VajraCreativeTabs.register();
		LOGGER.info("Vajra loaded - Indra's thunder descends!");
	}
}
