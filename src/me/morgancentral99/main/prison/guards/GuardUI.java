package me.morgancentral99.main.prison.guards;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.morgancentral99.main.prison.Methods;
import net.md_5.bungee.api.ChatColor;

public class GuardUI {
	
	Methods md;
	
	ItemStack Exit = new ItemStack(Material.BARRIER);
	Inventory guardUI = Bukkit.createInventory(null, 54, ChatColor.GOLD + "Guard UI");
	
	public void openGuardUI() {
		//List<String> bow2 = new ArrayList<>90;
		//arrow.add(ChatColor.DARKPURPLE)
		//ItemMeta2(SSword, ChatColor.AQUA + "Stone Store", sslore)
		 md.ItemMeta2(Exit, "&4Exit");
		
		guardUI.setItem(8, Exit);
	
	}

}
