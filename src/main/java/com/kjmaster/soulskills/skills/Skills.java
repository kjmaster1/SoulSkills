package com.kjmaster.soulskills.skills;

import java.util.ArrayList;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public class Skills implements ISkills {
    private boolean
    //Blaze Skills
        isBlazeShield1, isBlazeShield2, isBlazeShield3, isBlazeShield4,
    //Boss Skills
        isBossShield1 = false;

    @Override
    public void unlockSkill(String skill) {
        switch (skill) {
            case "BlazeShield1":
                this.isBlazeShield1 = true;
                break;
            case "BlazeShield2":
                this.isBlazeShield2 = true;
                break;
            case "BlazeShield3":
                this.isBlazeShield3 = true;
                break;
            case "BlazeShield4":
                this.isBlazeShield4 = true;
                break;
            case "BossShield1":
                this.isBossShield1 = true;
                break;
            default:
                break;
        }

    }

    @Override
    public boolean isSkillUnlocked(String skill) {
        switch (skill) {
            case "BlazeShield1":
                return this.isBlazeShield1;
            case "BlazeShield2":
                return this.isBlazeShield2;
            case "BlazeShield3":
                return this.isBlazeShield3;
            case "BlazeShield4":
                return this.isBlazeShield4;
            case "BossShield1":
                return this.isBossShield1;
            default:
                return false;
        }
    }

    @Override
    public void setValue(Boolean unlocked, String skill) {
        switch (skill) {
            case "BlazeShield1":
                this.isBlazeShield1 = unlocked;
                break;
            case "BlazeShield2":
                this.isBlazeShield2 = unlocked;
                break;
            case "BlazeShield3":
                this.isBlazeShield3 = unlocked;
                break;
            case "BlazeShield4":
                this.isBlazeShield4 = unlocked;
                break;
            case "BossShield1":
                this.isBossShield1 = unlocked;
                break;
            default:
                break;
        }
    }
}
