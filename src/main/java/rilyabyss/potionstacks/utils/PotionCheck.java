package rilyabyss.potionstacks.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PotionCheck {

    public static boolean isPotion(Player p) {

        if (p.getInventory().getItemInMainHand() == null) return false;

        ItemStack haveItem = p.getInventory().getItemInMainHand();

        if (haveItem.getType() == Material.POTION) {
            return true;
        } else {
            return false;
        }
    }

}
