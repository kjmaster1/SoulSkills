package com.kjmaster.soulskills.events;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by pbill_000 on 28/08/2017.
 */
public class EntityDeathEvent {
    @SubscribeEvent
    public void onDeath(LivingDeathEvent event) {
        DamageSource source = event.getSource();
        if(source.getTrueSource() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) source.getTrueSource();
            Entity entity = event.getEntity();
            doSouls(player, entity, event);
        }
    }

    private void doSouls(EntityPlayer player, Entity entity, LivingDeathEvent event) {
        World world = player.world;
        if(!(world.isRemote)) {
            ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
            //Checking Mob
            if (entity instanceof EntityEnderman) {
                soulsCap.addSouls(1, "Endermen");
                int soulsEndermen = soulsCap.getSouls("Endermen");
                SoulSkills.LOGGER.info("Endermen Souls: " + soulsEndermen);
            } else if (entity instanceof EntitySpider) {
                soulsCap.addSouls(1, "Spider");
                int soulsSpider = soulsCap.getSouls("Spider");
                SoulSkills.LOGGER.info("Spider Souls: " + soulsSpider);
            } else if (event.getEntity() instanceof EntityCaveSpider) {
                soulsCap.addSouls(1, "Spider");
                int soulsSpider = soulsCap.getSouls("Spider");
                SoulSkills.LOGGER.info("Spider Souls: " + soulsSpider);
            } else if (entity instanceof EntityCreeper) {
                soulsCap.addSouls(1, "Creeper");
                int soulsCreeper = soulsCap.getSouls("Creeper");
                SoulSkills.LOGGER.info("Creeper Souls: " + soulsCreeper);
            } else if (entity instanceof EntityBlaze) {
                soulsCap.addSouls(1, "Blaze");
                int souls = soulsCap.getSouls("Blaze");
                SoulSkills.LOGGER.info("Blaze Souls: " + souls);
            } else if (entity instanceof EntityEndermite) {
                soulsCap.addSouls(1, "Endermen");
                int souls = soulsCap.getSouls("Endermen");
                SoulSkills.LOGGER.info("Endermen Souls: " + souls);
            } else if (entity instanceof EntityElderGuardian) {
                soulsCap.addSouls(1, "Boss");
                int souls = soulsCap.getSouls("Boss");
                SoulSkills.LOGGER.info("Boss Souls: " + souls);
            } else if (entity instanceof EntityEvoker) {
                soulsCap.addSouls(1, "Illager");
                int souls = soulsCap.getSouls("Illager");
                SoulSkills.LOGGER.info("Illager Souls: " + souls);
            } else if (entity instanceof EntityGuardian) {
                soulsCap.addSouls(1, "Guardian");
                int souls = soulsCap.getSouls("Guardian");
                SoulSkills.LOGGER.info("Guardian Souls: " + souls);
            } else if (entity instanceof EntityGhast) {
                soulsCap.addSouls(1, "Ghast");
                int souls = soulsCap.getSouls("Ghast");
                SoulSkills.LOGGER.info("Ghast Souls: " + souls);
            } else if (entity instanceof EntityHusk) {
                soulsCap.addSouls(1, "Zombie");
                int souls = soulsCap.getSouls("Zombie");
                SoulSkills.LOGGER.info("Zombie Souls: " + souls);
            } else if (entity instanceof EntityMagmaCube) {
                soulsCap.addSouls(1, "MagmaCube");
                int souls = soulsCap.getSouls("MagmaCube");
                SoulSkills.LOGGER.info("Magma Cube Souls: " + souls);
            } else if (entity instanceof EntityIllusionIllager) {
                soulsCap.addSouls(1, "Illager");
                int souls = soulsCap.getSouls("Illager");
                SoulSkills.LOGGER.info("Illager Souls: " + souls);
            } else if (entity instanceof EntityPigZombie) {
                soulsCap.addSouls(1, "Pigmen");
                int souls = soulsCap.getSouls("Pigmen");
                SoulSkills.LOGGER.info("Pigmen Souls: " + souls);
            } else if (entity instanceof EntityPolarBear) {
                soulsCap.addSouls(1, "PolarBear");
                int souls = soulsCap.getSouls("PolarBear");
                SoulSkills.LOGGER.info("Polar Bear Souls: " + souls);
            } else if (entity instanceof EntitySilverfish) {
                soulsCap.addSouls(1, "Silverfish");
                int souls = soulsCap.getSouls("Silverfish");
                SoulSkills.LOGGER.info("Silverfish Souls: " + souls);
            } else if (entity instanceof EntitySkeleton) {
                soulsCap.addSouls(1, "Skeleton");
                int souls = soulsCap.getSouls("Skeleton");
                SoulSkills.LOGGER.info("Skeleton Souls: " + souls);
            } else if (entity instanceof EntityShulker) {
                soulsCap.addSouls(1, "Shulker");
                int souls = soulsCap.getSouls("Shulker");
                SoulSkills.LOGGER.info("Shulker Souls: " + souls);
            } else if (entity instanceof EntitySlime) {
                soulsCap.addSouls(1, "Slime");
                int souls = soulsCap.getSouls("Slime");
                SoulSkills.LOGGER.info("Slime Souls: " + souls);
            } else if (entity instanceof EntityVex) {
                soulsCap.addSouls(1, "Illager");
                int souls = soulsCap.getSouls("Illager");
                SoulSkills.LOGGER.info("Illager Souls: " + souls);
            } else if (entity instanceof EntityVindicator) {
                soulsCap.addSouls(1, "Illager");
                int souls = soulsCap.getSouls("Illager");
                SoulSkills.LOGGER.info("Illager Souls: " + souls);
            } else if (entity instanceof EntityWitch) {
                soulsCap.addSouls(1, "Witch");
                int souls = soulsCap.getSouls("Witch");
                SoulSkills.LOGGER.info("Witch Souls: " + souls);
            } else if (entity instanceof EntityWitherSkeleton) {
                soulsCap.addSouls(1, "WitherSkele");
                int souls = soulsCap.getSouls("WitherSkele");
                SoulSkills.LOGGER.info("Wither Skeleton Souls: " + souls);
            } else if (entity instanceof EntityWither) {
                soulsCap.addSouls(1, "Boss");
                int souls = soulsCap.getSouls("Boss");
                SoulSkills.LOGGER.info("Boss Souls: " + souls);
            } else if (entity instanceof EntityZombie) {
                soulsCap.addSouls(1, "Zombie");
                int souls = soulsCap.getSouls("Zombie");
                SoulSkills.LOGGER.info("Zombie Souls: " + souls);
            } else if (entity instanceof EntityStray) {
                soulsCap.addSouls(1, "Skeleton");
                int souls = soulsCap.getSouls("Skeleton");
                SoulSkills.LOGGER.info("Skeleton Souls: " + souls);
            } else if (entity instanceof EntityDragon) {
                soulsCap.addSouls(1, "Boss");
                int souls = soulsCap.getSouls("Boss");
                SoulSkills.LOGGER.info("Boss Souls: " + souls);
            }
        }
    }
}
