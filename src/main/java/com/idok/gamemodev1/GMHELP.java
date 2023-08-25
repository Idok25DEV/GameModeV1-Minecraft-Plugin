package com.idok.gamemodev1;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMHELP implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GOLD + "=====================================================");
            player.sendMessage(ChatColor.BLUE.toString() + ChatColor.BOLD + "gm1 : " + " " + ChatColor.WHITE + "SURVIVAL MODE");
            player.sendMessage(ChatColor.BLUE.toString() + ChatColor.BOLD + "gm2 : " + " " + ChatColor.WHITE + "CREATIVE MODE");
            player.sendMessage(ChatColor.BLUE.toString() + ChatColor.BOLD + "gm3 : " + " " + ChatColor.WHITE + "ADVENTURE MODE");
            player.sendMessage(ChatColor.BLUE.toString() + ChatColor.BOLD + "gm4 : " + " " + ChatColor.WHITE + "SPECTATOR MODE");
            player.sendMessage("");
            player.sendMessage("");
            player.sendMessage(ChatColor.DARK_AQUA + "Do You Like This Plugin ? See More In: \n" + ChatColor.WHITE + "https://solo.to/idok25");
            player.sendMessage(ChatColor.GOLD + "=====================================================");
        }
        return false;
    }
}
