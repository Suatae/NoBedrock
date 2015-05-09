package com.suatae.nobedrock.common.core.lib;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;





public class REF {
	public static final String	MOD_ID				= "NoBedrock";
	public static final String	MOD_NAME			= "No Bedrock";
	public static final String	VERSION				= "1.7.10-1.1";
	public static final String	CLIENTSIDE			= "com.suatae.nobedrock.proxy.ClientProxy";
	public static final String	SERVERSIDE			= "com.suatae.nobedrock.proxy.ServerProxy";
	public static final String	GUI_FACTORY_CLASS	= "com.suatae.nobedrock.client.gui.NBGuiFactory";

	// Config Types
	public static String		DEBUG				= "DEV MODE";

	public static Block			fromBlock			= Blocks.bedrock;
	public static Block			toBlock				= Blocks.end_stone;

}
