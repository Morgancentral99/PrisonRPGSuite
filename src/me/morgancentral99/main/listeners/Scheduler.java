package me.morgancentral99.main.listeners;

import java.util.HashMap;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.morgancentral99.main.prison.Schedule;

public class Scheduler extends Event{
	Schedule sc;
	private static final HandlerList handlers = new HandlerList();
	
	public HandlerList getHandlers() {
		return handlers;
		
	}
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	public Scheduler() {
		
	}
	
	public String getPeriod() {
		return sc.getDay();
	}
	
	public HashMap<String, String> getTimeLeft() {
		return sc.Times;
	}

}
