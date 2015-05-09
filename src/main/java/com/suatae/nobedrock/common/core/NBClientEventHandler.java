package com.suatae.nobedrock.common.core;

import net.minecraftforge.event.entity.player.PlayerEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class NBClientEventHandler {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onEvent(PlayerEvent.NameFormat event) {
		if (event.username == "Suatae") {
			event.displayname = event.username + " the Engineer";
		}
		else
			if (event.username == "Omegami") {
				event.displayname = event.username + " the Mage";
			}
			else {
				event.displayname = "Jobe";

			}

	}

}
