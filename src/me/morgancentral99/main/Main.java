package me.morgancentral99.main;

import java.util.HashMap;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.morgancentral99.main.commands.ScheduleBroadcast;

public class Main extends JavaPlugin {
	
	Logger log = Bukkit.getLogger();
	String logPlugin = "[Prison RPG Suite]";

	
	@Override
	public void onEnable() {
	log.info(logPlugin + " Plugin Loaded");
	registerCommands();
	registerListeners();
	}
	
	@Override
	public void onDisable() {
		log.info(logPlugin + " Plugin Disabled!"); 
	}
	
	private void registerCommands() {
		getCommand("schedule").setExecutor(new ScheduleBroadcast());
		
	}
	
	private void registerListeners() {
		PluginManager pm = Bukkit.getPluginManager();
	}

}
