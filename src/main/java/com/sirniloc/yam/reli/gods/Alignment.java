package com.sirniloc.yam.reli.gods;

import java.awt.Color;

import net.minecraft.util.math.MathHelper;

public class Alignment {

	String name;
	int min,max;
	Color c;
	
	public Alignment(String name, int min, int max) {
		this.min=MathHelper.clamp(min, -255, 255);
		this.max=MathHelper.clamp(max, -255, 255);
		this.name=name;
		c= MoralitySystem.getMoralityColor(this.max-this.min);
	}
	
	public boolean isInRange(double d) {
		return (d>=min && d<=max);
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
	
	
}
