package com.suatae.nobedrock.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;





public class ClientProxy extends CommonProxy {

	@Override
	public void preInit() {}

	@Override
	public void Init() {}

	@Override
	public void postInit() {}

	@Override
	public EntityPlayer getClientPlayer() {
		return Minecraft.getMinecraft().thePlayer;

	}
}
