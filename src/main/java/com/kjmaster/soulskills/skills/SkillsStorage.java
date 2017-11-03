package com.kjmaster.soulskills.skills;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class SkillsStorage implements Capability.IStorage<ISkills> {

    @Nullable
    @Override
    public NBTBase writeNBT(Capability<ISkills> capability, ISkills instance, EnumFacing side) {
        NBTTagCompound nbtTagCompound = new NBTTagCompound();
        for (String skill: SkillsList.skills) {
            nbtTagCompound.setBoolean(skill, instance.isSkillUnlocked(skill));
        }
        return nbtTagCompound;
    }

    @Override
    public void readNBT(Capability<ISkills> capability, ISkills instance, EnumFacing side, NBTBase nbt) {
        NBTTagCompound nbtTagCompound = (NBTTagCompound) nbt;
        for (String skill: SkillsList.skills) {
            instance.setValue(nbtTagCompound.getBoolean(skill), skill);
        }
    }
}
