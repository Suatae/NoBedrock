package com.suatae.nobedrock;

import net.minecraftforge.common.MinecraftForge;

import com.suatae.nobedrock.common.core.NBEventHandler;
import com.suatae.nobedrock.common.core.lib.REF;
import com.suatae.nobedrock.proxy.CommonProxy;
import com.suatae.nobedrock.utility.ConfigUtil;
import com.suatae.nobedrock.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;





@Mod(modid = REF.MOD_ID, name = REF.MOD_NAME, version = REF.VERSION, guiFactory = REF.GUI_FACTORY_CLASS)
public class NoBedrock {
	@Mod.Instance(REF.MOD_ID)
	public static NoBedrock		instance;

	@SidedProxy(clientSide = REF.CLIENTSIDE, serverSide = REF.SERVERSIDE)
	public static CommonProxy	proxy;

	@Mod.EventHandler
	public static void PreLoad(FMLPreInitializationEvent event) {

		if (ConfigUtil.DebugMode) {
			LogHelper.info("[Pre-Initialization]: --- Loading ---");

			proxy.preInit();
			MinecraftForge.EVENT_BUS.register(new NBEventHandler());
			LogHelper.info("Bedrock Replaced");

			ConfigUtil.init(event.getSuggestedConfigurationFile());
			FMLCommonHandler.instance().bus().register(new ConfigUtil());
		}
		else {
			proxy.preInit();
			MinecraftForge.EVENT_BUS.register(new NBEventHandler());

			ConfigUtil.init(event.getSuggestedConfigurationFile());
			FMLCommonHandler.instance().bus().register(new ConfigUtil());
		}

		if (ConfigUtil.DebugMode) {
			LogHelper.info("[Pre-Initialization]: --- Complete! ---");
		}
		else {}

	}

	@Mod.EventHandler
	public static void Load(FMLInitializationEvent event) {

		if (ConfigUtil.DebugMode) {
			LogHelper.info("[Initialization]: --- Loading ---");
			proxy.Init();
		}
		else {
			proxy.Init();
		}

		if (ConfigUtil.DebugMode) {
			LogHelper.info("The Monkey is ready with the Screwdriver");
			LogHelper.info("[Initialization]: --- Complete! ---");
		}
		else {}

	}

	@Mod.EventHandler
	public static void PostLoad(FMLPostInitializationEvent event) {

		if (ConfigUtil.DebugMode) {
			LogHelper.info("[Post-Initialization]: --- Loading ---");
			proxy.postInit();
			LogHelper.info("[Post-Initialization]: --- Complete! ---");
		}
		else {
			proxy.postInit();
		}

	}

}
