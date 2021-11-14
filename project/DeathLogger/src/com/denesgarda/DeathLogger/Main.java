package com.denesgarda.DeathLogger;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("DeathLogger has been enabled.");
    }

    @EventHandler
    public void logger(PlayerDeathEvent event) {
        event.getEntity().sendMessage(ChatColor.RED + "DEATH LOCATION: " + (int) event.getEntity().getLocation().getX() + " " + (int) event.getEntity().getLocation().getY() + " " + (int) event.getEntity().getLocation().getZ());
    }
}
