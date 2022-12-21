package rilyabyss.potionstacks.manager;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PotionStacksManager {

    private Player p;
    private ItemMeta ptn;
    private int ptnNum = 0;
    private int handNum;
    final private int inventorySize = 35;

    public PotionStacksManager(Player p) {
        this.p = p;
        this.ptn = p.getInventory().getItemInMainHand().getItemMeta();
        this.handNum = p.getInventory().getHeldItemSlot();
    }

    public void clearPotion() {
        for (int i = 0; i <= inventorySize; i++) {
            if (p.getInventory().getItem(i) == null) continue;

            if (p.getInventory().getItem(i).getItemMeta().equals(ptn)) {
                p.getInventory().clear(i);
                ptnNum++;
            }
        }
    }

    public void stackPotion() {
        clearPotion();

        ItemStack items = new ItemStack(Material.POTION, ptnNum);
        items.setItemMeta(ptn);

        p.getInventory().setItem(handNum, items);

    }

}
