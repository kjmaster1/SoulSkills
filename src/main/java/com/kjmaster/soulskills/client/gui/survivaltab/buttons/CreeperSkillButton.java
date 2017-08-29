package com.kjmaster.soulskills.client.gui.survivaltab.buttons;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

/**
 * Created by pbill_000 on 28/08/2017.
 */
public class CreeperSkillButton extends GuiButton {
    private ResourceLocation texture;

    public CreeperSkillButton(int id, int x, int y, String text, ResourceLocation texture) {
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
            drawTexturedModalRect(x, y, 60, k == 2 ? 20 : 0, 20, 20);
        }
    }
}
