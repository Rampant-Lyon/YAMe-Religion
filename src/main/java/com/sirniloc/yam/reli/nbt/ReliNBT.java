package com.sirniloc.yam.reli.nbt;

import com.sirniloc.yam.reli.capability.interfaces.IReli;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class ReliNBT {
	public static void readNBT(Capability<IReli> capability, IReli instance, EnumFacing side, NBTBase nbt) {
		if(nbt instanceof NBTTagCompound) {
			NBTTagCompound tag = (NBTTagCompound)nbt;
			instance.setGod(tag.getInteger("god"));
			instance.setAlignment(tag.getDouble("morality"));
			instance.setDivineFavor(tag.getDouble("divine_favor"));
		}
	}
	
	public static NBTBase writeNBT(Capability<IReli> capability, IReli instance, EnumFacing side) {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("god", instance.getGod());
		nbt.setDouble("morality", instance.getAlignment());
		nbt.setDouble("divine_favor", instance.getDivineFavor());
		return nbt;
	}
}
