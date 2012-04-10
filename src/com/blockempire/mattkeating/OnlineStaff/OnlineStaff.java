package com.blockempire.mattkeating.OnlineStaff;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.configuration.file.FileConfiguration;

public class OnlineStaff extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");

	public void onEnable() {
		log.info("OnlineStaff Enabled - mattkeating");
	}
	
	public void onDisable() {
		log.info("OnlineStaff Disabled - mattkeating");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("staff")) {
					
			
			
			
			
	        return true;
		}
		
		
		return false;
	}
	
}
