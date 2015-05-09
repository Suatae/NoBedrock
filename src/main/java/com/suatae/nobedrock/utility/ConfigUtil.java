package com.suatae.nobedrock.utility;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.suatae.nobedrock.common.core.lib.REF;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class ConfigUtil {
	public static Configuration	configuration;

	// Debug
	public static boolean		DebugMode;
	public static final boolean	Debug			= false;
	public static final String	Debug_comment	= "Set to true if you want log checks.";

	public static void init(File configFile) // Create the configuration object
												// from the given configuration
												// file
	{
		if (configuration == null) {
			try {
				configuration = new Configuration(configFile);
			}
			catch (Exception e) {
				LogHelper.info("Config file already exists");
			}
			finally {
				loadConfiguration();
				LogHelper.info("Config file LOADED");
			}
		}
	}

	@SubscribeEvent
	// Load configuration file
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(REF.MOD_ID)) {
			try {
				loadConfiguration();
				LogHelper.info("Config file LOADED");
			}
			catch (Exception e) {
				LogHelper.info("Config file --ERROR--");
			}
		}
	}

	private static void loadConfiguration() // Configuration Elements
	{
		if (ConfigUtil.DebugMode) {
			LogHelper.info("Config Parameters --- BEGIN ---");
		}
		else {}

		// Debug Mode
		DebugMode = configuration.getBoolean("DebugMode", REF.DEBUG, Debug, Debug_comment);

		if (ConfigUtil.DebugMode) {
			LogHelper.info("Debug Mode: " + DebugMode);

			LogHelper.info("Config Parameters --- END ---");
		}
		else {}

		if (configuration.hasChanged()) // Save the configuration file
		{
			configuration.save();
			LogHelper.info("Config Saved");
		}
	}

}
