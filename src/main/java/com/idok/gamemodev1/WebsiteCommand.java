package com.idok.gamemodev1;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WebsiteCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendTitle(ChatColor.GREEN + "Look on the chat!", "", 20, 150, 30);
            player.sendMessage("https://solo.to/idok25");
        }
        return false;
    }
}
