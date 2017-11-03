package com.kjmaster.soulskills.events;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.skills.ISkills;
import com.kjmaster.soulskills.skills.SkillsProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class SkillsEvents {
    @SubscribeEvent
    public void onDmg(LivingHurtEvent event) {
        if(event.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntity();
            ISkills skillsCap = player.getCapability(SkillsProvider.SKILLS_CAPABILITY, null);
            Entity attackEntity = event.getSource().getTrueSource();
            if (attackEntity instanceof EntityBlaze) {
                float newDamage = doBlazeShieldReduction(skillsCap, event);
                event.setAmount(newDamage);
                SoulSkills.LOGGER.info("Damage: " + newDamage);
            }
        }
    }

    private float doBlazeShieldReduction(ISkills skillsCap, LivingHurtEvent event) {
        if(skillsCap.isSkillUnlocked("BlazeShield4"))
            return event.getAmount() - (event.getAmount() * 0.4F);
        else if (skillsCap.isSkillUnlocked("BlazeShield3"))
             return event.getAmount() - (event.getAmount() * 0.3F);
        else if (skillsCap.isSkillUnlocked("BlazeShield2"))
            return event.getAmount() - (event.getAmount() * 0.2F);
        else if(skillsCap.isSkillUnlocked("BlazeShield1"))
            return event.getAmount() - (event.getAmount() * 0.1F);
        else
            return event.getAmount();
    }
}
