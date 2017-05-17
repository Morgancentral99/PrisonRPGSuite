package me.morgancentral99.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.morgancentral99.main.Main;
import me.morgancentral99.main.prison.Schedule;

public class TimerCommand implements CommandExecutor {
	
	Schedule sc;
	Main m;
	
	String Usage = "No Args";

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(args.length == 0) {
			s.sendMessage(Usage);
			return true;
		}
		if(args[0].equalsIgnoreCase("enable")) {
			if(args[1].length() == 0) {
				s.sendMessage(Usage);
				return true;
			}
			if(args[1].equalsIgnoreCase("On")) {
				Bukkit.broadcastMessage(m.Format("&6Schedule Module has been Enabled by &3" + s.getName()));
				s.sendMessage(m.Format("&6Schedule Module has been enabled!"));
				
				
			} else if(args[1].equalsIgnoreCase("Off")) {
				Bukkit.broadcastMessage(m.Format("&6Schedule Module Has been disabled by &3" + s.getName()));
				s.sendMessage(m.Format("&6Schedule Module has been disabled till server restart or untill /schedule on"));
				sc.cancel();
				
			}
			
		}
		return false;
	}
	
	
	
	

}
