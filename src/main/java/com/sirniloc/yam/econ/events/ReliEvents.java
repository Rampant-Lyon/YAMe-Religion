package com.sirniloc.yam.econ.events;

import com.sirniloc.yam.econ.BaseReli;
import com.sirniloc.yam.econ.capability.CapabilityReli;
import com.sirniloc.yam.econ.capability.Reli;
import com.sirniloc.yam.econ.capability.interfaces.IReli;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ReliEvents {

	@SubscribeEvent
	public void onAttachCapabilityEntity(AttachCapabilitiesEvent<Entity> event) {
		if(event.getObject() instanceof EntityPlayer) {
			
			final IReli absCap = new Reli((EntityLivingBase) event.getObject());
			event.addCapability(BaseReli.RELI_ID, CapabilityReli.createProvider(absCap));
		}
			
	}
	
	@SubscribeEvent
	public void onPlayerRespawn(PlayerEvent.Clone event) {		
		event.getEntityLiving().getCapability(BaseReli.RELI_CAP, null).cloneABS(event.getOriginal().getCapability(BaseReli.RELI_CAP, null).getReli());		
	}
}
