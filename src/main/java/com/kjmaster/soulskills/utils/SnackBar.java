package com.kjmaster.soulskills.utils;

import com.kjmaster.soulskills.network.SnackbarPacket;
import com.kjmaster.soulskills.network.SoulSkillsPacketInstance;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class SnackBar {

    public static void sendSnackbarToClient(String msg, EntityPlayerMP player) {
        SoulSkillsPacketInstance.INSTANCE.sendTo(new SnackbarPacket(msg), player);
    }
}
