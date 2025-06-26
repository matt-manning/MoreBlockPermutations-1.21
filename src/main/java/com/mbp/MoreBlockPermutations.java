package com.mbp;

import com.mbp.block.ModBlocks;
import com.mbp.item.ModItemGroups;
import com.mbp.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBlockPermutations implements ModInitializer {
	public static final String MOD_ID = "more-block-permutations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}