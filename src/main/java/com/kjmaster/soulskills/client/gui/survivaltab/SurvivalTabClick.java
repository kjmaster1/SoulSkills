package com.kjmaster.soulskills.client.gui.survivaltab;

import net.ilexiconn.llibrary.server.event.SurvivalTabClickEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by pbill_000 on 28/08/2017.
 */
@SideOnly(Side.CLIENT)
public class SurvivalTabClick {
    @SubscribeEvent
    public void onSurvivalTabClick(SurvivalTabClickEvent event) {
        if(event.getLabel().equals("Soul Skills")) {
            Minecraft.getMinecraft().displayGuiScreen(new SurvivalTabContainer(new TabContainer()));
        }
    }
}
