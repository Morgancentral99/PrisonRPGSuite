package me.morgancentral99.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TimerCommand implements CommandExecutor {
	
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
				
			}
			
		}
		return false;
	}
	
	
	
	

}
