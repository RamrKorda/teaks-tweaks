package me.teakivy.teakstweaks.Packs.TeaksTweaks.LecternReset;

import me.teakivy.teakstweaks.Packs.BasePack;
import org.bukkit.block.Lectern;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.LecternInventory;

public class LecternReset extends BasePack {

    public LecternReset() {
        super("Lectern Reset", "lectern-reset");
    }

    @EventHandler
    public void onLectern(InventoryCloseEvent event) {
        if (event.getInventory().getType() != InventoryType.LECTERN) return;

        LecternInventory lecternInv = (LecternInventory) event.getInventory();
        Lectern lectern = lecternInv.getHolder();

        if (lectern == null) return;
        if (lecternInv.getViewers().size() != 1) return;

        lectern.setPage(0);
        lectern.update();
    }

}
