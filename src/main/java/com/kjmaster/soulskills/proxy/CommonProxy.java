package com.kjmaster.soulskills.proxy;

import com.kjmaster.soulskills.SoulSkills;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

/**
 * Created by pbill_000 on 28/08/2017.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {}
    public void init(FMLInitializationEvent event) {}
    public void postInit(FMLPostInitializationEvent event) {}
    public void serverStopping(FMLServerStoppingEvent event) {}
    public void serverStarting(FMLServerStartingEvent event) {}

    @SidedProxy(clientSide = SoulSkills.CLIENT_PROXY, serverSide = SoulSkills.COMMON_PROXY)
    public static CommonProxy proxy;
}
