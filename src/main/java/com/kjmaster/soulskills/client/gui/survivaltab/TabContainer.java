package com.kjmaster.soulskills.client.gui.survivaltab;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * Created by pbill_000 on 28/08/2017.
 */
public class TabContainer extends Container {
    public TabContainer() {
        super();
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return !playerIn.isSpectator();
    }
}
