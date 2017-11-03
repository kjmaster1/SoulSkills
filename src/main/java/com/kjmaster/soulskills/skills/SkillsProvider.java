package com.kjmaster.soulskills.skills;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class SkillsProvider implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(ISkills.class)
    public static final Capability<ISkills> SKILLS_CAPABILITY = null;

    private ISkills skillsInstance = SKILLS_CAPABILITY.getDefaultInstance();

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == SKILLS_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == SKILLS_CAPABILITY ? SKILLS_CAPABILITY.<T>cast(this.skillsInstance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return SKILLS_CAPABILITY.getStorage().writeNBT(SKILLS_CAPABILITY, this.skillsInstance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        SKILLS_CAPABILITY.getStorage().readNBT(SKILLS_CAPABILITY, this.skillsInstance, null, nbt);
    }
}
