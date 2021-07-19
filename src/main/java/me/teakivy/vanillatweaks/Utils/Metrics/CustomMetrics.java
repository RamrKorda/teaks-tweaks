package me.teakivy.vanillatweaks.Utils.Metrics;

import me.teakivy.vanillatweaks.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class CustomMetrics {

    static Main main = Main.getPlugin(Main.class);

    public static void registerCustomMetrics(Metrics metrics) {
        registerPackMetrics(metrics);
        registerCraftingTweaksMetrics(metrics);
        registerCommandMetrics(metrics);
    }

    public static void registerPackMetrics(Metrics metrics) {
        metrics.addCustomChart(new Metrics.AdvancedPie("packs", new Callable<Map<String, Integer>>() {
            @Override
            public Map<String, Integer> call() throws Exception {
                Map<String, Integer> valueMap = new HashMap<>();
                valueMap.put("Unlock All Recipes", getPack("unlock-all-recipes"));
                valueMap.put("AFK Display", getPack("afk-display"));
                valueMap.put("Multiplayer Sleep", getPack("multiplayer-sleep"));
                valueMap.put("Durability Ping", getPack("durability-ping"));
                valueMap.put("Cauldron Concrete", getPack("cauldron-concrete"));
                valueMap.put("Nether Portal Coords", getPack("nether-portal-coords"));
                valueMap.put("Coords HUD", getPack("coords-hud"));
                valueMap.put("Real Time Clock", getPack("real-time-clock"));

                valueMap.put("Player Head Drops", getPack("player-head-drops"));

                valueMap.put("Anti Creeper Grief", getPack("anti-creeper-grief"));
                valueMap.put("Anti Enderman Grief", getPack("anti-enderman-grief"));
                valueMap.put("Anti Ghast Grief", getPack("anti-ghast-grief"));
                valueMap.put("Double Shulker Shells", getPack("double-shulker-shells"));
                valueMap.put("Dragon Drops", getPack("dragon-drops"));
                valueMap.put("More Mob Heads", getPack("more-mob-heads"));
                valueMap.put("Silence Mobs", getPack("silence-mobs"));
                valueMap.put("Count Mob Deaths", getPack("count-mob-deaths"));
                valueMap.put("Villager Death Messages", getPack("villager-death-messages"));
                valueMap.put("Larger Phantoms", getPack("larger-phantoms"));

                valueMap.put("Spawn", getPack("spawn"));
                valueMap.put("Homes", getPack("homes"));
                valueMap.put("TPA", getPack("tpa"));
                valueMap.put("Back", getPack("back"));

                valueMap.put("Spectator Night Vision", getPack("spectator-night-vision"));
                valueMap.put("Spectator Conduit Power", getPack("spectator-conduit-power"));
                valueMap.put("Kill Boats", getPack("kill-boats"));

                valueMap.put("Wandering Trades", getPack("wandering-trades"));
                valueMap.put("Tag", getPack("tag"));
                valueMap.put("Thunder Shrine", getPack("thunder-shrine"));

                valueMap.put("XP Management", getPack("xp-management"));
                valueMap.put("Confetti Creepers", getPack("confetti-creepers"));
                return valueMap;
            }
        }));
    }

    public static int getPack(String pack) {
        if (main.getConfig().getBoolean("packs." + pack + ".enabled")) return 1;
        return 0;
    }

    public static void registerCraftingTweaksMetrics(Metrics metrics) {
        metrics.addCustomChart(new Metrics.AdvancedPie("crafting_tweaks", new Callable<Map<String, Integer>>() {
            @Override
            public Map<String, Integer> call() throws Exception {
                Map<String, Integer> valueMap = new HashMap<>();
                valueMap.put("Back To Blocks", getCraftingTweak("back-to-blocks"));
                valueMap.put("Double Slabs", getCraftingTweak("double-slabs"));
                valueMap.put("Dropper To Dispenser", getCraftingTweak("dropper-to-dispenser"));
                valueMap.put("Rotten Flesh To Leather", getCraftingTweak("rotten-flesh-to-leather"));
                valueMap.put("Charcoal To Black Dye", getCraftingTweak("charcoal-to-black-dye"));
                valueMap.put("Coal To Black Dye", getCraftingTweak("coal-to-black-dye"));
                valueMap.put("Sandstone Dyeing", getCraftingTweak("sandstone-dyeing"));
                valueMap.put("Universal Dyeing", getCraftingTweak("universal-dyeing"));
                valueMap.put("Straight To Shapeless", getCraftingTweak("straight-to-shapeless"));
                valueMap.put("Blackstone Cobblestone", getCraftingTweak("blackstone-cobblestone"));
                valueMap.put("Powder To Glass", getCraftingTweak("powder-to-glass"));
                valueMap.put("More Trapdoors", getCraftingTweak("more-trapdoors"));
                valueMap.put("More Bark", getCraftingTweak("more-bark"));
                valueMap.put("More Stairs", getCraftingTweak("more-stairs"));
                valueMap.put("More Bricks", getCraftingTweak("more-bricks"));
                valueMap.put("Craftable Gravel", getCraftingTweak("craftable-gravel"));
                valueMap.put("Craftable Horse Armor", getCraftingTweak("craftable-horse-armor"));
                valueMap.put("Craftable Coral Blocks 2x2", getCraftingTweak("craftable-coral-blocks-2x2"));
                valueMap.put("Craftable Coral Blocks 3x3", getCraftingTweak("craftable-coral-blocks-3x3"));
                valueMap.put("Craftable Enchanted Golden Apples", getCraftingTweak("craftable-enchanted-golden-apples"));
                valueMap.put("Craftable Name Tags", getCraftingTweak("craftable-name-tags"));
                valueMap.put("Craftable Bundles Rabbit Hide", getCraftingTweak("craftable-bundles-rabbit-hide"));
                valueMap.put("Craftable Bundles Leather", getCraftingTweak("craftable-bundles-leather"));
                valueMap.put("Craftable Blackstone", getCraftingTweak("craftable-blackstone"));
                valueMap.put("Unpackable Ice", getCraftingTweak("unpackable-ice"));
                valueMap.put("Unpackable Nether Wart", getCraftingTweak("unpackable-nether-wart"));
                valueMap.put("Unpackable Wool", getCraftingTweak("unpackable-wool"));
                return valueMap;
            }
        }));
    }

    public static int getCraftingTweak(String tweak) {
        if (main.getConfig().getBoolean("crafting-tweaks." + tweak + ".enabled")) return 1;
        return 0;
    }

    public static void registerCommandMetrics(Metrics metrics) {
        metrics.addCustomChart(new Metrics.AdvancedPie("commands", new Callable<Map<String, Integer>>() {
            @Override
            public Map<String, Integer> call() throws Exception {
                Map<String, Integer> valueMap = new HashMap<>();
                valueMap.put("Test", getCommand("test"));
                valueMap.put("Portal", getCommand("portal"));
                valueMap.put("Coords HUD", getCommand("coordshud"));
                valueMap.put("Night Vision", getCommand("nightvision"));
                valueMap.put("Conduit Power", getCommand("conduitpower"));
                valueMap.put("Kill Boats", getCommand("killboat"));
                valueMap.put("Real Time", getCommand("realtime"));
                valueMap.put("Spawn", getCommand("spawn"));
                valueMap.put("TPA", getCommand("tpa"));
                valueMap.put("Home", getCommand("home"));
                valueMap.put("DuraPing", getCommand("duraping"));
                valueMap.put("Tag", getCommand("tag"));
                valueMap.put("Back", getCommand("back"));
                valueMap.put("AFK", getCommand("afk"));
                valueMap.put("Shrine", getCommand("shrine"));
                return valueMap;
            }
        }));
    }

    public static int getCommand(String cmd) {
        if (main.getConfig().getBoolean("commands." + cmd + ".enabled")) return 1;
        return 0;
    }

}