package me.morgancentral99.main;

import java.io.File;
import java.util.UUID;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class PlayerConfigs {
	

	UUID u;	
	File playerData = new File("plugins/players/" + u + ".yml");
	FileConfiguration PlayerDataConfig = YamlConfiguration.loadConfiguration(playerData);
	
	public PlayerConfigs(UUID u) {
		this.u = u;
	}
	
	public void createConfig() {
		
	}
	
	/*
	 * 	private void createConfig() {
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
	 */

}
