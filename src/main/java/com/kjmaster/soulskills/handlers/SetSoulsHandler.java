package com.kjmaster.soulskills.handlers;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.network.SetSoulsPacket;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Created by pbill_000 on 31/08/2017.
 */
public class SetSoulsHandler implements IMessageHandler<SetSoulsPacket, IMessage> {

    @Override
    public IMessage onMessage(SetSoulsPacket message, MessageContext ctx) {
        EntityPlayer player = Minecraft.getMinecraft().player;
        int souls = message.souls;
        String type = message.type;
        ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
        switch (type) {
            case "Blaze":
                soulsCap.setSouls(souls, "Blaze");
                break;
            case "Boss":
                soulsCap.setSouls(souls, "Boss");
                break;
            case "Creeper":
                soulsCap.setSouls(souls, "Creeper");
                break;
            case "Endermen":
                soulsCap.setSouls(souls, "Endermen");
                break;
            case "Ghast":
                soulsCap.setSouls(souls, "Ghast");
                break;
            case "Guardian":
                soulsCap.setSouls(souls, "Guardian");
                break;
            case "Illager":
                soulsCap.setSouls(souls, "Illager");
                break;
            case "MagmaCube":
                soulsCap.setSouls(souls, "MagmaCube");
                break;
            case "Pigmen":
                soulsCap.setSouls(souls, "Pigmen");
                break;
            case "PolarBear":
                soulsCap.setSouls(souls, "PolarBear");
                break;
            case "Shulker":
                soulsCap.setSouls(souls, "Shulker");
                break;
            case "Silverfish":
                soulsCap.setSouls(souls, "Silverfish");
                break;
            case "Skeleton":
                soulsCap.setSouls(souls, "Skeleton");
                break;
            case "Slime":
                soulsCap.setSouls(souls, "Slime");
                break;
            case "Spider":
                soulsCap.setSouls(souls, "Spider");
                break;
            case "Witch":
                soulsCap.setSouls(souls, "Witch");
                break;
            case "WitherSkele":
                soulsCap.setSouls(souls, "WitherSkele");
                break;
            case "Zombie":
                soulsCap.setSouls(souls, "Zombie");
                break;
            default:
                SoulSkills.LOGGER.info(SoulSkills.MODID + ": Something went wrong sending a souls packet");
                break;
        }
        return null;
    }
}
