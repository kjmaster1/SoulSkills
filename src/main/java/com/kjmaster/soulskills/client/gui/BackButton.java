package com.kjmaster.soulskills.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

/**
 * Created by pbill_000 on 31/08/2017.
 */
public class BackButton extends GuiButton {

    public BackButton(int buttonId, int x, int y) {
        super(buttonId, x, y, 30, 30, "Back");
        this.width = 35;
        this.height = 20;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        super.drawButton(mc, mouseX, mouseY, partialTicks);
    }
}
