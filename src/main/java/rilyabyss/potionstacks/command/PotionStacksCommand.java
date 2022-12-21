package rilyabyss.potionstacks.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import rilyabyss.potionstacks.manager.PotionStacksManager;
import rilyabyss.potionstacks.utils.Chat;
import rilyabyss.potionstacks.utils.PotionCheck;

public class PotionStacksCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(Chat.send("§cこのコマンドはプレイヤーのみ実行することができます"));
            return true;
        }

        Player p = (Player) sender;

        if (!PotionCheck.isPotion(p)) {
            p.sendMessage(Chat.send("§cあなたは、ポーションを持っていません"));
            return true;
        }

        PotionStacksManager ptn = new PotionStacksManager(p);

        ptn.stackPotion();

        return true;
    }
}
