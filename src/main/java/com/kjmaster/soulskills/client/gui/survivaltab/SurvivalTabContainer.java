package com.kjmaster.soulskills.client.gui.survivaltab;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.client.gui.blaze.BlazeGui;
import com.kjmaster.soulskills.client.gui.boss.BossGui;
import com.kjmaster.soulskills.client.gui.creeper.CreeperGui;
import com.kjmaster.soulskills.client.gui.endermen.EndermenGui;
import com.kjmaster.soulskills.client.gui.ghast.GhastGui;
import com.kjmaster.soulskills.client.gui.guardian.GuardianGui;
import com.kjmaster.soulskills.client.gui.illager.IllagerGui;
import com.kjmaster.soulskills.client.gui.magmacube.MagmaCubeGui;
import com.kjmaster.soulskills.client.gui.pigmen.PigmenGui;
import com.kjmaster.soulskills.client.gui.polarbear.PolarBearGui;
import com.kjmaster.soulskills.client.gui.shulker.ShulkerGui;
import com.kjmaster.soulskills.client.gui.silverfish.SilverfishGui;
import com.kjmaster.soulskills.client.gui.skeleton.SkeletonGui;
import com.kjmaster.soulskills.client.gui.slime.SlimeGui;
import com.kjmaster.soulskills.client.gui.spider.SpiderGui;
import com.kjmaster.soulskills.client.gui.survivaltab.buttons.*;
import com.kjmaster.soulskills.client.gui.witch.WitchGui;
import com.kjmaster.soulskills.client.gui.witherskele.WitherSkeleGui;
import com.kjmaster.soulskills.client.gui.zombie.ZombieGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import scala.collection.parallel.ParIterableLike;

import java.io.IOException;

/**
 * Created by pbill_000 on 28/08/2017.
 */
public class SurvivalTabContainer extends GuiContainer {

    BlazeSkillButton blazeSkillButton;
    BossSkillButton bossSkillButton;
    CreeperSkillButton creeperSkillButton;
    EndermenSkillButton endermenSkillButton;
    GhastSkillButton ghastSkillButton;
    GuardianSkillButton guardianSkillButton;
    IllagerSkillButton illagerSkillButton;
    MagmaCubeSkillButton magmaCubeSkillButton;
    PigmenSkillButton pigmenSkillButton;
    PolarBearSkillButton polarBearSkillButton;
    ShulkerSkillButton shulkerSkillButton;
    SilverfishSkillButton silverfishSkillButton;
    SkeletonSkillButton skeletonSkillButton;
    SlimeSkillButton slimeSkillButton;
    SpiderSkillButton spiderSkillButton;
    WitchSkillButton witchSkillButton;
    WitherSkeleSkillButton witherSkeleSkillButton;
    ZombieSkillButton zombieSkillButton;

