package rilyabyss.potionstacks;

import org.bukkit.plugin.java.JavaPlugin;
import rilyabyss.potionstacks.command.PotionStacksCommand;

public final class PotionStacks extends JavaPlugin {

    private static PotionStacks plugin;

    @Override
    public void onEnable() {
        plugin = this;

        getCommand("ptn").setExecutor(new PotionStacksCommand());

        getServer().getLogger().info("§aプラグインが有効になりました");
    }

    public PotionStacks getPlugin() {
        return plugin;
    }
}
