package com.kjmaster.soulskills.events;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class PlayerJoinWorld {

    @SubscribeEvent
    public void onPlayerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {}
}
