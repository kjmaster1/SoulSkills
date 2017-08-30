package com.kjmaster.soulskills.souls;


import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class SoulsStorage implements Capability.IStorage<ISouls>{

    @Nullable
    @Override
    public NBTBase writeNBT(Capability<ISouls> capability, ISouls instance, EnumFacing side) {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        nbtTagCompound.setInteger("BlazeSouls", instance.getSouls("Blaze"));
        nbtTagCompound.setInteger("BossSouls", instance.getSouls("Boss"));
        nbtTagCompound.setInteger("CreeperSouls", instance.getSouls("Creeper"));
        nbtTagCompound.setInteger("EndermenSouls", instance.getSouls("Endermen"));
        nbtTagCompound.setInteger("GhastSouls", instance.getSouls("Ghast"));
        nbtTagCompound.setInteger("GuardianSouls", instance.getSouls("Guardian"));
        nbtTagCompound.setInteger("IllagerSouls", instance.getSouls("Illager"));
        nbtTagCompound.setInteger("MagmaCubeSouls", instance.getSouls("MagmaCube"));
        nbtTagCompound.setInteger("PigmenSouls", instance.getSouls("Pigmen"));
        nbtTagCompound.setInteger("PolarBearSouls", instance.getSouls("PolarBear"));
        nbtTagCompound.setInteger("ShulkerSouls", instance.getSouls("Shulker"));
        nbtTagCompound.setInteger("SilverfishSouls", instance.getSouls("Silverfish"));
        nbtTagCompound.setInteger("SkeletonSouls", instance.getSouls("Skeleton"));
        nbtTagCompound.setInteger("SlimeSouls", instance.getSouls("Slime"));
        nbtTagCompound.setInteger("SpiderSouls", instance.getSouls("Spider"));
        nbtTagCompound.setInteger("WitchSouls", instance.getSouls("Witch"));
        nbtTagCompound.setInteger("WitherSkeleSouls", instance.getSouls("WitherSkele"));
        nbtTagCompound.setInteger("ZombieSouls", instance.getSouls("Zombie"));
        return nbtTagCompound;
    }

    @Override
    public void readNBT(Capability<ISouls> capability, ISouls instance, EnumFacing side, NBTBase nbt) {
        NBTTagCompound nbtTagCompound = (NBTTagCompound) nbt;
        instance.setSouls(nbtTagCompound.getInteger("BlazeSouls"), "Blaze");
        instance.setSouls(nbtTagCompound.getInteger("BossSouls"), "Boss");
        instance.setSouls(nbtTagCompound.getInteger("CreeperSouls"), "Creeper");
        instance.setSouls(nbtTagCompound.getInteger("EndermenSouls"), "Endermen");
        instance.setSouls(nbtTagCompound.getInteger("GhastSouls"), "Ghast");
        instance.setSouls(nbtTagCompound.getInteger("GuardianSouls"), "Guardian");
        instance.setSouls(nbtTagCompound.getInteger("IllagerSouls"), "Illager");
        instance.setSouls(nbtTagCompound.getInteger("MagmaCubeSouls"), "MagmaCube");
        instance.setSouls(nbtTagCompound.getInteger("PigmenSouls"), "Pigmen");
        instance.setSouls(nbtTagCompound.getInteger("PolarBearSouls"), "PolarBear");
        instance.setSouls(nbtTagCompound.getInteger("ShulkerSouls"), "Shulker");
        instance.setSouls(nbtTagCompound.getInteger("SilverfishSouls"), "Silverfish");
        instance.setSouls(nbtTagCompound.getInteger("SkeletonSouls"), "Skeleton");
        instance.setSouls(nbtTagCompound.getInteger("SlimeSouls"), "Slime");
        instance.setSouls(nbtTagCompound.getInteger("SpiderSouls"), "Spider");
        instance.setSouls(nbtTagCompound.getInteger("WitchSouls"), "Witch");
        instance.setSouls(nbtTagCompound.getInteger("WitherSkeleSouls"), "WitherSkele");
        instance.setSouls(nbtTagCompound.getInteger("ZombieSouls"), "Zombie");


    }
}
