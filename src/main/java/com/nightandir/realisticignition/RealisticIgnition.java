package com.nightandir.realisticignition;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RealisticIgnition implements ModInitializer {
    public static final String MOD_ID = "realistic_ignition";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Realistic Ignition initialized. Furnace ignition behavior is not yet implemented in this scaffold.");
    }
}
