package com.kjmaster.soulskills.souls;

import com.kjmaster.soulskills.SoulSkills;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public class Souls implements ISouls {
    private int soulsBlaze;
    private int soulsBoss;
    private int soulsCreeper;
    private int soulsEndermen;
    private int soulsGhast;
    private int soulsGuardian;
    private int soulsIllager;
    private int soulsMagmaCube;
    private int soulsPigmen;
    private int soulsPolarBear;
    private int soulsShulker;
    private int soulsSilverfish;
    private int soulsSkeleton;
    private int soulsSlime;
    private int soulsSpider;
    private int soulsWitch;
    private int soulsWitherSkele;
    private int soulsZombie;
    @Override
    public void addSouls(int souls, String type) {
        switch (type) {
            case "Blaze":
                this.soulsBlaze += souls;
                break;
            case "Boss":
                this.soulsBoss += souls;
                break;
            case "Creeper":
                this.soulsCreeper += souls;
                break;
            case "Endermen":
                this.soulsEndermen += souls;
                break;
            case "Ghast":
                this.soulsGhast += souls;
                break;
            case "Guardian":
                this.soulsGuardian += souls;
                break;
            case "Illager":
                this.soulsIllager += souls;
                break;
            case "MagmaCube":
                this.soulsMagmaCube += souls;
                break;
            case "Pigmen":
                this.soulsPigmen += souls;
                break;
            case "PolarBear":
                this.soulsPolarBear += souls;
                break;
            case "Shulker":
                this.soulsShulker += souls;
                break;
            case "Silverfish":
                this.soulsSilverfish += souls;
                break;
            case "Skeleton":
                this.soulsSkeleton += souls;
                break;
            case "Slime":
                this.soulsSlime += souls;
                break;
            case "Spider":
                this.soulsSpider += souls;
                break;
            case "Witch":
                this.soulsWitch += souls;
                break;
            case "WitherSkele":
                this.soulsWitherSkele += souls;
                break;
            case "Zombie":
                this.soulsZombie += souls;
                break;
            default:
                SoulSkills.LOGGER.info(SoulSkills.MODID + ": " + "Something went wrong adding souls");
                break;
        }
    }

    @Override
    public void consumeSouls(int souls, String type) {
        switch (type) {
            case "Blaze":
                this.soulsBlaze -= souls;
                if(this.soulsBlaze < 0)
                    this.soulsBlaze = 0;
                break;
            case "Boss":
                this.soulsBoss -= souls;
                if(this.soulsBoss < 0)
                    this.soulsBoss = 0;
                break;
            case "Creeper":
                this.soulsCreeper -= souls;
                if(this.soulsCreeper < 0)
                    this.soulsCreeper = 0;
                break;
            case "Endermen":
                this.soulsEndermen -= souls;
                if(this.soulsEndermen < 0)
                    this.soulsEndermen = 0;
                break;
            case "Ghast":
                this.soulsGhast -= souls;
                if(this.soulsGhast < 0)
                    this.soulsGhast = 0;
                break;
            case "Guardian":
                this.soulsGuardian -= souls;
                if(this.soulsGuardian < 0)
                    this.soulsGuardian = 0;
                break;
            case "Illager":
                this.soulsIllager -= souls;
                if(this.soulsIllager < 0)
                    this.soulsIllager = 0;
                break;
            case "MagmaCube":
                this.soulsMagmaCube -= souls;
                if(this.soulsMagmaCube < 0)
                    this.soulsMagmaCube = 0;
                break;
            case "Pigmen":
                this.soulsPigmen -= souls;
                if(this.soulsPigmen < 0)
                    this.soulsPigmen = 0;
                break;
            case "PolarBear":
                this.soulsPolarBear -= souls;
                if(this.soulsPolarBear < 0)
                    this.soulsPolarBear = 0;
                break;
            case "Shulker":
                this.soulsShulker -= souls;
                if(this.soulsShulker < 0)
                    this.soulsShulker = 0;
                break;
            case "Silverfish":
                this.soulsSilverfish -= souls;
                if(this.soulsSilverfish < 0)
                    this.soulsSilverfish = 0;
                break;
            case "Skeleton":
                this.soulsSkeleton -= souls;
                if(this.soulsSkeleton < 0)
                    this.soulsSkeleton = 0;
                break;
            case "Slime":
                this.soulsSlime -= souls;
                if(this.soulsSlime < 0)
                    this.soulsSlime = 0;
                break;
            case "Spider":
                this.soulsSpider -= souls;
                if(this.soulsSpider < 0)
                    this.soulsSpider = 0;
                break;
            case "Witch":
                this.soulsWitch -= souls;
                if(this.soulsWitch < 0)
                    this.soulsWitch = 0;
                break;
            case "WitherSkele":
                this.soulsWitherSkele -= souls;
                if(this.soulsWitherSkele < 0)
                    this.soulsWitherSkele = 0;
                break;
            case "Zombie":
                this.soulsZombie -= souls;
                if(this.soulsZombie < 0)
                    this.soulsZombie = 0;
                break;
            default:
                SoulSkills.LOGGER.info(SoulSkills.MODID + ": " + "Something went wrong consuming souls");
                break;
        }
    }

    @Override
    public void setSouls(int souls, String type) {
        switch (type) {
            case "Blaze":
                this.soulsBlaze = souls;
                break;
            case "Boss":
                this.soulsBoss = souls;
                break;
            case "Creeper":
                this.soulsCreeper = souls;
                break;
            case "Endermen":
                this.soulsEndermen = souls;
                break;
            case "Ghast":
                this.soulsGhast = souls;
                break;
            case "Guardian":
                this.soulsGuardian = souls;
                break;
            case "Illager":
                this.soulsIllager = souls;
                break;
            case "MagmaCube":
                this.soulsMagmaCube = souls;
                break;
            case "Pigmen":
                this.soulsPigmen = souls;
                break;
            case "PolarBear":
                this.soulsPolarBear = souls;
                break;
            case "Shulker":
                this.soulsShulker = souls;
                break;
            case "Silverfish":
                this.soulsSilverfish = souls;
                break;
            case "Skeleton":
                this.soulsSkeleton = souls;
                break;
            case "Slime":
                this.soulsSlime = souls;
                break;
            case "Spider":
                this.soulsSpider = souls;
                break;
            case "Witch":
                this.soulsWitch = souls;
                break;
            case "WitherSkele":
                this.soulsWitherSkele = souls;
                break;
            case "Zombie":
                this.soulsZombie = souls;
                break;
            default:
                SoulSkills.LOGGER.info(SoulSkills.MODID + ": " + "Something went wrong setting souls");
                break;
        }
    }

    @Override
    public int getSouls(String type) {
        switch (type) {
            case "Blaze":
                return this.soulsBlaze;
            case "Boss":
                return this.soulsBoss;
            case "Creeper":
                return this.soulsCreeper;
            case "Endermen":
                return this.soulsEndermen;
            case "Ghast":
                return this.soulsGhast;
            case "Guardian":
                return this.soulsGuardian;
            case "Illager":
                return this.soulsIllager;
            case "MagmaCube":
                return this.soulsMagmaCube;
            case "Pigmen":
                return this.soulsPigmen;
            case "PolarBear":
                return this.soulsPolarBear;
            case "Shulker":
                return this.soulsShulker;
            case "Silverfish":
                return this.soulsSilverfish;
            case "Skeleton":
                return this.soulsSkeleton;
            case "Slime":
                return this.soulsSlime;
            case "Spider":
                return this.soulsSpider;
            case "Witch":
                return this.soulsWitch;
            case "WitherSkele":
                return this.soulsWitherSkele;
            case "Zombie":
                return this.soulsZombie;
            default:
                break;
        }
        SoulSkills.LOGGER.info(SoulSkills.MODID + ": " + "Something went wrong getting souls");
        return 0;
    }
}
