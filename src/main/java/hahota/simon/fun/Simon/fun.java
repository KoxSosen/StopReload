package hahota.simon.fun.Simon;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class fun extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.GREEN + "You are now safe from reloading!");
        getServer().getPluginManager().registerEvents(new consolereload(), this);
        getServer().getPluginManager().registerEvents(new reloadcommand(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
