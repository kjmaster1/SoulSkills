package com.kjmaster.soulskills.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/**
 * Created by pbill_000 on 31/08/2017.
 */
public class SetSoulsPacket implements IMessage {
    public SetSoulsPacket(){}
    public String type;
    public int souls;
    public  SetSoulsPacket(String type, int souls) {
        this.type = type;
        this.souls = souls;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        type = ByteBufUtils.readUTF8String(buf);
        souls = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, type);
        buf.writeInt(souls);
    }
}
