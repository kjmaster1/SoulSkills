package com.kjmaster.soulskills.handlers;

import com.kjmaster.soulskills.network.ClientSkillPacket;
import com.kjmaster.soulskills.skills.ISkills;
import com.kjmaster.soulskills.skills.SkillsProvider;
import com.kjmaster.soulskills.souls.ISouls;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class ClientSkillHandler implements IMessageHandler<ClientSkillPacket, IMessage> {

    @Override
    public IMessage onMessage(ClientSkillPacket message, MessageContext ctx) {
        EntityPlayer player = Minecraft.getMinecraft().player;
        ISkills skillsCap = player.getCapability(SkillsProvider.SKILLS_CAPABILITY, null);
        String skill = message.skill;
        Boolean unlocked = message.unlocked;
        skillsCap.setValue(unlocked, skill);
        return null;
    }
}
