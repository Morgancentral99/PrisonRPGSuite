package me.morgancentral99.main.prison;

import org.bukkit.Bukkit;

import net.md_5.bungee.api.ChatColor;

public class Broadcast {
	
	public void broadcastMessage(String Announcer, String[] args) {
		String Msg = "";
		
		for(String a : args) {
			Msg += a+ " ";
		}
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', Announcer + "" + Msg));
	}

}
