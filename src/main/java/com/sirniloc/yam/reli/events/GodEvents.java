package com.sirniloc.yam.reli.events;

import com.sirniloc.yam.reli.pantheon.Pantheon;

import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.living.AnimalTameEvent;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GodEvents {

	
	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent event) {
		Pantheon.GODS[1].addInfluence(2);
		Pantheon.GODS[0].addInfluence(1);
	}
	@SubscribeEvent
	public void onLivingHeal(LivingHealEvent event) {
		Pantheon.GODS[2].addInfluence(2);
		Pantheon.GODS[0].addInfluence(1);
	}
	@SubscribeEvent
	public void onTame(AnimalTameEvent event) {
		Pantheon.GODS[0].addInfluence(10);
	}
	@SubscribeEvent
	public void onDeath(LivingDeathEvent event) {
		Pantheon.GODS[1].addInfluence(5);
	}
	@SubscribeEvent
	public void onBirth(BabyEntitySpawnEvent event) {
		Pantheon.GODS[2].addInfluence(6);
	}
	@SubscribeEvent
	public void onLightning(EntityStruckByLightningEvent event) {
		//TODO Zues Pantheon.GODS[2].addInfluence(6); 
	}
	
	/*
	if(event.getEntityLiving().hasCapability(BaseReli.RELI_CAP, null)) {		
		Reli modChar = event.getEntityLiving().getCapability(BaseReli.RELI_CAP, null).getReli();
		GodEvents.doEvent(modChar);
	}*/
	
}
