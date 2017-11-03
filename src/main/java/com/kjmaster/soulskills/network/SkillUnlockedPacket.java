package com.kjmaster.soulskills.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class SkillUnlockedPacket implements IMessage {

    public SkillUnlockedPacket() {}
    public String skill;
    public SkillUnlockedPacket(String skill) {this.skill = skill;}

    @Override
    public void fromBytes(ByteBuf buf) {skill = ByteBufUtils.readUTF8String(buf); }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, skill);
    }
}
