package me;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class template extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Template plugin has been enabled!");

        // Register command (alternatively can be done in plugin.yml)
        getCommand("template").setExecutor(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Template plugin has been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("template")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                countToFive(player);
                return true;
            } else {
                sender.sendMessage("This command can only be executed by a player.");
                return true;
            }
        }
        return false;
    }

    private Component getPrefix() {
        return Component.text("[", NamedTextColor.GRAY)
                .append(Component.text("TEMPLATE", NamedTextColor.DARK_RED).decoration(TextDecoration.BOLD, true))
                .append(Component.text("]", NamedTextColor.GRAY))
                .append(Component.text(" ", NamedTextColor.WHITE));
    }

    private void countToFive(Player player) {
        new BukkitRunnable() {
            int count = 1;

            @Override
            public void run() {
                if (count <= 5) {
                    Component message = getPrefix()
                            .append(Component.text(count + "", NamedTextColor.WHITE));
                    player.sendMessage(message);
                    count++;
                } else {
                    this.cancel();
                }
            }
        }.runTaskTimer(this, 0L, 20L); // Run every second (20 ticks)
    }
}
