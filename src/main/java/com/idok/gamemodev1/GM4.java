package com.idok.gamemodev1;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GM4 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage(ChatColor.GREEN + "Your gamemode is" + "\n" + ChatColor.WHITE.toString() + ChatColor.BOLD + "SPECTATOR");
        }
        return false;
    }
}
