package com.kjmaster.soulskills.client.gui.blaze;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.client.gui.BackButton;
import com.kjmaster.soulskills.client.gui.MobGui;
import com.kjmaster.soulskills.client.gui.PassiveSkillButton;
import com.kjmaster.soulskills.client.gui.survivaltab.SurvivalTabContainer;
import com.kjmaster.soulskills.client.gui.survivaltab.TabContainer;
import com.kjmaster.soulskills.network.GetSoulsPacket;
import com.kjmaster.soulskills.network.SkillUnlockedPacket;
import com.kjmaster.soulskills.network.SoulSkillsPacketInstance;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class BlazeGui extends MobGui {

    private final ResourceLocation BUTTONTEXTURE = new ResourceLocation(SoulSkills.MODID, "textures/gui/buttons/test.png");

    public BlazeGui(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    public void initGui() {
        super.initGui();

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        SoulSkillsPacketInstance.INSTANCE.sendToServer(new GetSoulsPacket("Blaze"));
        EntityPlayer player = Minecraft.getMinecraft().player;
        ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
        int soulsBlaze = soulsCap.getSouls("Blaze");
        String s = "Blaze Souls: " + soulsBlaze;
        this.mc.fontRenderer.drawString(s, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
        SoulSkillsPacketInstance.INSTANCE.sendToServer(new GetSoulsPacket("Blaze"));
        EntityPlayer player = Minecraft.getMinecraft().player;
        ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
        int soulsBlaze = soulsCap.getSouls("Blaze");
        String s = "Blaze Souls: " + soulsBlaze;
        this.mc.fontRenderer.drawString(s, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, 6, 4210752);

    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
        if(button == shieldSkillButton ) {
            SoulSkillsPacketInstance.INSTANCE.sendToServer(new SkillUnlockedPacket("BlazeShield1"));
        }
        if(button == shieldSkillButton2) {
            SoulSkillsPacketInstance.INSTANCE.sendToServer(new SkillUnlockedPacket("BlazeShield2"));
        }
        if(button == shieldSkillButton3) {
            SoulSkillsPacketInstance.INSTANCE.sendToServer(new SkillUnlockedPacket("BlazeShield3"));
        }
        if(button == shieldSkillButton4) {
            SoulSkillsPacketInstance.INSTANCE.sendToServer(new SkillUnlockedPacket("BlazeShield4"));
        }
    }

    @Override
    protected String GetButtonTooltip(int buttonId) {
        switch (buttonId) {
            case 1: return "Click to buy a permanent 10% damage reduction to blaze attacks. Costs 10 souls.";
            case 2: return "Click to buy a permanent 20% damage reduction to blaze attacks. Costs 10 souls and requires" +
                            " previous shield skill.";
            case 3: return "Click to buy a permanent 30% damage reduction to blaze attacks. Costs 10 souls and requires" +
                            " previous shield skill.";
            case 4: return "Click to buy a permanent 40% damage reduction to blaze attacks. Costs 10 souls and requires" +
                            " previous shield skill.";
            default: return null;
        }
    }
}
