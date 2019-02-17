package com.sirniloc.yam.reli.capability;

import com.sirniloc.yam.reli.capability.interfaces.IReli;
import com.sirniloc.yam.reli.nbt.ReliNBT;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class Reli implements IReli, INBTSerializable<NBTTagCompound> {
	
	private int god=-1;
	private double alignment = 0;
	private double favor = 0;
	private EntityLivingBase theEntity;

	public Reli(EntityLivingBase o) {
		this.setTheEntity(o);
	}

	@Override
	public NBTTagCompound serializeNBT() {
		return (NBTTagCompound) ReliNBT.writeNBT(null, this, null);
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		ReliNBT.readNBT(null, this, null, nbt);
	}

	@Override
	public void setGod(int d) {
		god=d;
	}

	@Override
	public int getGod() {
		return god;
	}

	@Override
	public void cloneABS(Reli abs) {
		god=abs.getGod();		
	}

	@Override
	public Reli getReli() {
		return this;
	}

	public double getAlignment() {
		return alignment;
	}

	public void setAlignment(double alignment) {
		this.alignment = alignment;
	}

	@Override
	public void setDivineFavor(double d) {
		favor=d;		
	}

	@Override
	public double getDivineFavor() {
		return favor;
	}

	public EntityLivingBase getTheEntity() {
		return theEntity;
	}

	public void setTheEntity(EntityLivingBase theEntity) {
		this.theEntity = theEntity;
	}

}
