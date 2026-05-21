package com.peak.forlorn.impl;

import com.peak.forlorn.impl.index.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Forlorn implements ModInitializer {
	public static final String MOD_ID = "forlorn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public void onInitialize() {
        ForlornItems.init();
        ForlornBlocks.init();
        ForlornItemGroups.init();

        ForlornComponentTypes.init();
        ForlornBlockEntityTypes.init();

		LOGGER.info("Cults n shi");
	}

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}