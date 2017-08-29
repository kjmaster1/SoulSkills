package com.kjmaster.soulskills.events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
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
        }
    }

    public void doSouls(EntityPlayer player, Entity entity, LivingDeathEvent event) {
        //Checking Mob
        if (entity instanceof EntityEnderman) {
            //Endermen Souls
        } else if (entity instanceof EntitySpider) {
            //Spider Souls
        } else if (event.getEntity() instanceof EntityCaveSpider) {
            //Spider Souls
        } else if (entity instanceof EntityCreeper) {
            //Creeper Souls
        } else if (entity instanceof EntityBlaze) {
            //Blaze Souls
        } else if (entity instanceof EntityEndermite) {
            //Endermen souls
        } else if (entity instanceof EntityElderGuardian) {
            //Boss Souls
        } else if (entity instanceof EntityEvoker) {
            //Illager Souls
        } else if (entity instanceof EntityGuardian) {
            //Guardian Souls
        } else if (entity instanceof EntityGhast) {
            //Ghast Souls
        } else if (entity instanceof EntityHusk) {
            //Zombie Souls
        } else if (entity instanceof EntityMagmaCube) {
            //Mama Cube Souls
        } else if (entity instanceof EntityIllusionIllager) {
            //Illager Souls
        } else if (entity instanceof EntityPigZombie) {
            //Pigmen Souls
        } else if (entity instanceof EntityPolarBear) {
            //Polar Bear Souls
        } else if (entity instanceof EntitySilverfish) {
            //Silverfish Souls
        } else if (entity instanceof EntitySkeleton) {
            //Skeleton Souls
        } else if (entity instanceof EntityShulker) {
            //Shulker Souls
        } else if (entity instanceof EntitySlime) {
            //Slime Souls
        } else if (entity instanceof EntityVex) {
            //Illager Souls
        } else if (entity instanceof EntityVindicator) {
            //Illager Souls
        } else if (entity instanceof EntityWitch) {
            //Witch Souls
        } else if (entity instanceof EntityWitherSkeleton) {
            //Wither Skele Souls
        } else if (entity instanceof EntityWither) {
            //Boss Souls
        } else if (entity instanceof EntityZombie) {
            //Zombie Souls
        } else if (entity instanceof EntityStray) {
            //Skeleton Souls
        } else if (entity instanceof EntityDragon) {
            //Boss Souls
        } else {
            //Is it an animal?

        }
    }
}
