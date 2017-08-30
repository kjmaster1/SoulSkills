package com.kjmaster.soulskills.souls;

/**
 * Created by pbill_000 on 30/08/2017.
 */
public interface ISouls {
    public void consumeSouls(int souls, String type);
    public void addSouls(int souls, String type);
    public void setSouls(int souls, String type);

    public int getSouls(String type);
}
