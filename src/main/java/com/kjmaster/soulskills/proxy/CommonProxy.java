package com.kjmaster.soulskills.proxy;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.handlers.*;
import com.kjmaster.soulskills.network.*;
import com.kjmaster.soulskills.skills.ISkills;
import com.kjmaster.soulskills.skills.Skills;
import com.kjmaster.soulskills.skills.SkillsStorage;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.Souls;
import com.kjmaster.soulskills.souls.SoulsStorage;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;

import static com.kjmaster.soulskills.network.SoulSkillsPacketInstance.INSTANCE;

/**
 * Created by pbill_000 on 28/08/2017.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {}
    public void init(FMLInitializationEvent event) {}
    public void postInit(FMLPostInitializationEvent event) {}
    public void serverStopping(FMLServerStoppingEvent event) {}
    public void serverStarting(FMLServerStartingEvent event) {}
    public static void registerCapsAndPackets() {
        CapabilityManager.INSTANCE.register(ISouls.class, new SoulsStorage(), Souls.class);
        CapabilityManager.INSTANCE.register(ISkills.class, new SkillsStorage(), Skills.class);

        //Server
        INSTANCE.registerMessage(GetSoulsHandler.class, GetSoulsPacket.class, 1, Side.SERVER);
        INSTANCE.registerMessage(SkillUnlockHandler.class, SkillUnlockedPacket.class, 2, Side.SERVER);

        //Client
        INSTANCE.registerMessage(SetSoulsHandler.class, SetSoulsPacket.class, 3, Side.CLIENT);
        INSTANCE.registerMessage(SnackbarHandler.class, SnackbarPacket.class, 4, Side.CLIENT);
        INSTANCE.registerMessage(ClientSkillHandler.class, ClientSkillPacket.class, 5, Side.CLIENT);
    }

    @SidedProxy(clientSide = SoulSkills.CLIENT_PROXY, serverSide = SoulSkills.COMMON_PROXY)
    public static CommonProxy proxy;
}
