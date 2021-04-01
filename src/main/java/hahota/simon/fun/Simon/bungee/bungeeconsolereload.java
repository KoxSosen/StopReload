package hahota.simon.fun.Simon.bungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.event.ProxyReloadEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.command.PlayerCommand;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

public class bungeeconsolereload extends Plugin implements Listener {

    @EventHandler (priority = EventPriority.HIGH)
    public void onReloadEvent() { // todo   NOT FINISHED
        getLogger().info(ChatColor.RED + "I see you reloaded, let me help you with that!");
        getProxy().stop();




    }
}
