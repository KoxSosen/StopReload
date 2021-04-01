package hahota.simon.fun.Simon.bungee;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;

@SuppressWarnings("unused")
public class stopreloadbungee extends Plugin {

    @Override
    public void onEnable () {
        getLogger().info(ChatColor.GREEN + "You are now safe from reloading!");

    }
    
    @Override
    public void onDisable () {

    }

}
