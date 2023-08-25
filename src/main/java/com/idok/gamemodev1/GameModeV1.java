package com.idok.gamemodev1;

import org.bukkit.plugin.java.JavaPlugin;

public final class GameModeV1 extends JavaPlugin {

    @Override
    public void onEnable() {
       getCommand("gm1").setExecutor(new GM1());
       getCommand("gm2").setExecutor(new GM2());
       getCommand("gm3").setExecutor(new GM3());
       getCommand("gm4").setExecutor(new GM4());
       getCommand("gmhelp").setExecutor(new GMHELP());
       getCommand("website").setExecutor(new WebsiteCommand());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("GameModeV1 || Online!");

    }

}
