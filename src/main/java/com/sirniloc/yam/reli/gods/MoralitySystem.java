package com.sirniloc.yam.reli.gods;

import java.awt.Color;

import net.minecraft.entity.EntityLivingBase;

public class MoralitySystem {
	public static void doMorality(EntityLivingBase e) {
		
	}
	public static Color getMoralityColor(int i) {
		i = (i+255)/2;
		return new Color(i,i,i);		
	}
}
