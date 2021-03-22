package hahota.simon.fun.Simon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

import static org.bukkit.Bukkit.getLogger;

public class consolereload implements Listener {

    @EventHandler (priority = EventPriority.HIGH)
    public void onServerCommand(ServerCommandEvent event) {

        if (event.getCommand().equalsIgnoreCase("reload")) {
                event.setCancelled(true);
                getLogger().info(ChatColor.RED + "I see you reloaded, let me help you with that!");
                Bukkit.shutdown();
            }
        }
}
