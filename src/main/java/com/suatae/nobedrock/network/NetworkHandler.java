package com.suatae.nobedrock.network;

import com.suatae.nobedrock.common.core.lib.REF;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;





public class NetworkHandler {
	private static SimpleNetworkWrapper	INSTANCE;

	public static void init() {
		INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(REF.MOD_ID);
	}

}
