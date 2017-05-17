package me.morgancentral99.main;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.morgancentral99.main.commands.ScheduleBroadcast;
import me.morgancentral99.main.prison.Players;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	UUID u;
	Logger log = Bukkit.getLogger();
	String logPlugin = "[Prison RPG Suite]";
	FileConfiguration config = getConfig();
	FileConfiguration PlayerDataConfig;
	File file;
	File playerData;
	Players ps;

	
	@Override
	public void onEnable() {
	log.info(logPlugin + " Plugin Loaded");
	registerCommands();
	registerListeners();
	createConfig();
	ps.onEnable();
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
	
	public String Format(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	
	private void createConfig() {
		playerData = new File("plugins/YourPlugin/Custom Currency/" + u + ".yml");
        PlayerDataConfig = YamlConfiguration.loadConfiguration(playerData);
		if(!(file.exists())) {
			
		}
		file.mkdirs();
		config.addDefault("PlayerNumber", 0);
		config.options().copyDefaults(true);
		saveConfig();

	}
	//Starts Player Files
	
	public void createConfig2() {
		try {
			playerData.createNewFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void createPlayerDefaults() {
		if(playerData.length() <= 0) {
			PlayerDataConfig.set("PrisonNumber", ps.getPlayerNumber());
		}
	}
	
	public FileConfiguration getPlayerConfig() {
        return PlayerDataConfig;
    }
	
	
	public FileConfiguration getPlayerData() {
		return PlayerDataConfig;
	}

}


