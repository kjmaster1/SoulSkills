package com.kjmaster.soulskills.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class ClientSkillPacket implements IMessage {
    public ClientSkillPacket(){}
    public String skill;
    public Boolean unlocked;
    public ClientSkillPacket(String skill, Boolean unlocked) {
        this.skill = skill;
        this.unlocked = unlocked;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        skill = ByteBufUtils.readUTF8String(buf);
        unlocked = buf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, skill);
        buf.writeBoolean(unlocked);
    }
}
