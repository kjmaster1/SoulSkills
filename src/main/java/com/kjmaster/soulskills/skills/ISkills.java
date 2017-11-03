package com.kjmaster.soulskills.skills;

/**
 * Created by pbill_000 on 04/09/2017.
 */
public interface ISkills {
    public void unlockSkill(String skill);
    public boolean isSkillUnlocked(String skill);
    public void setValue(Boolean unlocked, String skill);
}
