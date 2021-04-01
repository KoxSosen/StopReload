package hahota.simon.fun.Simon.spigot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import static org.bukkit.Bukkit.getLogger;

public class reloadcommand implements Listener {


    @EventHandler (priority = EventPriority.HIGH)
    public void onReloadCommand(PlayerCommandPreprocessEvent e) {
        String cmd = e.getMessage().split(" ")[0].replace("/", "").replaceAll("(?i)bukkit:", "");
        if(cmd.equalsIgnoreCase("reload") || cmd.equalsIgnoreCase("rl")) {
            e.setCancelled(true);
            getLogger().info(ChatColor.RED + "I see you reloaded, let me help you with that!");
            Bukkit.shutdown();

        }


    }
}