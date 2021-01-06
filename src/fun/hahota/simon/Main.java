package fun.hahota.simon;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		// This plugin is always acive grrr
		getLogger().info(ChatColor.GREEN + "You are now safe from reloading!");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		
		
	}

	@EventHandler
	public void onReloadCommand(PlayerCommandPreprocessEvent e) {
	    String cmd = e.getMessage().split(" ")[0].replace("/", "").replaceAll("(?i)bukkit:", "");
	    if(cmd.equalsIgnoreCase("reload") || cmd.equalsIgnoreCase("rl")) {
	        e.setCancelled(true);
	        Bukkit.shutdown();
	        e.getPlayer().sendMessage("Server reloaded");
	    }
	}
}
