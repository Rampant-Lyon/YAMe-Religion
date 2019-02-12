package com.sirniloc.yam.econ.capability;

import com.sirniloc.yam.econ.capability.interfaces.IReli;
import com.sirniloc.yam.econ.nbt.ReliNBT;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class Reli implements IReli, INBTSerializable<NBTTagCompound> {
	
	private int god=-1;

	public Reli(EntityLivingBase object) {
		// TODO Auto-generated constructor stub
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

}
