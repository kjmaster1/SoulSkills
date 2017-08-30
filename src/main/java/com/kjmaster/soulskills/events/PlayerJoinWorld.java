package com.kjmaster.soulskills.events;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class PlayerJoinWorld {

    @SubscribeEvent
    public void onPlayerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {
        EntityPlayer player = event.player;
        World world = player.world;
        if(!(world.isRemote)) {
            ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
            soulsCap.addSouls(10, "Blaze");
            int soulsBlaze = soulsCap.getSouls("Blaze");
            SoulSkills.LOGGER.info("Blaze Souls: " + soulsBlaze);
        }
    }
}
