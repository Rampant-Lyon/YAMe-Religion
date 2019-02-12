package com.sirniloc.yam.econ;

import com.sirniloc.yam.econ.capability.CapabilityReli;
import com.sirniloc.yam.econ.capability.interfaces.IReli;
import com.sirniloc.yam.econ.events.ReliEvents;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = BaseReli.MODID, version = BaseReli.VERSION)
public class BaseReli
{
    public static final String MODID = "yam.reli";
    public static final String VERSION = "0.1";
    
    
    @CapabilityInject(IReli.class)
	public static Capability<IReli> RELI_CAP = null;	
	
	public static final ResourceLocation RELI_ID = new ResourceLocation(BaseReli.MODID, "CAPABILITY_RELI");

    
    @EventHandler
    public void preInit(FMLInitializationEvent event)    {
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new ReliEvents());
    }
    @EventHandler
    public void postInit(FMLInitializationEvent event)    {
    	CapabilityReli.postInit();
    }
    
}
