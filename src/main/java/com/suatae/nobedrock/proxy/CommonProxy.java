package com.suatae.nobedrock.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;





public class CommonProxy {

	public void preInit() {}

	public void Init() {}

	public void postInit() {}

	public EntityPlayer getClientPlayer() {
		return Minecraft.getMinecraft().thePlayer;

	}

}
