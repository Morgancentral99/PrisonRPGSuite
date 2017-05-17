package me.morgancentral99.main.prison;

import java.util.List;

import org.bukkit.entity.Player;

import me.morgancentral99.main.Main;

public class Players {
	
	Main m;
	
	public List<Player> players;
	
	public int initalNumber;
	public int Amount;

	
	public void onEnable() {
		initalNumber = m.getConfig().getInt("PlayerNumber");
		Amount = initalNumber;
	}
	
	public int getPlayerNumber(Player p) {
		return m.getPlayerConfig().getInt("PrisonerNumber");
	}
	public int createNewPrisonerNumber(Player p) {
		return Amount+1;
	}

	public int getPlayerNumber() {
		return Amount+1;
	}
	
	

}
