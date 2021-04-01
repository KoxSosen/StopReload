package hahota.simon.fun.Simon.bungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Event;
import net.md_5.bungee.api.plugin.Plugin;

@SuppressWarnings("unused")
public class stopreloadbungee extends Plugin {

    @Override
    public void onEnable () {
        getProxy().getPluginManager().registerListener(this, new bungeeconsolereload());
        getProxy().getPluginManager().registerListener(this, new bungeeconsolereload());
        getLogger().info(ChatColor.GREEN + "You are now safe from reloading!");

    }
    
    @Override
    public void onDisable () {

    }

}
