package com.suatae.nobedrock.common.core;

import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;

import com.suatae.nobedrock.common.core.lib.REF;
import com.suatae.nobedrock.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class NBEventHandler {
	// @SubscribeEvent(priority = EventPriority.NORMAL)
	// public void onEvent(NameFormat.NameFormat event) {
	// if (event.username == "Suatae") {
	// event.displayname = event.username + " the Engineer";
	// }
	// else
	// if (event.username == "Omegami") {
	// event.displayname = event.username + " the Mage";
	// }
	// }

	@SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
	public void onEvent(PopulateChunkEvent.Pre event) {
		Chunk chunk = event.world.getChunkFromChunkCoords(event.chunkX, event.chunkZ);

		for (ExtendedBlockStorage storage : chunk.getBlockStorageArray()) {
			if (storage != null) {
				for (int x = 0; x < 16; ++x) {
					for (int y = 0; y < 16; ++y) {
						for (int z = 0; z < 16; ++z) {
							if (storage.getBlockByExtId(x, y, z) == REF.fromBlock) {
								storage.func_150818_a(x, y, z, REF.toBlock);
								LogHelper.info("IT SHOULD BE WORKING!!!!!!!!!!!!!!!!!!!!!!!!");
							}
						}
					}

				}
			}
		}

		chunk.isModified = true;
	}

}
