package com.kjmaster.soulskills.proxy;

import com.kjmaster.soulskills.client.gui.survivaltab.SurvivalTabContainer;
import net.ilexiconn.llibrary.client.gui.survivaltab.SurvivalTabHandler;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraftforge.fml.common.event.*;

/**
 * Created by pbill_000 on 28/08/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        SurvivalTabHandler.INSTANCE.create("Soul Skills", SurvivalTabContainer.class);
    }
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public void serverStarting(FMLServerStartingEvent event) {
        super.serverStarting(event);
    }

    @Override
    public void serverStopping(FMLServerStoppingEvent event) {
        super.serverStopping(event);
    }
}
