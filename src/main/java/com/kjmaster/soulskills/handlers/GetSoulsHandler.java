package com.kjmaster.soulskills.handlers;

import com.kjmaster.soulskills.network.GetSoulsPacket;
import com.kjmaster.soulskills.network.SetSoulsPacket;
import com.kjmaster.soulskills.network.SoulSkillsPacketInstance;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Created by pbill_000 on 31/08/2017.
 */
public class GetSoulsHandler implements IMessageHandler<GetSoulsPacket, IMessage> {

    @Override
    public IMessage onMessage(GetSoulsPacket message, MessageContext ctx) {
        String type = message.type;
        EntityPlayerMP player = ctx.getServerHandler().player;
        ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
        switch (type) {
            case "Blaze":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Blaze", soulsCap.getSouls("Blaze"))
                        , player);
                break;
            case "Boss":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Boss", soulsCap.getSouls("Boss"))
                        , player);
                break;
            case "Creeper":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Creeper", soulsCap.getSouls("Creeper"))
                        , player);
                break;
            case "Endermen":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Endermen", soulsCap.getSouls("Endermen"))
                        , player);
                break;
            case "Ghast":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Ghast", soulsCap.getSouls("Ghast"))
                        , player);
                break;
            case "Guardian":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Guardian", soulsCap.getSouls("Guardian"))
                        , player);
                break;
            case "Illager":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Illager", soulsCap.getSouls("Illager"))
                        , player);
                break;
            case "MagmaCube":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("MagmaCube", soulsCap.getSouls("MagmaCube"))
                        , player);
                break;
            case "Pigmen":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Pigmen", soulsCap.getSouls("Pigmen"))
                        , player);
                break;
            case "PolarBear":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("PolarBear", soulsCap.getSouls("PolarBear"))
                        , player);
                break;
            case "Shulker":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Shulker", soulsCap.getSouls("Shulker"))
                        , player);
                break;
            case "Silverfish":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Silverfish", soulsCap.getSouls("Silverfish"))
                        , player);
                break;
            case "Skeleton":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Skeleton", soulsCap.getSouls("Skeleton"))
                        , player);
                break;
            case "Slime":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Slime", soulsCap.getSouls("Slime"))
                        , player);
                break;
            case "Spider":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Spider", soulsCap.getSouls("Spider"))
                        , player);
                break;
            case "Witch":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Witch", soulsCap.getSouls("Witch"))
                        , player);
                break;
            case "WitherSkele":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("WitherSkele", soulsCap.getSouls("WitherSkele"))
                        , player);
                break;
            case "Zombie":
                SoulSkillsPacketInstance.INSTANCE.sendTo(
                        new SetSoulsPacket("Zombie", soulsCap.getSouls("Zombie"))
                        , player);
                break;
        }
        return null;
    }
}
