package me.morgancentral99.main.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.morgancentral99.main.Main;
import me.morgancentral99.main.prison.Players;

public class OnJoinLeave implements Listener {
	
	Players ps;
	Main m;
	
	public int playerNumber;
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		if(!event.getPlayer().hasPlayedBefore()) {
			event.setJoinMessage(m.Format("&6" + event.getPlayer().getDisplayName() + "&8Joined as Inmate Number: &6" + ps.getPlayerNumber()));
		}
		event.setJoinMessage(m.Format(""));
		
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event) {
		
	}

}
