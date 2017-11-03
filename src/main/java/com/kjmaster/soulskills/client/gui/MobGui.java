package com.kjmaster.soulskills.client.gui;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.client.gui.survivaltab.SurvivalTabContainer;
import com.kjmaster.soulskills.client.gui.survivaltab.TabContainer;
import com.kjmaster.soulskills.utils.GuiTooltipScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class MobGui extends GuiTooltipScreen {
    protected PassiveSkillButton shieldSkillButton;
    protected PassiveSkillButton shieldSkillButton2;
    protected PassiveSkillButton shieldSkillButton3;
    protected PassiveSkillButton shieldSkillButton4;
    private BackButton backButton;
    private final ResourceLocation TEXTURE = new ResourceLocation(SoulSkills.MODID, "textures/gui/container/test.png");
    private final ResourceLocation BUTTONTEXTURE = new ResourceLocation(SoulSkills.MODID, "textures/gui/buttons/test.png");

    public MobGui(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    public void initGui() {
        super.initGui();
        this.xSize = 176;
        this.ySize = 166;
        shieldSkillButton = new PassiveSkillButton(1, guiLeft + 20, guiTop + 20, "", BUTTONTEXTURE);
        shieldSkillButton2 = new PassiveSkillButton(2, guiLeft + 60, guiTop + 20, "", BUTTONTEXTURE);
        shieldSkillButton3 = new PassiveSkillButton(3, guiLeft + 100, guiTop + 20, "", BUTTONTEXTURE);
        shieldSkillButton4 = new PassiveSkillButton(4, guiLeft + 140, guiTop + 20, "", BUTTONTEXTURE);
        backButton = new BackButton(5, guiLeft + 10, guiTop + 126);
        this.buttonList.add(backButton);
        this.buttonList.add(shieldSkillButton);
        this.buttonList.add(shieldSkillButton2);
        this.buttonList.add(shieldSkillButton3);
        this.buttonList.add(shieldSkillButton4);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.drawDefaultBackground();
        this.mc.getTextureManager().bindTexture(TEXTURE);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 176, 166 );
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(TEXTURE);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 176, 166);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
    }

    @Override
    protected String GetButtonTooltip(int buttonId) {
        return null;
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button == backButton) {
            Minecraft.getMinecraft().displayGuiScreen(new SurvivalTabContainer(new TabContainer()));
        }
    }
}

