package com.kjmaster.soulskills.events;

import com.kjmaster.soulskills.skills.ISkills;
import com.kjmaster.soulskills.skills.SkillsProvider;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * Created by pbill_000 on 31/08/2017.
 */
public class OnClone {
    @SubscribeEvent
    public final void onClone(PlayerEvent.Clone event) {
        if(event.isWasDeath()) {
            EntityPlayer player = event.getEntityPlayer();

            //Clone Souls
            ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
            ISouls oldSoulsCap = event.getOriginal().getCapability(SoulsProvider.SOULS_CAPABILITY, null);
            soulsCap.setSouls(oldSoulsCap.getSouls("Blaze"), "Blaze");
            soulsCap.setSouls(oldSoulsCap.getSouls("Boss"), "Boss");
            soulsCap.setSouls(oldSoulsCap.getSouls("Creeper"), "Creeper");
            soulsCap.setSouls(oldSoulsCap.getSouls("Endermen"), "Endermen");
            soulsCap.setSouls(oldSoulsCap.getSouls("Ghast"), "Ghast");
            soulsCap.setSouls(oldSoulsCap.getSouls("Guardian"), "Guardian");
            soulsCap.setSouls(oldSoulsCap.getSouls("Illager"), "Illager");
            soulsCap.setSouls(oldSoulsCap.getSouls("MagmaCube"), "MagmaCube");
            soulsCap.setSouls(oldSoulsCap.getSouls("Pigmen"), "Pigmen");
            soulsCap.setSouls(oldSoulsCap.getSouls("PolarBear"), "PolarBear");
            soulsCap.setSouls(oldSoulsCap.getSouls("Shulker"), "Shulker");
            soulsCap.setSouls(oldSoulsCap.getSouls("Silverfish"), "Silverfish");
            soulsCap.setSouls(oldSoulsCap.getSouls("Skeleton"), "Skeleton");
            soulsCap.setSouls(oldSoulsCap.getSouls("Slime"), "Slime");
            soulsCap.setSouls(oldSoulsCap.getSouls("Spider"), "Spider");
            soulsCap.setSouls(oldSoulsCap.getSouls("Witch"), "Witch");
            soulsCap.setSouls(oldSoulsCap.getSouls("WitherSkele"), "WitherSkele");
            soulsCap.setSouls(oldSoulsCap.getSouls("Zombie"), "Zombie");

            //Clone Skills
            ISkills skillsCap = player.getCapability(SkillsProvider.SKILLS_CAPABILITY, null);
            ISkills oldSkillsCap = event.getOriginal().getCapability(SkillsProvider.SKILLS_CAPABILITY, null);
            //Blaze
            skillsCap.setValue(oldSkillsCap.isSkillUnlocked("BlazeShield1"), "BlazeShield1");
            //Boss
            skillsCap.setValue(oldSkillsCap.isSkillUnlocked("BossShield1"), "BossShield1");

        }
    }
}
