package com.sirniloc.yam.reli;

import com.sirniloc.yam.reli.capability.CapabilityReli;
import com.sirniloc.yam.reli.capability.interfaces.IReli;
import com.sirniloc.yam.reli.events.AlignmentEvents;
import com.sirniloc.yam.reli.events.DomainEvents;
import com.sirniloc.yam.reli.events.GodEvents;
import com.sirniloc.yam.reli.events.ReliEvents;

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
    
    public static final int EVENT_DOMAIN = 9999;
    public static final int EVENT_ALIGNMENT = EVENT_DOMAIN*2;
    public static final int EVENT_GOD = EVENT_ALIGNMENT*2;
    
    
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
    	MinecraftForge.EVENT_BUS.register(new GodEvents());
    	MinecraftForge.EVENT_BUS.register(new DomainEvents());
    	MinecraftForge.EVENT_BUS.register(new AlignmentEvents());
    }
    @EventHandler
    public void postInit(FMLInitializationEvent event)    {
    	CapabilityReli.postInit();
    }
    
}
