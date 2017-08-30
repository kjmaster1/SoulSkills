package com.kjmaster.soulskills.souls;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class SoulsProvider implements ICapabilitySerializable<NBTBase> {
    @CapabilityInject(ISouls.class)
    public static final Capability<ISouls> SOULS_CAPABILITY = null;

    private ISouls soulsInstance = SOULS_CAPABILITY.getDefaultInstance();

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == SOULS_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == SOULS_CAPABILITY ? SOULS_CAPABILITY.<T>cast(this.soulsInstance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return SOULS_CAPABILITY.getStorage().writeNBT(SOULS_CAPABILITY, this.soulsInstance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        SOULS_CAPABILITY.getStorage().readNBT(SOULS_CAPABILITY, this.soulsInstance, null, nbt);
    }
}
