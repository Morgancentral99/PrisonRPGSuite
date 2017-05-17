package me.morgancentral99.main.prison;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitScheduler;

import me.morgancentral99.main.Main;


public class Schedule {
	
	Main m;
	int taskId;
	int taskid2;
	int Time;
	int Days;
	String Period;
	int PeriodLeft;
	
	
	public HashMap<String, String> Times = new HashMap<>();
	
	public enum schedule {
		EAT, WORK, SLEEP, FREETIME, YARD
	}
	
	public boolean enabled = true;
	
	
	
	public void runTimer() {
		taskId = m.getServer().getScheduler().scheduleSyncRepeatingTask(m, new Runnable() {
			/*
			 * 4 Minute Sleep 240
			 * 2 Minute Eat 120
			 * 6 Minute Work 360
			 * 4 Minute FreeTime/Work 240
			 * 2 Minute Eat 120 --
			 * 4 Minute Work 240 --
			 * 4 Minute FreeTime/Work 240 -- 
			 * 2 Minute Eat 120
			 * 2 Minute Work/Freetime
			 */
			
			@Override
			public void run() {
				if(Time == 2400) {
					
					Bukkit.broadcastMessage(m.Format("&6New Day, &3Day Number: " + Days));
					Bukkit.broadcastMessage(m.Format("Current Period: SLEEP 4 Minutes"));
					CountDown(240);
					Time--;
					Days++;
				}
				if(Time == 1680) {
					CountDown(120);
					Bukkit.broadcastMessage(m.Format("&6Breakfast Time Report to the Canteen 2 Minutes"));
					Period = "Breakfast";
					Time--;
				} else if(Time == 1560) {
					CountDown(360);
					Bukkit.broadcastMessage(m.Format("&6Work Time 6 Minutes"));
					Period = "Work1";
					Time--;
				} else if(Time == 1440) {
					CountDown(240);
					Bukkit.broadcastMessage(m.Format("FreeTime/Work 4 Minutes"));
					Period = "FreeWork1";
					Time--;
				} else if(Time == 1200) {
					CountDown(120);
					Bukkit.broadcastMessage(m.Format("&6Lunch Time Report to the Canteen 2 Minutes"));
					Period = "Lunch";
					Time--;
				} else if (Time == 960) {
					CountDown(240);
					Bukkit.broadcastMessage(m.Format("Work 4 Minutes"));
					Period = "Work2";
					Time--;
				} else if (Time == 720) {
					CountDown(240);
					Bukkit.broadcastMessage(m.Format("FreeTime/Work 4 Minutes"));
					Period = "FreeWork2";
					Time--;
				} else if(Time == 360) {
					CountDown(120);
					Bukkit.broadcastMessage(m.Format("&6Dinner Time Report to the Canteen 2 Minutes"));
					Period = "Dinner";
					Time--;
				} else if(Time == 240) {
					CountDown(240);
					Bukkit.broadcastMessage(m.Format("FreeTime/Work 4 Minutes"));
					Period = "FreeWork3";
					Time--;
				}

				else if(Time == 0) {
					restartTimer();
					
					Time--;
				}
				Time--;
			}
		}, 0, 20);
	}
	
	public void cancel() {
		cancelCountDown();
		cancelMainSchedule();
	}
	
	public void cancelMainSchedule() {
	m.getServer().getScheduler().cancelTask(taskId);	
	}
	
	public void restartTimer() {
		this.Time = 0;
		World w = Bukkit.getWorld("world");
		w.setTime(0);
		int old = Days;
		Days = old + 1;
	}


	public void onEnable() {
		Days = m.getConfig().getInt("Day");
		
	}
	
	public String getDay() {
		String Day = String.valueOf(Days);
		return Day;
	}
	
	public HashMap<String, String> getTimes() {
		String Day;
		Day = String.valueOf(Days);
		int i = Time;
		int ms = i / 60;
		int ss = i % 60;
		String m = (ms < 10 ? "0": "") + ms;
		String s = (ss< 10? "0" : "") + ss;
		Times.put("Min", m);
		Times.put("Sec", s);
		Times.put("MS", Day);
		return Times;
	}
	
	
	public String getFormatedTime() {
		int i = Time;
		int ms = i / 60;
		int ss = i % 60;
		String m = (ms < 10 ? "0": "") + ms;
		String s = (ss< 10? "0" : "") + ss;
		String f = m + ":" + s;
		return f;
		
	}
	
	public void CountDown(int Time) {
		PeriodLeft = Time;
		taskid2 = m.getServer().getScheduler().scheduleSyncRepeatingTask(m, new Runnable() {
			
			@Override
			public void run() {
				PeriodLeft--;
			}
		}, 0, 20);
	}
	
	public void cancelCountDown() {
		Bukkit.getScheduler().cancelTask(taskid2);
	}
	
	public void resetTime() {
		Time = 0;
		PeriodLeft = 0;
		runTimer();
	}

}
