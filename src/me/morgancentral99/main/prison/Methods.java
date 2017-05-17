package me.morgancentral99.main.prison;

import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.morgancentral99.main.Main;

public class Methods {
	Main m;
	public void ItemMeta2(ItemStack i, String name, List<String> lore) {
		ItemMeta Meta = i.getItemMeta();
		Meta.setDisplayName(m.Format(name));
		Meta.setLore(lore);
		i.setItemMeta(Meta);
	}
	
	public void ItemMeta2(ItemStack i, String name) {
		ItemMeta Meta = i.getItemMeta();
		Meta.setDisplayName(m.Format(name));
		i.setItemMeta(Meta);
    }


}
