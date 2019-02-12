package com.sirniloc.yam.econ.capability;

import com.sirniloc.yam.econ.BaseReli;
import com.sirniloc.yam.econ.capability.interfaces.IReli;
import com.sirniloc.yam.util.SimpleCapabilityProvider;

import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class CapabilityReli {
	public static void postInit()
	{
		CapabilityManager.INSTANCE.register(IReli.class, new StorageReli(), new StorageReli.Factory());
	}	

	public static ICapabilityProvider createProvider(IReli absCap) {		
		return new SimpleCapabilityProvider<IReli>(BaseReli.RELI_CAP, null, absCap);
	}
	
}
