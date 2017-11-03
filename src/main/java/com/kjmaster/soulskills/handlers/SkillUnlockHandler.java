package com.kjmaster.soulskills.handlers;

import com.kjmaster.soulskills.SoulSkills;
import com.kjmaster.soulskills.network.SkillUnlockedPacket;
import com.kjmaster.soulskills.network.SnackbarPacket;
import com.kjmaster.soulskills.network.SoulSkillsPacketInstance;
import com.kjmaster.soulskills.skills.ISkills;
import com.kjmaster.soulskills.skills.SkillsProvider;
import com.kjmaster.soulskills.souls.ISouls;
import com.kjmaster.soulskills.souls.SoulsProvider;
import com.kjmaster.soulskills.utils.SnackBar;
import net.ilexiconn.llibrary.server.snackbar.Snackbar;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class SkillUnlockHandler implements IMessageHandler<SkillUnlockedPacket, IMessage> {

    @Override
    public IMessage onMessage(SkillUnlockedPacket message, MessageContext ctx) {
        String skill = message.skill;
        EntityPlayerMP player = ctx.getServerHandler().player;
        ISkills skillsCap = player.getCapability(SkillsProvider.SKILLS_CAPABILITY, null);
        ISouls soulsCap = player.getCapability(SoulsProvider.SOULS_CAPABILITY, null);
        int blazeSouls = soulsCap.getSouls("Blaze");
        int bossSouls = soulsCap.getSouls("Boss");
        int creeperSouls = soulsCap.getSouls("Creeper");
        int endermenSouls = soulsCap.getSouls("Endermen");
        int ghastSouls = soulsCap.getSouls("Ghast");
        int guardianSouls = soulsCap.getSouls("Guardian");
        int illagerSouls = soulsCap.getSouls("Illager");
        int magmaCubeSouls = soulsCap.getSouls("MagmaCube");
        int pigmenSouls = soulsCap.getSouls("Pigmen");
        int polarBearSouls = soulsCap.getSouls("PolarBear");
        int shulkerSouls = soulsCap.getSouls("Shulker");
        int silverfishSouls = soulsCap.getSouls("Silverfish");
        int skeletonSouls = soulsCap.getSouls("Skeleton");
        int slimeSouls = soulsCap.getSouls("Slime");
        int spiderSouls = soulsCap.getSouls("Spider");
        int witchSouls = soulsCap.getSouls("Witch");
        int witherSkeleSouls = soulsCap.getSouls("WitherSkele");

        switch (skill) {

            //All the shield skills
            case "BlazeShield1":
                unlockShieldSkill(blazeSouls, skill, skillsCap, player, soulsCap, "Blaze", 1, "");
                break;
            case "BlazeShield2":
                unlockShieldSkill(blazeSouls, skill, skillsCap, player, soulsCap, "Blaze", 2, "BlazeShield1");
                break;
            case "BlazeShield3":
                unlockShieldSkill(blazeSouls, skill, skillsCap, player, soulsCap, "Blaze", 3, "BlazeShield2");
                break;
            case "BlazeShield4":
                unlockShieldSkill(blazeSouls, skill, skillsCap, player, soulsCap, "Blaze", 4, "BlazeShield3");
                break;
            case "BossShield1":
                unlockShieldSkill(bossSouls, skill, skillsCap, player, soulsCap, "Boss", 1, "");
                break;
            case "BossShield2":
                unlockShieldSkill(bossSouls, skill, skillsCap, player, soulsCap, "Boss", 2, "BossShield1");
                break;
            case "BossShield3":
                unlockShieldSkill(bossSouls, skill, skillsCap, player, soulsCap, "Boss", 3, "BossShield2");
                break;
            case "BossShield4":
                unlockShieldSkill(bossSouls, skill, skillsCap, player, soulsCap, "Boss", 4, "BossShield3");
                break;
            case "CreeperShield1":
                unlockShieldSkill(creeperSouls, skill, skillsCap, player, soulsCap, "Creeper", 1, "");
                break;
            case "CreeperShield2":
                unlockShieldSkill(creeperSouls, skill, skillsCap, player, soulsCap, "Creeper", 2, "CreeperShield1");
                break;
            case "CreeperShield3":
                unlockShieldSkill(creeperSouls, skill, skillsCap, player, soulsCap, "Creeper", 3, "CreeperShield2");
                break;
            case "CreeperShield4":
                unlockShieldSkill(creeperSouls, skill, skillsCap, player, soulsCap, "Creeper", 4, "CreeperShield3");
                break;
            case "EndermenShield1":
                unlockShieldSkill(endermenSouls, skill, skillsCap, player, soulsCap, "Endermen", 1, "");
                break;
            case "EndermenShield2":
                unlockShieldSkill(endermenSouls, skill, skillsCap, player, soulsCap, "Endermen", 2, "EndermenShield1");
                break;
            case "EndermenShield3":
                unlockShieldSkill(endermenSouls, skill, skillsCap, player, soulsCap, "Endermen", 3, "EndermenShield2");
                break;
            case "EndermenShield4":
                unlockShieldSkill(endermenSouls, skill, skillsCap, player, soulsCap, "Endermen", 4, "EndermenShield3");
                break;
            case "GhastShield1":
                unlockShieldSkill(ghastSouls, skill, skillsCap, player, soulsCap, "Ghast", 1, "");
                break;
            case "GhastShield2":
                unlockShieldSkill(ghastSouls, skill, skillsCap, player, soulsCap, "Ghast", 2, "GhastShield1");
                break;
            case "GhastShield3":
                unlockShieldSkill(ghastSouls, skill, skillsCap, player, soulsCap, "Ghast", 3, "GhastShield2");
                break;
            case "GhastShield4":
                unlockShieldSkill(ghastSouls, skill, skillsCap, player, soulsCap, "Ghast", 4, "GhastShield3");
                break;
            case "GuardianShield1":
                unlockShieldSkill(guardianSouls, skill, skillsCap, player, soulsCap, "Guardian", 1, "");
                break;
            case "GuardianShield2":
                unlockShieldSkill(guardianSouls, skill, skillsCap, player, soulsCap, "Guardian", 2, "GuardianShield2");
                break;
            case "GuardianShield3":
                unlockShieldSkill(guardianSouls, skill, skillsCap, player, soulsCap, "Guardian", 3, "GuardianShield3");
                break;
            case "GuardianShield4":
                unlockShieldSkill(guardianSouls, skill, skillsCap, player, soulsCap, "Guardian", 4, "GuardianShield4");
                break;
            case "IllagerShield1":
                unlockShieldSkill(illagerSouls, skill, skillsCap, player, soulsCap, "Illager", 1, "");
                break;
            case "IllagerShield2":
                unlockShieldSkill(illagerSouls, skill, skillsCap, player, soulsCap, "Illager", 2, "IllagerShield1");
                break;
            case "IllagerShield3":
                unlockShieldSkill(illagerSouls, skill, skillsCap, player, soulsCap, "Illager", 3, "IllagerShield2");
                break;
            case "IllagerShield4":
                unlockShieldSkill(illagerSouls, skill, skillsCap, player, soulsCap, "Illager", 4, "IllagerShield3");
                break;
            case "MagmaCubeShield1":
                unlockShieldSkill(magmaCubeSouls, skill, skillsCap, player, soulsCap, "MagmaCube", 1, "");
                break;
            case "MagmaCubeShield2":
                unlockShieldSkill(magmaCubeSouls, skill, skillsCap, player, soulsCap, "MagmaCube", 2, "MagmaCubeShield1");
                break;
            case "MagmaCubeShield3":
                unlockShieldSkill(magmaCubeSouls, skill, skillsCap, player, soulsCap, "MagmaCube", 3, "MagmaCubeShield2");
                break;
            case "MagmaCubeShield4":
                unlockShieldSkill(magmaCubeSouls, skill, skillsCap, player, soulsCap, "MagmaCube", 4, "MagmaCubeShield3");
                break;
            case "PigmenShield1":
                unlockShieldSkill(pigmenSouls, skill, skillsCap, player, soulsCap, "Pigmen", 1, "");
                break;
            case "PigmenShield2":
                unlockShieldSkill(pigmenSouls, skill, skillsCap, player, soulsCap, "Pigmen", 2, "PigmenShield1");
                break;
            case "PigmenShield3":
                unlockShieldSkill(pigmenSouls, skill, skillsCap, player, soulsCap, "Pigmen", 3, "PigmenShield2");
                break;
            case "PigmenShield4":
                unlockShieldSkill(pigmenSouls, skill, skillsCap, player, soulsCap, "Pigmen", 4, "PigmenShield3");
                break;
            case "PolarBearShield1":
                unlockShieldSkill(polarBearSouls, skill, skillsCap, player, soulsCap, "PolarBear", 1, "");
                break;
            case "PolarBearShield2":
                unlockShieldSkill(polarBearSouls, skill, skillsCap, player, soulsCap, "PolarBear", 2, "PolarBearShield2");
                break;
            case "PolarBearShield3":
                unlockShieldSkill(polarBearSouls, skill, skillsCap, player, soulsCap, "PolarBear", 3, "PolarBearShield3");
                break;
            case "PolarBearShield4":
                unlockShieldSkill(polarBearSouls, skill, skillsCap, player, soulsCap, "PolarBear", 4, "PolarBearShield4");
                break;
            case "ShulkerShield1":
                unlockShieldSkill(shulkerSouls, skill, skillsCap, player, soulsCap, "Shulker", 1, "ShulkerShield1");
            default:
                break;
        }
        return null;
    }

    private void unlockShieldSkill(int souls, String skill, ISkills skillsCap, EntityPlayerMP player, ISouls soulsCap,
                                   String soulsType, int skillNum, String requiredSkill) {
        if (skillNum == 1) {
            if (souls >= 10 && !skillsCap.isSkillUnlocked(skill)) {
                skillsCap.unlockSkill(skill);
                soulsCap.consumeSouls(10, soulsType);
                SnackBar.sendSnackbarToClient("Shield Skill Unlocked!", player);

            } else if (skillsCap.isSkillUnlocked(skill)) {
                SnackBar.sendSnackbarToClient("Already Unlocked!", player);
            } else {
                SnackBar.sendSnackbarToClient("Not Enough Souls!", player);
            }
        } else if (skillNum == 2) {
            Boolean is1Unlocked = skillsCap.isSkillUnlocked(requiredSkill);
            if (is1Unlocked) {
                if (souls >= 10 && !skillsCap.isSkillUnlocked(skill)) {
                    skillsCap.unlockSkill(skill);
                    soulsCap.consumeSouls(10, soulsType);
                    SnackBar.sendSnackbarToClient("Shield Skill 2 Unlocked!", player);

                } else if (skillsCap.isSkillUnlocked(skill)) {
                    SnackBar.sendSnackbarToClient("Already Unlocked!", player);
                } else {
                    SnackBar.sendSnackbarToClient("Not Enough Souls!", player);
                }

            } else {
                SnackBar.sendSnackbarToClient("You haven't bought the first shield skill!", player);
            }
        } else if (skillNum == 3) {
            Boolean is2Unlocked = skillsCap.isSkillUnlocked(requiredSkill);
            if (is2Unlocked) {
                if (souls >= 10 && !skillsCap.isSkillUnlocked(skill)) {
                    skillsCap.unlockSkill(skill);
                    soulsCap.consumeSouls(10, soulsType);
                    SnackBar.sendSnackbarToClient("Shield Skill 3 Unlocked!", player);

                } else if (skillsCap.isSkillUnlocked(skill)) {
                    SnackBar.sendSnackbarToClient("Already Unlocked!", player);
                } else {
                    SnackBar.sendSnackbarToClient("Not Enough Souls!", player);
                }

            } else {
                SnackBar.sendSnackbarToClient("You haven't bought the second shield skill!", player);
            }
        } else if (skillNum == 4) {
            Boolean is3Unlocked = skillsCap.isSkillUnlocked("BlazeShield3");
            if (is3Unlocked) {
                if (souls >= 10 && !skillsCap.isSkillUnlocked(skill)) {
                    skillsCap.unlockSkill(skill);
                    soulsCap.consumeSouls(10, soulsType);
                    SnackBar.sendSnackbarToClient("Shield Skill 4 Unlocked!", player);

                } else if (skillsCap.isSkillUnlocked(skill)) {
                    SnackBar.sendSnackbarToClient("Already Unlocked!", player);
                } else {
                    SnackBar.sendSnackbarToClient("Not Enough Souls!", player);
                }

            } else {
                SnackBar.sendSnackbarToClient("You haven't bought the third shield skill!", player);
            }
        }
    }
}
