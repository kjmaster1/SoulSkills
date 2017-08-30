package com.kjmaster.soulskills.handlers;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class CapabilityHandler {
    public static final ResourceLocation SOULS_CAPABILITY = new ResourceLocation(SoulSkills.MODID, "Souls");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (!(event.getObject() instanceof EntityPlayer)) return;
        event.addCapability(SOULS_CAPABILITY, new SoulsProvider());
    }
}
