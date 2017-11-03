package com.kjmaster.soulskills.network;

import com.kjmaster.soulskills.SoulSkills;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class SoulSkillsPacketInstance {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(SoulSkills.MODID);
}
