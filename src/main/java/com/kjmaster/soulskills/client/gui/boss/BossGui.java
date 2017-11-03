package com.kjmaster.soulskills.client.gui.boss;

import com.kjmaster.soulskills.client.gui.MobGui;
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

import java.io.IOException;

/**
 * Created by pbill_000 on 31/08/2017.
 */
public class BossGui extends MobGui {

    public BossGui(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    public void initGui() {
        super.initGui();

    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
        if (button == shieldSkillButton)
            SoulSkillsPacketInstance.INSTANCE.sendToServer(new SkillUnlockedPacket("BossShield1"));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        SoulSkillsPacketInstance.INSTANCE.sendToServer(new GetSoulsPacket("Boss"));
        EntityPlayer player = Minecraft.getMinecraft().player;
        ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
        int soulsBoss = soulsCap.getSouls("Boss");
        String s = "Boss Souls: " + soulsBoss;
        this.mc.fontRenderer.drawString(s, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
        SoulSkillsPacketInstance.INSTANCE.sendToServer(new GetSoulsPacket("Boss"));
        EntityPlayer player = Minecraft.getMinecraft().player;
        ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
        int soulsBlaze = soulsCap.getSouls("Boss");
        String s = "Boss Souls: " + soulsBlaze;
        this.mc.fontRenderer.drawString(s, this.xSize / 2 - this.mc.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
    }
}