    private final ResourceLocation TEXTURE = new ResourceLocation(SoulSkills.MODID, "textures/gui/container/test.png");
    private final ResourceLocation BUTTONTEXTURE = new ResourceLocation(SoulSkills.MODID, "textures/gui/buttons/test.png");
    public SurvivalTabContainer(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = I18n.format("soulskills.inventorytab.desc1"); //Gets the formatted name for the block breaker from the language file
        String s2 = I18n.format("soulskills.inventorytab.desc2");
        String s3 = I18n.format("soulskills.inventorytab.desc3");
        this.mc.fontRenderer.drawString(s, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, 6, 4210752); //Draws the string in the center on the top of the gui
        this.mc.fontRenderer.drawString(s2, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, 16, 4210752);
        this.mc.fontRenderer.drawString(s3, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, 26, 4210752);
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.drawDefaultBackground();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
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
    public void initGui() {
        super.initGui();
        this.xSize = 176;
        this.ySize = 166;

        //row 1
        blazeSkillButton = new BlazeSkillButton(1, guiLeft + 13 , guiTop + 43 , "", BUTTONTEXTURE);
        bossSkillButton = new BossSkillButton(2, guiLeft + 39 , guiTop + 43,"", BUTTONTEXTURE);
        creeperSkillButton = new CreeperSkillButton(3, guiLeft + 65, guiTop + 43, "", BUTTONTEXTURE);
        endermenSkillButton = new EndermenSkillButton(4, guiLeft + 91, guiTop + 43, "", BUTTONTEXTURE);
        ghastSkillButton = new GhastSkillButton(5, guiLeft + 117, guiTop + 43 , "", BUTTONTEXTURE);
        guardianSkillButton = new GuardianSkillButton(6, guiLeft + 143, guiTop + 43,"", BUTTONTEXTURE);

        //row 2
        magmaCubeSkillButton = new MagmaCubeSkillButton(8, guiLeft + 13, guiTop + 73, "", BUTTONTEXTURE);
        pigmenSkillButton = new PigmenSkillButton(9, guiLeft + 39, guiTop + 73, "", BUTTONTEXTURE);
        polarBearSkillButton = new PolarBearSkillButton(10, guiLeft + 65, guiTop + 73, "", BUTTONTEXTURE);
        shulkerSkillButton = new ShulkerSkillButton(11, guiLeft + 91, guiTop + 73, "", BUTTONTEXTURE);
        silverfishSkillButton = new SilverfishSkillButton(12, guiLeft + 117, guiTop + 73, "", BUTTONTEXTURE);
        skeletonSkillButton = new SkeletonSkillButton(13, guiLeft + 143, guiTop + 73, "", BUTTONTEXTURE);

        //row 3
        spiderSkillButton = new SpiderSkillButton(15, guiLeft + 13, guiTop + 103, "", BUTTONTEXTURE);
        witchSkillButton = new WitchSkillButton(16, guiLeft + 39, guiTop + 103, "", BUTTONTEXTURE);
        witherSkeleSkillButton = new WitherSkeleSkillButton(17, guiLeft + 65, guiTop + 103, "", BUTTONTEXTURE);
        zombieSkillButton = new ZombieSkillButton(18, guiLeft + 91, guiTop + 103, "", BUTTONTEXTURE);
        illagerSkillButton = new IllagerSkillButton(7, guiLeft + 117, guiTop + 103, "", BUTTONTEXTURE);
        slimeSkillButton = new SlimeSkillButton(14, guiLeft + 143, guiTop + 103, "", BUTTONTEXTURE);

        //add buttons
        this.buttonList.add(blazeSkillButton);
        this.buttonList.add(bossSkillButton);
        this.buttonList.add(creeperSkillButton);
        this.buttonList.add(endermenSkillButton);
        this.buttonList.add(ghastSkillButton);
        this.buttonList.add(guardianSkillButton);
        this.buttonList.add(illagerSkillButton);

        this.buttonList.add(magmaCubeSkillButton);
        this.buttonList.add(pigmenSkillButton);
        this.buttonList.add(polarBearSkillButton);
        this.buttonList.add(shulkerSkillButton);
        this.buttonList.add(silverfishSkillButton);
        this.buttonList.add(skeletonSkillButton);
        this.buttonList.add(slimeSkillButton);

        this.buttonList.add(spiderSkillButton);
        this.buttonList.add(witchSkillButton);
        this.buttonList.add(witherSkeleSkillButton);
        this.buttonList.add(zombieSkillButton);
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button == blazeSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new BlazeGui(new TabContainer()));
        if(button == bossSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new BossGui(new TabContainer()));
        if(button == creeperSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new CreeperGui(new TabContainer()));
        if(button == endermenSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new EndermenGui(new TabContainer()));
        if(button == ghastSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new GhastGui(new TabContainer()));
        if(button == guardianSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new GuardianGui(new TabContainer()));
        if(button == illagerSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new IllagerGui(new TabContainer()));
        if(button == magmaCubeSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new MagmaCubeGui(new TabContainer()));
        if(button == pigmenSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new PigmenGui(new TabContainer()));
        if(button == polarBearSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new PolarBearGui(new TabContainer()));
        if(button == shulkerSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new ShulkerGui(new TabContainer()));
        if(button == silverfishSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new SilverfishGui(new TabContainer()));
        if(button == skeletonSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new SkeletonGui(new TabContainer()));
        if(button == slimeSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new SlimeGui(new TabContainer()));
        if(button == spiderSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new SpiderGui(new TabContainer()));
        if(button == witchSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new WitchGui(new TabContainer()));
        if(button == witherSkeleSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new WitherSkeleGui(new TabContainer()));
        if(button == zombieSkillButton)
            Minecraft.getMinecraft().displayGuiScreen(new ZombieGui(new TabContainer()));
    }
}
