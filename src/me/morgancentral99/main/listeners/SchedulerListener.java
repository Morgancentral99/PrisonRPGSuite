package me.morgancentral99.main.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SchedulerListener implements Listener{
	
	@EventHandler
	public void scheduler(Scheduler e) {
		System.out.println(e.getPeriod());
	}

}
