package com.kjmaster.soulskills;

import com.kjmaster.soulskills.client.gui.survivaltab.SurvivalTabClick;
import com.kjmaster.soulskills.events.EntityDeathEvent;
import com.kjmaster.soulskills.events.PlayerJoinWorld;
import com.kjmaster.soulskills.events.SkillsEvents;
import com.kjmaster.soulskills.handlers.CapabilityHandler;
import com.kjmaster.soulskills.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.kjmaster.soulskills.proxy.CommonProxy.proxy;

@Mod(modid = SoulSkills.MODID, version = SoulSkills.VERSION)
public class SoulSkills
{
    @Mod.Instance
    public static SoulSkills instance;

    public static final String MODID = "soulskills";
    public static final String VERSION = "1.0";
    public static final String NAME = "Soul Skills";
    public static final String CLIENT_PROXY = "com.kjmaster.soulskills.proxy.ClientProxy";
    public static final String COMMON_PROXY = "com.kjmaster.soulskills.proxy.CommonProxy";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LOGGER.info("Starting Pre-Initialization");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LOGGER.info("Starting Initialization");
        proxy.init(event);
        MinecraftForge.EVENT_BUS.register(new SurvivalTabClick());
        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
        MinecraftForge.EVENT_BUS.register(new PlayerJoinWorld());
        MinecraftForge.EVENT_BUS.register(new EntityDeathEvent());
        MinecraftForge.EVENT_BUS.register(new SkillsEvents());
        CommonProxy.registerCapsAndPackets();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LOGGER.info("Starting Post-Initialization");
        proxy.postInit(event);
    }

    public static final Logger LOGGER = LogManager.getLogger(SoulSkills.MODID);
}
