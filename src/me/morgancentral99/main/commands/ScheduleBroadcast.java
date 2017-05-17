package me.morgancentral99.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.morgancentral99.main.prison.Broadcast;
import net.md_5.bungee.api.ChatColor;

public class ScheduleBroadcast implements CommandExecutor {
	
	Broadcast b;

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(args.length == 0) {
			s.sendMessage("Not enough args /schedule <message>");
			
		}
		b.broadcastMessage("&6Schedule Info &7>>", args);
		return false;
		
	}
	
	

}
