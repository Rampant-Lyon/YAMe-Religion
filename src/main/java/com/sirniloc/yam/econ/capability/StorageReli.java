package com.sirniloc.yam.econ.capability;

import java.util.concurrent.Callable;

import com.sirniloc.yam.econ.capability.interfaces.IReli;
import com.sirniloc.yam.econ.nbt.ReliNBT;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class StorageReli implements IStorage<IReli>{

	@Override
	public NBTBase writeNBT(Capability<IReli> capability, IReli instance, EnumFacing side) {		
		return ReliNBT.writeNBT(capability, instance, side);
	}

	@Override
	public void readNBT(Capability<IReli> capability, IReli instance, EnumFacing side, NBTBase nbt) {
		ReliNBT.readNBT(capability, instance, side, nbt);		
	}
	
	public static class Factory implements Callable<IReli> {
		@Override
		public IReli call() throws Exception {
			return new Reli(null);
		}
	}

}
