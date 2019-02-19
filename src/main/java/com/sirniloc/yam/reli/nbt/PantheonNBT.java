package com.sirniloc.yam.reli.nbt;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class PantheonNBT {
	public static void readNBT(Capability<IPantheon> capability, IPantheon instance, EnumFacing side, NBTBase nbt) {
		if(nbt instanceof NBTTagCompound) {
			NBTTagCompound tag = (NBTTagCompound)nbt;
			instance.setInfluence(tag.getIntArray("influence"));
		}
	}
	
	public static NBTBase writeNBT(Capability<IPantheon> capability, IPantheon instance, EnumFacing side) {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setIntArray("influence", instance.getInfluence());
		return nbt;
	}
}
