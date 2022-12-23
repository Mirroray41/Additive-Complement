package net.zappfire.additive_complement;

import net.fabricmc.api.ModInitializer;
import net.zappfire.additive_complement.registry.BlockRegistry;
import net.zappfire.additive_complement.registry.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditiveComplement implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("additive_complement");
	public static final String MODID = "additive_complement";

	@Override
	public void onInitialize() {
		ItemRegistry.registerItems();
		BlockRegistry.registerBlocks();
		LOGGER.info("Additive Complement Initialized!");
	}
}
