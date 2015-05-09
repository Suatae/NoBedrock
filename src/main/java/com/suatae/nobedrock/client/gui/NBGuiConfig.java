package com.suatae.nobedrock.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

import com.suatae.nobedrock.common.core.lib.REF;
import com.suatae.nobedrock.utility.ConfigUtil;

import cpw.mods.fml.client.config.GuiConfig;





public class NBGuiConfig extends GuiConfig {

	public NBGuiConfig(GuiScreen parent) {
		super(parent, new ConfigElement(
				ConfigUtil.configuration.getCategory("dev mode"))
				.getChildElements(), REF.MOD_ID, false, false, GuiConfig
				.getAbridgedConfigPath(ConfigUtil.configuration.toString()));
	}
}
