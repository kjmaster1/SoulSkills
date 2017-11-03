package com.kjmaster.soulskills.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

/**
 * Created by pbill_000 on 01/09/2017.
 */
public class PassiveSkillButton extends GuiButton {
    private ResourceLocation texture;

    public PassiveSkillButton(int id, int x, int y, String text, ResourceLocation texture) {
        super(id, x, y, 20, 20, text);
        this.texture = texture;
        this.width = 20;
        this.height = 20;

    }

    @Override
    public void drawButton(Minecraft mc, int par2, int par3, float partialTicks) {
        if(enabled) {
            hovered = par2 >= x && par3 >= y && par2 < x + width && par3 < y + height;
            int k = getHoverState(hovered);

            mc.renderEngine.bindTexture(texture);
            GlStateManager.color(1F, 1F, 1F, 1F);
            drawTexturedModalRect(x, y, 0, k == 2 ? 140 : 120, 20, 20);
        }
    }
}
