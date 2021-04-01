package hahota.simon.fun.Simon.bungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

public class bungeeconsolereload extends Plugin implements Listener {

    @EventHandler (priority = EventPriority.HIGH)
    public void onReloadEvent(ChatEvent e) { // todo   NOT FINISHED
        String cmd = e.getMessage().split(" ")[0].replace("/", "").replaceAll("(?i)bungeecord:", "");
        if(cmd.equalsIgnoreCase("greload") || cmd.equalsIgnoreCase("greload")) {
            e.setCancelled(true);
            getLogger().info(ChatColor.RED + "I see you reloaded, let me help you with that!");
            getProxy();
            ProxyServer.getInstance().stop();

        }


    }
}
