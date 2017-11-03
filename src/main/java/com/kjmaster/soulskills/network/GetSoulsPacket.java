package com.kjmaster.soulskills.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

/**
 * Created by pbill_000 on 31/08/2017.
 */
public class GetSoulsPacket implements IMessage {

    public GetSoulsPacket(){}
    public String type;
    public  GetSoulsPacket(String type) {this.type = type;}

    @Override
    public void fromBytes(ByteBuf buf) {
        type = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf, type);
    }
}
